/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import modelo.Almacen;
import modelo.productos.Producto;
import modelo.usuarios.Empleado;
import vista.KeyboardInput;

        
/**
 * Clase Caja donde se realizan las acciones de cobrar y crear el ticket al momento de realizar una venta
 * @author Equipo D
 */
public class Caja {
    
    /**
     * Constructor vacío de la clase Caja
     */
    public Caja() {
    }
    
    /**
     * Metodo cobrar donde es necesario un ArrayList no vacio y una cantidad de pago mayor al precio total de los productos para realizar una operacion exitosa
     * @param carritoCompras Arreglo de datos de tipo Producto y/o heredados que contienen todos los elementos que seran vendidos
     * @param empleadoActual Objeto que puede ser de clase Gerente, Vendedor o Acomodador y representa el empleado con sesion abierta actual
     * @param almacen Un objeto de Clase almacen que contiene todo el inventario de los productos
     */
    public void cobrar(ArrayList<Producto> carritoCompras, Empleado empleadoActual, Almacen almacen){
        if(carritoCompras.isEmpty()){
            System.out.println("Carrito de compras vacio");
        }else{
            int cantidadRecibida, cantidadPagar = 0;
            KeyboardInput input = new KeyboardInput();

            for (int k=0; k < carritoCompras.size(); k++){
                cantidadPagar = cantidadPagar+carritoCompras.get(k).getPrecio();
            }
            System.out.println("\nTotal a pagar: "+ cantidadPagar);
            System.out.println("Cantidad recibida: ");
            cantidadRecibida = input.readInteger();

            if(cantidadRecibida<cantidadPagar){
                System.out.println("Cantidad insuficiente");
                for(int k=0;k<carritoCompras.size();k++)
                    almacen.inventario.add(carritoCompras.get(k));
            }else{
                System.out.println("Cambio a devolver: "+(cantidadRecibida-cantidadPagar));
                crearArchivoTicket(carritoCompras, empleadoActual, cantidadRecibida, cantidadPagar);
            }
        }
    }
    
    /**
     * Metodo que crea un archivo de salida que representa un ticket de una transaccion exitosa del metodo cobrar de esta misma clase
     * @param carritoCompras Arreglo de datos de tipo Producto y heredados que contienen todos los elementos que seran vendidos
     * @param empleadoActual Objeto que puede ser de clase Gerente, Vendedor o Acomodador y representa el empleado con sesion abierta actual
     * @param cantidadRecibida Dato tipo entero que representa la cantidad con la que el cliente va a pagar
     * @param cantidadPagar Dato tipo entero que representa el precio total a pagar de todos los productos del carrito de compras
     */
    public void crearArchivoTicket(ArrayList<Producto> carritoCompras, Empleado empleadoActual, int cantidadRecibida, int cantidadPagar){
        try {
            //prueba crear un archivo (ticket) que tendra como nombre la fecha y hora en la que se cree
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
            String fecha = hourdateFormat.format(date);
            String ruta = "tickets/"+fecha+".txt";
            File file = new File(ruta);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            try (BufferedWriter ticket = new BufferedWriter(fileWriter)) {
                ticket.write("Atendio: "+empleadoActual.getNombre()+"\n");
                ticket.write(empleadoActual.toString()+"\n");
                ticket.write(fecha+"\n\n");
                ticket.write("Detalles del producto:\n\n");
                for (int k=0; k < carritoCompras.size(); k++)
                    ticket.write(carritoCompras.get(k).toString()+"\n\n");
                ticket.write("Pago: "+cantidadRecibida+"\n");
                ticket.write("Cambio: "+(cantidadRecibida-cantidadPagar));
                ticket.close();
                fileWriter.close();
                System.out.println("Archivo de ticket creado con exito en: "+ruta);
            }
            try{
                BufferedReader ticket;
                try (FileReader fileReader = new FileReader(ruta)) {
                    ticket = new BufferedReader(fileReader);
                    System.out.println("Datos del ticket: \n");
                    String linea = ticket.readLine();
                    while(linea != null){
                        System.out.println(linea);
                        linea = ticket.readLine();
                    }
                }
                ticket.close();
            }catch(IOException ioe3){System.out.println("Error al leer el archivo de ticket");}
        } catch (IOException ex) {
            System.out.println("Error al crear ticket");
        }
    }
}

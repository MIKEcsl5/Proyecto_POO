/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.caja;

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
 *
 * @author Equipo D
 */
public class Caja {
    
    public Caja() {
    }
    
    public void cobrar(ArrayList<Producto> carritoCompras, Empleado empleadoActual, Almacen almacen){
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
            }catch(IOException ioe3){}
            
            
        } catch (IOException ex) {
            System.out.println("Error al crear ticket");
        }
    }
}

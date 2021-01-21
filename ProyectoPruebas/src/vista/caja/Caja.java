/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.caja;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.productos.Producto;
import modelo.usuarios.Empleado;

        
/**
 *
 * @author Equipo D
 */
public class Caja {
    
    public Caja() {
    }
    
    public void cobrar(Producto producto){
        int precio = producto.getPrecio(); 
        System.out.println("\nTotal a pagar: "+ precio);
    }
    
    public void crearArchivoTicket(Producto producto, Empleado empleadoActual){
        try {
            //prueba crear un archivo (ticket) que tendra como nombre la fecha y hora en la que se cree
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
            String fecha = hourdateFormat.format(date);
           
            Ticket nuevoTicket = new Ticket(producto, fecha);
            String ruta = "tickets/"+producto.getNombre()+" "+nuevoTicket.getFecha()+".txt";
            File file = new File(ruta);
            System.out.println(ruta);
            file.createNewFile();
            
            FileWriter fileWriter = new FileWriter(file);
            try (BufferedWriter ticket = new BufferedWriter(fileWriter)) {
                ticket.write("Atendio: "+empleadoActual.getNombre()+"\n");
                ticket.write(fecha+"\n");
                ticket.write(producto.toString());
            }
            System.out.println("Archivo de ticket creado con exito :3");
            
        } catch (IOException ex) {
            System.out.println("Error al crear ticket");
        }
    }
}

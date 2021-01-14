/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.caja;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.productos.Producto;

        
/**
 *
 * @author socce
 */
public class Caja {
    
    public Caja() {
    }
    
    public void cobrar(Producto producto) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        int precio = producto.getPrecio(); 
        System.out.println("Total a pagar: "+ precio);
    }
    
    public void crearArchivoTicket(Producto producto){
        //prueba crear un archivo (ticket) que tendra como nombre la fecha y hora en la que se cree
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
        String fecha = hourdateFormat.format(date);
       
                    
        Ticket nuevoTicket = new Ticket(producto, fecha);
        String ruta = "tickets/"+nuevoTicket.fecha.toString()+".txt";
        String contenido = "Contenido de ejemplo";
        File file = new File(ruta);                
    

    }
}

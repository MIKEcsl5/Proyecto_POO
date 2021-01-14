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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        try {
            //prueba crear un archivo (ticket) que tendra como nombre la fecha y hora en la que se cree
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
            String fecha = hourdateFormat.format(date);
            
            
            Ticket nuevoTicket = new Ticket(producto, fecha);
            String ruta = new String("tickets/"+nuevoTicket.getFecha()+".txt");
            File file = new File(ruta);
            System.out.println(ruta);
            file.createNewFile();
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(producto.getClass().toString());
            bw.close();
            System.out.println("Archivo de ticket creado con exito :3");
            
        } catch (IOException ex) {
            System.out.println("Error al crear ticket");;
        }
    }
}

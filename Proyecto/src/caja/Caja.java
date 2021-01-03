/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

        
/**
 *
 * @author socce
 */
public class Caja {
    Object producto;
    
    public Caja() {
    }
    
    public void cobrar(Object producto) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        //como esta funcion recibe un objeto de clase no es pecificada no es posible usar metodos tradicionales para acceder a sus atributos y metodos
        //usando java.lang.reflect.Method; es posible "bascar si existe el metodo en el objetivo recibido y si si existe se invoca
        //Method [] metodos = objeto.class.getMethods(); 
        Method getPrecio = producto.getClass().getMethod("getPrecio");//creando un objeto Metodo buscando el metodo "getPrecio" del objeto recivido (producto)
        System.out.println("Total a pagar: "+ getPrecio.invoke(producto));//invocando el metodo al objeto recibido
    }
    
    public void crearArchivoTicket(Object Producto){
        //prueba crear un archivo (ticket) que tendra como nombre la fecha y hora en la que se cree
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
        String fecha = hourdateFormat.format(date);
       
                    
        Ticket nuevoTicket = new Ticket(producto, fecha);
        try {
            String ruta = "tickets/"+nuevoTicket.fecha.toString()+".txt";
            String contenido = "Contenido de ejemplo";
            File file = new File(ruta);
                        
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
            System.out.println("Archivo creado con exito :3");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

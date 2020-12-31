/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author socce
 */
public class Caja {

    public Caja() {
    }
    
    public static void crearArchivoTicket(Object fecha){
        Ticket nuevoTicket = new Ticket(fecha);
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

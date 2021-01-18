/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import modelo.usuarios.Gerente;

/**
 * Clase Serializador que codifica un objeto para ser guardado en un dispositivo de almacenamiento
 * @author Equipo D
 */
public class CrearUsuario {
    /**
     * Constructo que al ser invocado crea un objeto de la clase Date y lo serializa
     * @param usuario
     * @param user
     */
    public CrearUsuario(String usuario, Gerente user) {
        try{
            FileOutputStream archivoDeSalida = new FileOutputStream("usuarios/"+usuario+".txt");
            try (ObjectOutputStream objetoDeSalida = new ObjectOutputStream(archivoDeSalida)) {
                objetoDeSalida.writeObject(user);
            }
        }catch(IOException ioe){}
    }
        
}

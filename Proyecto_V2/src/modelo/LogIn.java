/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import modelo.usuarios.*;

/**
 *
 * @author line_
 */
public class LogIn {
    
    public LogIn(String usuario, String password) {
        Empleado tmpEmpleado = null;
        
        try{
            FileInputStream archivoDeEntrada = new FileInputStream("usuarios/pruebaNombre.txt");
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoDeEntrada);
                System.out.println("1");
                tmpEmpleado = (Empleado) objetoEntrada.readObject();
         
                System.out.println(tmpEmpleado.getNombre());
                System.out.println("1");
                
        }catch(IOException e){
        }catch (ClassNotFoundException ex) {}
        
        
       
    }
}

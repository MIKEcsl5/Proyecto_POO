/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import java.util.ArrayList;
import java.util.Iterator;
import modelo.productos.*;
import modelo.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import vista.KeyboardInput;

/**
 *
 * @author Equipo D
 */
public class Gerente extends Vendedor  {

    public Gerente(){
        super.setPinAcceso("2390"); //PIN de accesos por defecto para un objeto de la clase Gerente
    }
    
    public Gerente(String nombre, String numEmpleado) {
        super(nombre, numEmpleado);
    }

    public Gerente(String nombre, String numEmpleado, String pass) {
        super(nombre, numEmpleado, pass);
        super.setPinAcceso(pass);
    }
    
    public void imprimirListaInventario(ArrayList<Producto> inventario){
        Iterator iterador = inventario.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
    
    public void agregarProducto (Almacen almacen){
        almacen.agregarProducto();
    }
    
    public void editarProducto (ArrayList<Producto> inventario){
        
    }
    public void crearUsuario(){
        int opcion = 0;
        KeyboardInput entrada = new KeyboardInput();
        String usuario, password, numEmpleado;
        BufferedReader datos;
        System.out.println("\n¿Con que perfil quiere iniciar sesion?\n 1)Gerente\n 2)Vendedor\n 3)Acomodador");
        opcion = entrada.readInteger();
        switch(opcion){
            
            case 1:
                try{
                    datos = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Escriba Nombre de usuario: ");
                    usuario = datos.readLine();
                    File comprobarUsuario = new File("usuarios/"+usuario+".txt");
                    if(!comprobarUsuario.exists()){
                        FileWriter fileWriter = new FileWriter("usuarios/"+usuario+".txt");
                        BufferedWriter bufferedWritter = new BufferedWriter(fileWriter);
                        PrintWriter nuevoUsuario = new PrintWriter(bufferedWritter);
                        System.out.println("Ingrese nueva contraseña: ");
                        password = datos.readLine();
                        System.out.println("Ingrese numero de empleado: ");
                        numEmpleado = datos.readLine();
                        nuevoUsuario.println(usuario);
                        nuevoUsuario.println(password);
                        nuevoUsuario.println("Gerente");
                        nuevoUsuario.println(numEmpleado);
                        nuevoUsuario.close();
                        bufferedWritter.close();
                        fileWriter.close();
                    }else{
                        System.out.println("Nombre de usuario ya existe");  
                    }
                }catch(IOException ioe2){System.out.println("Error al intetar crear usuario");}
                break;
            case 2:
                try{
                    datos = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Escriba Nombre de usuario: ");
                    usuario = datos.readLine();
                    File comprobarUsuario = new File("usuarios/"+usuario+".txt");
                    if(!comprobarUsuario.exists()){
                        FileWriter fileWriter = new FileWriter("usuarios/"+usuario+".txt");
                        BufferedWriter bufferedWritter = new BufferedWriter(fileWriter);
                        PrintWriter nuevoUsuario = new PrintWriter(bufferedWritter);
                        System.out.println("Ingrese nueva contraseña: ");
                        password = datos.readLine();
                        System.out.println("Ingrese numero de empleado: ");
                        numEmpleado = datos.readLine();
                        nuevoUsuario.println(usuario);
                        nuevoUsuario.println(password);
                        nuevoUsuario.println("Vendedor");
                        nuevoUsuario.println(numEmpleado);
                        nuevoUsuario.close();
                        bufferedWritter.close();
                        fileWriter.close();
                    }else{
                        System.out.println("Nombre de usuario ya existe");  
                    }
                }catch(IOException ioe2){System.out.println("Error al intetar crear usuario");}
                break;
            case 3:
                try{
                    datos = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Escriba Nombre de usuario: ");
                    usuario = datos.readLine();
                    File comprobarUsuario = new File("usuarios/"+usuario+".txt");
                    if(!comprobarUsuario.exists()){
                        FileWriter fileWriter = new FileWriter("usuarios/"+usuario+".txt");
                        BufferedWriter bufferedWritter = new BufferedWriter(fileWriter);
                        PrintWriter nuevoUsuario = new PrintWriter(bufferedWritter);
                        System.out.println("Ingrese nueva contraseña: ");
                        password = datos.readLine();
                        System.out.println("Ingrese numero de empleado: ");
                        numEmpleado = datos.readLine();
                        nuevoUsuario.println(usuario);
                        nuevoUsuario.println(password);
                        nuevoUsuario.println("Acomodador");
                        nuevoUsuario.println(numEmpleado);
                        nuevoUsuario.close();
                        bufferedWritter.close();
                        fileWriter.close();
                    }else{
                        System.out.println("Nombre de usuario ya existe");  
                    }
                }catch(IOException ioe2){System.out.println("Error al intetar crear usuario");}
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }      
    }

    @Override
    public String toString() {
        return super.toString() + "Puesto: Gerente";
    }
    
    
}

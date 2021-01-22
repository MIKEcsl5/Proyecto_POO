/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import modelo.*; //usando " .* " se importa todo el paquete
import modelo.productos.*;
import vista.menus.*;



/**
 *
 * @author Equipo D
 */
public class MainMenu {

    /**
     * @param args the command line arguments
     * @throws java.lang.NoSuchMethodException
     * @throws java.lang.IllegalAccessException
     * @throws java.lang.reflect.InvocationTargetException
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int opcion = 0;
        KeyboardInput input = new KeyboardInput();
        ArrayList<Producto> inventario = new ArrayList<>();
        Almacen almacen = new Almacen(inventario);
        almacen.llenarInventario();
        File archivoUsuario = null;
        String pass, cargoDeUsuarioActual = null, nombreUsuario = null, numEmpleado;
        
        //System.out.println("Prueba de commit");
        while(opcion != 5){ //ciclo del LogIn
            System.out.println("Que tipo de cargo ocupa?\n 1)Gerente\n 2)Vendedor\n 3)Acomodador\n 5)Cancelar y salir\n\nOpción a elegir:");
            opcion = input.readInteger();
            switch(opcion){
                
                case 1: //inicio de sesion gerente
                    System.out.println("\nIngrese nombre de usuario: ");
                    nombreUsuario = input.readString();
                    try{
                    archivoUsuario = new File("usuarios/"+nombreUsuario+".txt");
                    if(archivoUsuario.exists()){
                        cargoDeUsuarioActual = "Gerente";
                        FileReader fileReader = new FileReader("usuarios/"+nombreUsuario+".txt");
                        BufferedReader bufferReader = new BufferedReader(fileReader);
                        nombreUsuario = bufferReader.readLine();
                        System.out.println("\nIngrese contraseña: ");
                        pass = input.readString();
                        if(pass.equals(bufferReader.readLine()) && (cargoDeUsuarioActual.equals(bufferReader.readLine())))  {                     
                            System.out.println("\nAcceso permitido");
                            MenuGerente mainMenuGerente = new MenuGerente();
                            numEmpleado = bufferReader.readLine();
                            fileReader.close();
                            bufferReader.close();
                            mainMenuGerente.despliegue(nombreUsuario, numEmpleado ,almacen);
                        }else{
                            System.out.println("\nContraseña incorrecta o cargo incorrecto\n");
                        }
                    }else{
                        System.out.println("\nUsuario incorrecto\n");
                    }
                    }catch(IOException e){System.out.println("Error al iniciar sesion");}
                    break;
                    
                    
                case 2: //LogIn Vendedor
                    System.out.println("\nIngrese nombre de usuario: ");
                    nombreUsuario = input.readString();
                    try{
                    archivoUsuario = new File("usuarios/"+nombreUsuario+".txt");
                    if(archivoUsuario.exists()){
                        cargoDeUsuarioActual = "Vendedor";
                        FileReader fileReader = new FileReader("usuarios/"+nombreUsuario+".txt");
                        BufferedReader bufferReader = new BufferedReader(fileReader);
                        nombreUsuario = bufferReader.readLine();
                        System.out.println("\nIngrese contraseña: ");
                        pass = input.readString();
                        if(pass.equals(bufferReader.readLine()) && (cargoDeUsuarioActual.equals(bufferReader.readLine())))  {                     
                            System.out.println("\nAcceso permitido");
                            MenuVendedor mainMenuVendedor = new MenuVendedor();
                            numEmpleado = bufferReader.readLine();
                            fileReader.close();
                            bufferReader.close();
                            mainMenuVendedor.despliegue(nombreUsuario, numEmpleado ,almacen);
                        }else{
                            System.out.println("\nContraseña incorrecta o cargo incorrecto\n");
                        }
                    }else{
                        System.out.println("\nUsuario incorrecto\n");
                    }
                    }catch(IOException e){System.out.println("Error al iniciar sesion");}
                    break;
                    
                    
                case 3: //LogIn Acomodador
                    System.out.println("\nIngrese nombre de usuario: ");
                    nombreUsuario = input.readString();
                    try{
                    archivoUsuario = new File("usuarios/"+nombreUsuario+".txt");
                    if(archivoUsuario.exists()){
                        cargoDeUsuarioActual = "Acomodador";
                        FileReader fileReader = new FileReader("usuarios/"+nombreUsuario+".txt");
                        BufferedReader bufferReader = new BufferedReader(fileReader);
                        nombreUsuario = bufferReader.readLine();
                        System.out.println("\nIngrese contraseña: ");
                        pass = input.readString();
                        if(pass.equals(bufferReader.readLine()) && (cargoDeUsuarioActual.equals(bufferReader.readLine())))  {                     
                            System.out.println("\nAcceso permitido");
                            MenuAcomodador mainMenuAcomodador = new MenuAcomodador();
                            numEmpleado = bufferReader.readLine();
                            fileReader.close();
                            bufferReader.close();
                            mainMenuAcomodador.despliegue(nombreUsuario, numEmpleado ,almacen);
                        }else{
                            System.out.println("\nContraseña incorrecta o cargo incorrecto\n");
                        }
                    }else{
                        System.out.println("\nUsuario incorrecto\n");
                    }
                    }catch(IOException e){System.out.println("Error al iniciar sesion");}
                    break;
                    
                case 5:
                    return;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
                    
            }
        } //ciclo del LogIn  
    }
}

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
     * Menu principal del prigrama
     * @param args 
     */
    public static void main(String[] args){
        int opcion = 0;
        KeyboardInput input = new KeyboardInput();
        ArrayList<Producto> inventario = new ArrayList<>();
        Almacen almacen = new Almacen(inventario);
        almacen.llenarInventario();
        File archivoUsuario = null;
        String pass, cargoDeUsuarioActual = null, nombreUsuario = null, numEmpleado;
        
        System.out.println("Prueba de commit");
        while(opcion != 2){
            System.out.println("******************BIENVENIDO******************\n 1)Iniciar sesion\n 2)Salir\n\nIngrese opción:");
            opcion = input.readInteger();
            switch(opcion){
                
                case 1:
                    System.out.println("\nIngrese nombre de usuario: ");
                    nombreUsuario = input.readString();
                    try{
                        archivoUsuario = new File("usuarios/"+nombreUsuario+".txt");
                        if(archivoUsuario.exists()){
                            FileReader fileReader = new FileReader("usuarios/"+nombreUsuario+".txt");
                            BufferedReader bufferReader = new BufferedReader(fileReader);
                            nombreUsuario = bufferReader.readLine();
                            System.out.println("\nIngrese contraseña: ");
                            pass = input.readString();

                            if(pass.equals(bufferReader.readLine())){
                                cargoDeUsuarioActual = bufferReader.readLine();
                                switch(cargoDeUsuarioActual){
                                    case "Gerente": //inicio de sesion gerente
                                        System.out.println("\nAcceso permitido");
                                        MenuGerente mainMenuGerente = new MenuGerente();
                                        numEmpleado = bufferReader.readLine();
                                        fileReader.close();
                                        bufferReader.close();
                                        mainMenuGerente.despliegue(nombreUsuario, numEmpleado ,almacen);
                                        break;
                                    case "Vendedor": //inicio de sesion vendedor
                                        System.out.println("\nAcceso permitido");
                                        MenuVendedor mainMenuVendedor = new MenuVendedor();
                                        numEmpleado = bufferReader.readLine();
                                        fileReader.close();
                                        bufferReader.close();
                                        mainMenuVendedor.despliegue(nombreUsuario, numEmpleado ,almacen);
                                        break;
                                    case "Acomodador": //inicio de sesion acomodador
                                        System.out.println("\nAcceso permitido");
                                        MenuAcomodador mainMenuAcomodador = new MenuAcomodador();
                                        numEmpleado = bufferReader.readLine();
                                        fileReader.close();
                                        bufferReader.close();
                                        mainMenuAcomodador.despliegue(nombreUsuario, numEmpleado ,almacen);
                                        break;
                                }
                            }else{
                                System.out.println("\nContraseña incorrecta\n");
                            }
                        }else{
                            System.out.println("\nUsuario incorrecto o no existe\n");
                        }
                    }catch(IOException e){System.out.println("Error al iniciar sesion");}
                    break;
                    
                case 2:
                    return;
                    
                default:
                    System.out.println("Opcion no valida");
                    break; 
            }
        } 
    }
}

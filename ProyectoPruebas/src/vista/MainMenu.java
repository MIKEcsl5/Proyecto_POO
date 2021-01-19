/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

//se importa la clase gerente del paquete Login (usando asterisco despues del nombre del paquete y el "." se importan todas las clases publicas del paquete)
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import modelo.usuarios.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Hashtable;
import modelo.*;
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
        
        System.out.println("Prueba de commit");
        while(opcion != 5){ //ciclo del LogIn
            System.out.println("Que tipo de cargo ocupa?\n 1)Gerente\n 2)Vendedor\n 3)Acomodador\n 4)Crear nuevo usuario\n 5)Cancelar y salir\n\nOpción a elegir:");
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
                            System.out.println("Contraseña incorrecta o cargo incorrecto");
                        }
                    }else{
                        System.out.println("Usuario incorrecto");
                    }
                    }catch(Exception e){}
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
                            System.out.println("Contraseña incorrecta o cargo incorrecto");
                        }
                    }else{
                        System.out.println("Usuario incorrecto");
                    }
                    }catch(Exception e){}
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
                            System.out.println("Contraseña incorrecta o cargo incorrecto");
                        }
                    }else{
                        System.out.println("Usuario incorrecto");
                    }
                    }catch(Exception e){}
                    break;
                    
                case 4:
                    crearUsuario();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opcion no valida");
                    break;
                    
            }
        } //ciclo del LogIn 
        
    }
    
     public static void crearUsuario(){
        int eleccion = 0;
        System.out.println("con que perfil quiere iniciar sesion\n 1)Gerente\n 2)Vendedor\n 3)Acomodador");
        switch(eleccion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }        
    }
    
}

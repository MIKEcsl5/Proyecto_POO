/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

//se importa la clase gerente del paquete Login (usando asterisco despues del nombre del paquete y el "." se importan todas las clases publicas del paquete)
import modelo.usuarios.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Hashtable;
import modelo.*;
import modelo.productos.*;



/**
 *
 * @author Equipo D
 */
public class Proyecto_v2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.NoSuchMethodException
     * @throws java.lang.IllegalAccessException
     * @throws java.lang.reflect.InvocationTargetException
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int opcion = 0;
        KeyboardInput input = new KeyboardInput();
        Empleado usuario = null;
        String user, pass, cargoDeUsuarioActual = null;
        
        Hashtable<String, Empleado> empleados = new Hashtable<>();
        Gerente empleadoActual = new Gerente("Eduardo", 23, "admin");
        empleados.put("prueba123",empleadoActual); //prueba de login con puesto gerente usuario: prueba123, pass: admin
      
        while(opcion != 5){ //ciclo del LogIn
            System.out.println("Que tipo de cargo ocupa?\n 1)Gerente\n 2)Vendedor\n 3)Acomodador\n 4)Cancelar y salir\n\nOpción a elegir:");
            opcion = input.readInteger();
            switch(opcion){
                case 1:
                    System.out.println("\nIngrese nombre de usuario: ");
                    user = input.readString();
                    if(empleados.containsKey(user)){
                        usuario = empleados.get(user);
                        System.out.println("\nIngrese contraseña: ");
                        pass = input.readString();
                        if((usuario.getPuesto() == "Gerente") && (pass.equals(usuario.getPinAcceso() ) ) ){
                            cargoDeUsuarioActual = usuario.getPuesto();
                            System.out.println("\nAcceso permitido");
                            opcion = 5;
                        }else{
                            System.out.println("Contraseña incorrecta o cargo incorrecto");
                        }
                    }else{
                        System.out.println("Usuario incorrecto");
                    }          
                    break;
                case 2:
                    System.out.println("Ingrese nombre de usuario");
                    user = input.readString();
                    if(empleados.containsKey(user)){
                        usuario = empleados.get(user);
                        System.out.println("Ingrese contraseña");
                        pass = input.readString();
                        if((usuario.getPuesto() == "Vendedor") && (pass.equals(usuario.getPinAcceso() ) ) ){
                            cargoDeUsuarioActual = usuario.getPuesto();
                            System.out.println("Acceso permitido");
                            opcion = 5;
                        }else{
                            System.out.println("Contraseña incorrecta o cargo incorrecto");
                        }
                    }else{
                        System.out.println("Usuario incorrecto");
                    }          
                    break;
                case 3:
                    System.out.println("Ingrese nombre de usuario");
                    user = input.readString();
                    if(empleados.containsKey(user)){
                        usuario = empleados.get(user);
                        System.out.println("Ingrese contraseña");
                        pass = input.readString();
                        if((usuario.getPuesto() == "Acomodador") && (pass.equals(usuario.getPinAcceso() ) ) ){
                            cargoDeUsuarioActual = usuario.getPuesto();
                            System.out.println("Acceso permitido");
                            opcion = 5;
                        }else{
                            System.out.println("Contraseña incorrecta o cargo incorrecto");
                        }
                    }else{
                        System.out.println("Usuario incorrecto");
                    }          
                    break;
                case 4:
                    return;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
                    
            }
        } //ciclo del LogIn 
        
        opcion = 1;
        ArrayList<Producto> inventario = new ArrayList<>();
        System.out.println("Empleado en turno: "+usuario.getNombre());
       
        while(opcion != 8){
            System.out.print("\n¿Que desea realizar?\n 1)Prueba de venta de un producto\n 2)Buscar producto\n 3)Agregar Producto al inventario\n 8)Salir\n\nOpción a elegir: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1:
                    if(cargoDeUsuarioActual.equals("Gerente") || cargoDeUsuarioActual.equals("Vendedor")){
                        inventario.add(new Audifonos("A1", 100, "sony"));
                        Gerente tmpUsuario = new Gerente();
                        tmpUsuario.venderProducto(inventario);
                    }
            
                    break;
                case 2:
                    if(cargoDeUsuarioActual.equals("Gerente") || cargoDeUsuarioActual.equals("Vendedor")){
                        Producto tmpProd;
                        inventario.add(new Audifonos("A2", 300, "Beats"));
                        Gerente tmpUsuario2 = new Gerente();
                        tmpProd = tmpUsuario2.buscarProducto(inventario);
                        
                    }
                    break;
                    
                case 3:
                    if(cargoDeUsuarioActual.equals("Gerente") || cargoDeUsuarioActual.equals("Vendedor")){
                        Gerente tmpUsuario3 = new Gerente();
                        tmpUsuario3.agregarProducto(inventario);
                        
                    }
                    
                case 4:
                    Gerente temporal2 = new Gerente();
                    temporal2.agregarProducto(inventario);
                    
                    break;
                    
                case 5:
                    System.out.println("prueba :(");
                    break;
                    
                case 8:
                    System.out.println("Adios :)");
                    break;
                default:
                    System.out.println(opcion + "no es opcion valida");
                break;
            }
        }
        
        /* Prueba ingresar datos
        KeyboardInput input = new KeyboardInput();
        System.out.println("Ingrese datos de la cancion");
        Cancion cancion1 = new Cancion();
        cancion1.fechaPublicacion = input.readString();
        System.out.println("fecha"+cancion1.fechaPublicacion);
        */
        
        //prueba: usar clases de otros paquetes
        //creando un areglo de album's
        /*for(Album album : inventario){
            System.out.println(album);
        } */ 
    }
    
     /*public void crearUsuario(){
        int eleccion = 0;
                    System.out.println("con que perfil quiere iniciar sesion\n 1)Gerente\n 2)Vendedor\n 3)Acomodador");
                    while(eleccion != 0){
                        switch(eleccion){
                            case 1:
                                Gerente perfilGerente = new Gerente();
                                KeyboardInput tmpPIN = new KeyboardInput();
                                System.out.println("ingrese PIN de acceso");
                                
                                if(tmpPIN.readInteger() != perfilGerente.getPinAcceso()){
                                    
                                }
                                break;
                            case 2:
                                Vendedor perfilVendedor = new Vendedor();
                                perfilVendedor.getPinAcceso();
                                break;
                            case 3:
                                
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
    } */
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

//se importa la clase gerente del paquete Login (usando asterisco despues del nombre del paquete y el "." se importan todas las clases publicas del paquete)
import modelo.usuarios.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
        
        int opcion = 1;
        KeyboardInput input = new KeyboardInput();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Producto> inventario = new ArrayList<>();
        
        Gerente pruebaGerente = new Gerente("Eduardo",1);
        empleados.add(pruebaGerente);
        
        //Prueba inventario
        Audifonos audifonos1 = new Audifonos("1223",45,"Sony");
        inventario.add(audifonos1);
        System.out.println(inventario);
        
        System.out.println(empleados);
        System.out.println("Nombre empleado prueba: "+empleados.get(0).getNombre());
        
        while(opcion != 8){
            System.out.print("Que desea realizar\n 1)Iniciar sesion\n 2)Prueba de venta de un producto\n 3)Buscar producto\n 4)Agregar Producto al inventario\n 8)Salir: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1: 
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
                                Gerente temporal = new Gerente();
                                System.out.println(temporal.buscarProducto(inventario));
                                
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    break;
                case 2:
                    Album titulo2 = new Album("album de canciones 1", "jose jose", "20/10/12");
                    Audifonos audifonos2 = new Audifonos("231264", 1600, "audifonos sony");
                    inventario.add(new Album("aaaaaaaaaaa", "XDXDXD", "1/1/1"));//Prueba creacion de objeto en tiempo dinamico
                    inventario.add(titulo2);
                    inventario.add(audifonos2);
                    Method metodoVender = pruebaGerente.getClass().getMethod("venderProducto", ArrayList.class); //busca
                    metodoVender.invoke(pruebaGerente, inventario);
                    break;
                    
                case 3:
                    Method metodoBuscar = pruebaGerente.getClass().getMethod("buscarProducto", ArrayList.class); //busca
                    metodoBuscar.invoke(pruebaGerente, inventario);
                    break;
                    
                case 4:
                    Method metodoAgregar = pruebaGerente.getClass().getMethod("agregarProducto", ArrayList.class); //busca
                    metodoAgregar.invoke(pruebaGerente, inventario);
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
    
}

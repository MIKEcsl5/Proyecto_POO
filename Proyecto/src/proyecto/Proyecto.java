/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

//se importa la clase gerente del paquete Login (usando asterisco despues del nombre del paquete y el "." se importan todas las clases publicas del paquete)
import login.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import productos.*;

/**
 *
 * @author Equipo D
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     * @throws java.lang.NoSuchMethodException
     * @throws java.lang.IllegalAccessException
     * @throws java.lang.reflect.InvocationTargetException
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        int opcion = 1;
        KeyboardInput input = new KeyboardInput();
        ArrayList<Object> inventario = new ArrayList<>();
        
        while(opcion != 8){
            System.out.print("Que desea realizar\n 1)Iniciar sesion \n 2)Prueba de venta de un producto\n 8)Salir: ");
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
                                Acomodador perfilAcomodador = new Acomodador();
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    break;
                case 2:
                    Album titulo1 = new Album("album de canciones 1", "jose jose", "20/10/12");
                    Audifonos audifonos1 = new Audifonos(231264, 1600, "audifonos sony");
                    inventario.add(titulo1);
                    inventario.add(audifonos1);
                    Gerente pruebaGerente2 = new Gerente();
                    pruebaGerente2.venderProducto(inventario);
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    break;
                    
                case 5:
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
        
        
        
        
        
        
        /*Gerente pruebaGerente = new Gerente();
        System.out.println("toString Gerente:"+pruebaGerente.toString());    
        */
    }
    
}

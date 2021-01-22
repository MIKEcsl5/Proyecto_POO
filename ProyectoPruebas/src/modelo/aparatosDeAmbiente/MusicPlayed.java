/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.aparatosDeAmbiente;

import controlador.AparatoAmbiental;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import modelo.Almacen;
import modelo.productos.*;
import vista.KeyboardInput;

/**
 *
 * @author Equipo D
 */
public class MusicPlayed {

    public MusicPlayed() {
    }
    
    public void tocarDisco(Almacen almacen){
        
        KeyboardInput input = new KeyboardInput();
        int opcion = 0;
        
        while(opcion != 3){
            System.out.println("\n1)Tocar solo un disco musical\n2)Tocar dos o mas discos musicales\n3)Cancelar y salir");
            System.out.println("\nOpcion a elegir: ");
            opcion = input.readInteger();
            
            switch(opcion){
                case 1:
                    Producto productoTMP = new Producto();
                    System.out.println("¿Que dico desea tocar?");
                    productoTMP = almacen.buscarProducto(0); 
                    
                    if(productoTMP == null)
                        System.out.println("Intente buscar otro disco: "); 
                    else 
                        if (productoTMP.getClass() == Audifonos.class || productoTMP.getClass() == DiscoVideo.class)
                            System.out.println("\nEste producto no es un disco musical\nIntente buscar otro disco: ");
                        else
                            if(productoTMP.getClass() == DiscoMusical.class){
                                DiscoMusical disco = (DiscoMusical) productoTMP;
                                new AparatoAmbiental(disco.getNombre(), disco.getCanciones()).start(); 
                            }
                    
                    opcion = input.readInteger();
                    break;
                
                case 2:
                    System.out.println("¿Cuantos discos desea buscar?: ");
                    opcion = input.readInteger();
                    ArrayList<DiscoMusical> discosTocar = new ArrayList<>();
                    for (int j=0;j<opcion;j++){
                        productoTMP = almacen.buscarProducto(0);
                        if(productoTMP == null)
                            System.out.println("Intente buscar otro disco: ");
                        else 
                            if (productoTMP.getClass() == Audifonos.class || productoTMP.getClass() == DiscoVideo.class)
                                System.out.println("\nEste producto no es un disco musical\nIntente buscar otro disco: ");
                            else
                                if(productoTMP.getClass() == DiscoMusical.class){
                                    discosTocar.add((DiscoMusical) productoTMP);
                                }
                    }
                    for (DiscoMusical discoMusical : discosTocar) {
                        new AparatoAmbiental(discoMusical.getNombre(),discoMusical.getCanciones()).start();
                    }
                    opcion = input.readInteger();
                    break;
                case 3:
                    System.out.println("\nOperacion cancelada...");
                    opcion = 3;
                    break;
                    
                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }
                    
        }
    }
}

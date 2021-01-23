/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.aparatosDeAmbiente;

import controlador.AparatoAmbiental;
import java.util.ArrayList;
import modelo.Almacen;
import modelo.productos.*;
import vista.KeyboardInput;

/**
 * Esta clase representa un reproductor que solo reproduce discos musicales, pero puede reproducir varios usando Threads(hilos)
 * @author Equipo D
 */
public class MusicPlayed {

    /**
     * Constructor vacio de la clase MusicPlayed
     */
    public MusicPlayed() {
    }
    
    /**
     * En este metodo se seleccionan todos los productos de tipo clase DiscoMusical para posteriormente crear un hilo por cada disco y reproducirlos
     * @param almacen Objeto que contiene el inventario de todos los productos
     */
    public void tocarDisco(Almacen almacen){
        
        KeyboardInput input = new KeyboardInput();
        int opcion = 0;
        
        while(opcion != 8){
            System.out.println("\n1)Tocar uno o varios discos musicales\n8)Cancelar y salir");
            System.out.println("\nOpcion a elegir: ");
            opcion = input.readInteger();
            Producto productoTMP = new Producto();
            switch(opcion){
                case 1:
                    System.out.println("¿Cuantos discos desea reproducir?: ");
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
                    
                case 8:
                    System.out.println("\nOperacion cancelada...");
                    return;
                    
                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }        
        }
    }
}

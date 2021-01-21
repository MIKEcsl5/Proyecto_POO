/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.aparatosDeAmbiente;

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
        
        while(opcion != 2){
            System.out.println("\n1)Tocar Disco Musical\n2)Cancelar y salir");
            System.out.println("\nOpcion a elegir: ");
            opcion = input.readInteger();
            
            switch(opcion){
                case 1:
                    Producto productoTMP = new Producto();
                    System.out.println("¿Que dico desea tocar?");
                    productoTMP = almacen.buscarProducto(0); 
                    if(productoTMP == null || productoTMP.getClass() == Audifonos.class || productoTMP.getClass() == DiscoVideo.class){
                        System.out.println("Este producto no es un disco musical");
                    }else if(productoTMP.getClass() == DiscoMusical.class){
                        System.out.println("\n"+productoTMP.getNombre()+" Sonando...");
                    }
                    break;
         
                case 2:
                    System.out.println("\nOperacion cancelada...");
                    opcion = 2;
                    break;
                    
                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }
                    
        }
    }
}

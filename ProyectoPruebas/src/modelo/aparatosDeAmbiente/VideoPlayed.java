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
 *
 * @author roble
 */
public class VideoPlayed {

    public VideoPlayed() {
    }
    
    public void elegirTipoDisco(Almacen almacen){
        
        KeyboardInput input = new KeyboardInput();
        int opcion = 0;
        
        while(opcion != 3){
            System.out.println("\nQue tipo de disco desea tocar?\n 1)Disco musical\n 2)Disco de video\n 3)Cancelar y salir");
            opcion = input.readInteger();
            
            switch(opcion){
                case 1:
                    System.out.println("");
                    break;
                
                case 2:
                    tocarDiscoVideo(almacen);
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
    
    public void tocarDiscoVideo(Almacen almacen){
        Producto productoTMP = new Producto();
        System.out.println("¿Que dico desea tocar?");
        productoTMP = almacen.buscarProducto(0);
        Class a = DiscoVideo.class;
        
        if(productoTMP.getClass() == a){
            System.out.println("\n"+productoTMP.getNombre()+" Sonando...");
        }
    }
}

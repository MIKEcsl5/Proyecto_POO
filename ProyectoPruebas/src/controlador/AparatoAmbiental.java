/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Almacen;
import modelo.aparatosDeAmbiente.*;
import vista.KeyboardInput;

/**
 *
 * @author roble
 */
public class AparatoAmbiental extends Thread{
    ArrayList<String> listaCanciones;
    
    public AparatoAmbiental() {
    }
    
    public AparatoAmbiental(String nombre) {
        super(nombre);
    }
    
    public AparatoAmbiental(String nombre, ArrayList<String> listaCanciones) {
        super(nombre);
        this.listaCanciones = listaCanciones;
    }
    
    public void elegirReproductor(Almacen almacen) {
        KeyboardInput input = new KeyboardInput();
        int opcion = 0;
    
        while(opcion != 3){
            System.out.println("\n¿Que aparato ambiental desea usar?\n 1)Video Played\n 2)Music Played\n 3)Cancelar y salir");
            System.out.println("\nOpción a elegir: ");
            opcion = input.readInteger();
            
            switch(opcion){
                case 1:
                    VideoPlayed videopTMP = new VideoPlayed();
                    videopTMP.elegirTipoDisco(almacen);
                    break;
                    
                case 2:
                    MusicPlayed musicTMP = new MusicPlayed();
                    musicTMP.tocarDisco(almacen);
                    break;
                    
                case 3:
                    System.out.println("\nOperacion cancelada...");
                    opcion = 3;
                    break;
                
                default:
                    System.out.println("\nOpción no valida");
                    break;
            }
        }
        
    }
    
    @Override
    public void run(){
        for (int i = 0; i < listaCanciones.size(); i++) {
            int random = (int) (20000 * Math.random() + 1000);
                System.out.println("\t\t\t\t\t\t"+getName()+": "+listaCanciones.get(i)+" Sonando...");
            try {
                sleep(random);
            } catch (InterruptedException ex) {
                Logger.getLogger(AparatoAmbiental.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("\t\t\t\t\t\tTermino Disco: "+getName());
  
    }
}

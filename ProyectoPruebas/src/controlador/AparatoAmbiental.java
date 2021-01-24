/**
 * Paquete controlador
 */
package controlador;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.almacen.Almacen;
import modelo.aparatosDeAmbiente.*;
import vista.KeyboardInput;

/**
 * Clase AparatoAmbiental que genera hilos para reproducir varios discos de musica a la vez
 * @author Equipo D
 */
public class AparatoAmbiental extends Thread{
    ArrayList<String> listaCanciones;
    
    /**
     * Constructor vacio de la clase AparatoAmbiental
     */
    public AparatoAmbiental() {
    }
    
    /**
     * 
     * @param nombre Recibe dato tipo String que sera el nombre del hilo
     */
    public AparatoAmbiental(String nombre) {
        super(nombre);
    }
    
    /**
     * 
     * @param nombre Recibe dato tipo String que sera el nombre del hilo
     * @param listaCanciones Recibe un arreglo de datos de tipo String que representa la lista de canciones que reproducira el aparato ambiental
     */
    public AparatoAmbiental(String nombre, ArrayList<String> listaCanciones) {
        super(nombre);
        this.listaCanciones = listaCanciones;
    }
    
    /**
     * Metodo donde se elige que tipo de reproducto se desea utilizar
     * @param almacen Recibe un objeto de la clase Almacen que representa el inventario donde se extraen los productos
     */
    public void elegirReproductor(Almacen almacen) {
        KeyboardInput input = new KeyboardInput();
        int opcion = 0;
    
        while(opcion != 8){
            System.out.println("\n¿Que aparato ambiental desea usar?\n 1)Video Played\n 2)Music Played\n 8)Cancelar y salir");
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
                    
                case 8:
                    System.out.println("\nOperacion cancelada...");
                    opcion = 8;
                    break;
                
                default:
                    System.out.println("\nOpción no valida");
                    break;
            }
        }
    }
    
    /**
     * Metodo run donde se crea el hilo y se reproducen los discos
     */
    @Override
    public void run(){
        for (int i = 0; i < listaCanciones.size(); i++) {
            int random = (int) (17000 * Math.random() + 1000);
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

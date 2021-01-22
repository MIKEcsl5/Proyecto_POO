/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.aparatosDeAmbiente;
import controlador.AparatoAmbiental;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Almacen;
import modelo.productos.*;
import vista.KeyboardInput;
/**
 *
 * @author Equipo D
 */
public class VideoPlayed {

    public VideoPlayed() {
    }
    
    public void elegirTipoDisco(Almacen almacen) {
        
        KeyboardInput input = new KeyboardInput();
        int opcion = 0;
        
        while(opcion != 8){
            System.out.println("\nQue tipo de disco desea tocar?\n 1)Disco musical\n 2)Disco de video\n 8)Cancelar y salir");
            opcion = input.readInteger();
            
            switch(opcion){
                case 1:
                    tocarDiscoMusical(almacen);
                    break;
                
                case 2:
                    tocarDiscoVideo(almacen);
                    break;
                
                case 8:
                    System.out.println("\nOperacion cancelada...");
                    opcion = 8;
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
        
        if(productoTMP == null)
            System.out.println("Intente buscar otro disco: ");
        else 
            if (productoTMP.getClass() == Audifonos.class || productoTMP.getClass() == DiscoMusical.class)
                System.out.println("\nEste producto no es un disco de video\nIntente buscar otro disco: ");     
            else
                if(productoTMP.getClass() == DiscoVideo.class){
                    for (int i = 0; i < 4; i++) {
                        int random = (int) (20000 * Math.random() + 1000);
                        System.out.println("\t\t\t\t\t\t"+productoTMP.getNombre()+": Reproduciendo video...");
                        try {
                            sleep(random);
                        }catch (InterruptedException ex) {
                            Logger.getLogger(AparatoAmbiental.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                    System.out.println("\t\t\t\t\t\tTermino Disco: "+productoTMP.getNombre());
                }    
    }
    
    public void tocarDiscoMusical(Almacen almacen){
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
                    for (int i = 0; i < disco.getCanciones().size(); i++) {
                        int random = (int) (20000 * Math.random() + 1000);
                        System.out.println("\t\t\t\t\t\t"+disco.getNombre()+": "+disco.getCanciones().get(i)+" Sonando...");
                        try {
                            sleep(random);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(AparatoAmbiental.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                System.out.println("\t\t\t\t\t\tTermino Disco: "+disco.getNombre());                                
                }         
    }
}

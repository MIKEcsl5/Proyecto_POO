/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Almacen;
import modelo.aparatosDeAmbiente.*;
import modelo.productos.*;
import vista.KeyboardInput;

/**
 *
 * @author roble
 */
public class AparatoAmbiental {

    public AparatoAmbiental() {
    }
    
    public void elegirReproductor(Almacen almacen){
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
}

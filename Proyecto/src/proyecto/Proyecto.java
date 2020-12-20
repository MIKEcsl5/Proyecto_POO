/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Miguel
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prueba ingresar datos
        KeyboardInput input = new KeyboardInput();
        System.out.println("Ingrese datos de la cancion");
        Cancion cancion1 = new Cancion();
        cancion1.fechaPublicacion = input.readString();
        System.out.println("fecha"+cancion1.fechaPublicacion);
    }

}

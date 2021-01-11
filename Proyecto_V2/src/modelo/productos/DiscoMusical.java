/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.productos;

/**
 *
 * @author roble
 */
public class DiscoMusical extends Disco{

    public DiscoMusical() {
    }

    public DiscoMusical(String artista, int numCanciones) {
        super(artista, numCanciones);
    }

    public DiscoMusical(String artista, int numCanciones, String sku, int precio, String nombre) {
        super(artista, numCanciones, sku, precio, nombre);
    }
    
    
}

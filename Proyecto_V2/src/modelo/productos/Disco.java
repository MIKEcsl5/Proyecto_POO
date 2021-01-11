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
public class Disco extends Producto{
    String artista;
    int numCanciones;

    public Disco() {
    }

    public Disco(String artista, int numCanciones) {
        this.artista = artista;
        this.numCanciones = numCanciones;
    }

    public Disco(String artista, int numCanciones, String sku, int precio, String nombre) {
        super(sku, precio, nombre);
        this.artista = artista;
        this.numCanciones = numCanciones;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    @Override
    public String toString() {
        return "Disco{" + "artista=" + artista + ", numCanciones=" + numCanciones + '}';
    }
    
    
    
}

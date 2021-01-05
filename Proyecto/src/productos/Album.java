/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.ArrayList;

/**
 *
 * @author Equipo D
 */
public class Album extends Producto{
    String artista;
    String fechaPublicacion;
    int numCanciones = 0;
    ArrayList<String> Listacanciones = new ArrayList<>(); //Arreglo para la lista de canciones de un objeto de la clase Album
    
    public Album() {
    }

    public Album(int sku, int precio, String nombre, String artista, String fechaPublicacion, int numCanciones) {
        super(sku, precio, nombre);
        this.artista = artista;
        this.fechaPublicacion = fechaPublicacion;
        this.numCanciones = numCanciones;
    }
    
    /**
     * Constructor utilizado para la clase Cancion 
     * @param nombre
     * @param artista
     * @param fechaPublicacion 
     */
     public Album(String nombre, String artista, String fechaPublicacion) {
        super(nombre);
        this.artista = artista;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    @Override
    public String toString() {
        return super.toString() + "Album{" + "artista=" + artista + ", fechaPublicacion=" + fechaPublicacion + ", numCanciones=" + numCanciones + ", Listacanciones=" + Listacanciones + '}';
    }

    
   
}

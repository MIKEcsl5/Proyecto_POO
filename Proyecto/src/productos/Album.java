/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author Equipo D
 */
public class Album extends Producto {
    String titulo;
    String artista;
    String fechaPublicacion;
    int numCanciones = 0;

    public Album() {
    }

    public Album(String titulo, String artista, String fechaPublicacion, int sku, int precio, int numCanciones) {
        super(sku, precio);
        this.titulo = titulo;
        this.artista = artista;
        this.fechaPublicacion = fechaPublicacion;
        this.numCanciones = numCanciones;
    }
    
    /**
     * Constructor utilizado para la clase Cancion
     * @param titulo
     * @param artista
     * @param fechaPublicacion 
     */
     public Album(String titulo, String artista, String fechaPublicacion) {
        this.titulo = titulo;
        this.artista = artista;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    public int getSku() {
        return getSku();
    }

    @Override
    public void setSku(int sku) {
        this.setSku(sku);
    }

    @Override
    public int getPrecio() {
        return getPrecio();
    }

    @Override
    public void setPrecio(int precio) {
        this.setPrecio(precio);
    }

    @Override
    public String toString() {
        return super.toString() +"Album{" + "titulo=" + titulo + ", artista=" + artista + ", fechaPublicacion=" + fechaPublicacion + ", numCanciones=" + numCanciones + '}';
    }
   
    

    
}

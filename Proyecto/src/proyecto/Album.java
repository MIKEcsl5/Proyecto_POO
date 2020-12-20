/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Equipo D
 */
public class Album {
    String titulo;
    String artista;
    String fechaPublicacion;
    int numCanciones;

    public Album() {
    }

    public Album(String titulo, String artista, String fechaPublicacion, int numCanciones) {
        this.titulo = titulo;
        this.artista = artista;
        this.fechaPublicacion = fechaPublicacion;
        this.numCanciones = numCanciones;
    }

    public Album(String titulo, String artista, String fechaPublicacion) {
        this.titulo = titulo;
        this.artista = artista;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
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

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    @Override
    public String toString() {
        return "Album{" + "titulo=" + titulo + ", artista=" + artista + ", fechaPublicacion=" + fechaPublicacion + ", numCanciones=" + numCanciones + '}';
    }

   
    
}

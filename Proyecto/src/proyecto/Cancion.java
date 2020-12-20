/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author socce
 */
public class Cancion extends Album {
    float duration;

    public Cancion() {
    }

    public Cancion(float duration, String titulo, String artista, String fechaPublicacion) {
        super(titulo, artista, fechaPublicacion);
        this.duration = duration;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getArtista() {
        return artista;
    }

    @Override
    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Cancion{" + "duration=" + duration + '}';
    }
    
    
}

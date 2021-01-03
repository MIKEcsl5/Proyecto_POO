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
public class Cancion extends Album {
    float duration;

    public Cancion() {
    }

    public Cancion(String nombre, String artista, String fechaPublicacion, float duracion) {
        super(nombre, artista, fechaPublicacion);
        this.duration = duracion;
    }


    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString() + "Cancion{" + "duration=" + duration + '}';
    }
    
    
}

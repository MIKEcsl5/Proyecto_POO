/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.productos;

/**
 *
 * @author Equipo D
 */
public class DiscoVideo extends Disco{
    private float duracion;

    public DiscoVideo() {
    }

    public DiscoVideo(String artista, int numCanciones) {
        super(artista, numCanciones);
    }

    public DiscoVideo(float duracion, String artista, int numCanciones, String sku, int precio, String nombre) {
        super(artista, numCanciones, sku, precio, nombre);
        this.duracion = duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuracion: " + duracion;
    }
    
}

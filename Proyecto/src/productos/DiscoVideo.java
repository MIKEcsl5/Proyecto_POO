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
public class DiscoVideo extends Producto{
    String artista;
    int numCanciones;
    float duracion;

    public DiscoVideo() {
    }

    public DiscoVideo(String artista, int numCanciones, float duracion, int sku, int precio) {
        super(sku, precio);
        this.artista = artista;
        this.numCanciones = numCanciones;
        this.duracion = duracion;
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

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString() + "discoVideo{" + "artista=" + artista + ", numCanciones=" + numCanciones + ", duracion=" + duracion + '}';
    }
    
}

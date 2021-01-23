/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.productos;

/**
 * Clase DiscoVideo con la que se crean objetos que representan productos
 * @author Equipo D
 */
public class DiscoVideo extends Disco{
    private float duracion;

    /**
     * Constructor vacio de DiscoVideo
     */
    public DiscoVideo() {
    }
    
    /**
     * Constructor sobrecargado de DiscoVideo
     * @param artista Representa una cadena de caracteres que componen el nombre del artista del álbum.
     * @param numCanciones Dato tipo entrero que representa el numero de canciones que contiene el disco
     */
    public DiscoVideo(String artista, int numCanciones) {
        super(artista, numCanciones);
    }

    /**
     * 
     * @param duracion Dato tipo entero que representa la duracion del Disco
     * @param artista Representa una cadena de caracteres que componen el nombre del artista del álbum.
     * @param numCanciones Dato tipo entrero que representa el numero de canciones que contiene el disco
     * @param sku Representa el código numérico de almacén con el que puede ser ubicado por los empleados.
     * @param precio Representa una cantidad monetaria del costo del producto.
     * @param nombre Representa una cadena de caracteres que componen el nombre del álbum.
     */
    public DiscoVideo(float duracion, String artista, int numCanciones, String sku, int precio, String nombre) {
        super(artista, numCanciones, sku, precio, nombre);
        this.duracion = duracion;
    }

    /**
     * Con este método se modifica el atributo duracion
     * @param duracion 
     */
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
    
    /**
     * 
     * @return Retorna los atributos del producto
     */
    @Override
    public String toString() {
        return super.toString() + "\nDuracion: " + duracion;
    }
    
}

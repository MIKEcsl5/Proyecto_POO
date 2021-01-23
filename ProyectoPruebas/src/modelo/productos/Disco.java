/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.productos;

/**
 * Clase Disco de la cual heredan DiscoMusical y DiscoVideo
 * @author Equipo D
 */
public class Disco extends Producto{
    protected String artista;
    protected int numCanciones;

    /**
     * Constructor vacio de la clase Disco
     */
    public Disco() {
    }
    
    /**
     * Constructor sobrecargado 
     * @param artista Dato tipo String que representa el nombre del artista
     * @param numCanciones Dato tipo entrero que representa el numero de canciones que contiene el disco
     */
    public Disco(String artista, int numCanciones) {
        this.artista = artista;
        this.numCanciones = numCanciones;
    }

    /**
     * 
     * @param artista Dato tipo String que representa el nombre del artista
     * @param numCanciones Dato tipo entrero que representa el numero de canciones que contiene el disco
     * @param sku Dato tipo String que representa el SKU de identificacion de un producto y debe ser diferente a los demás productos
     * @param precio Dato tipo entero que representa el precio de un producto
     * @param nombre Dato tipo String que representa el nombre de un prodcuto
     */
    public Disco(String artista, int numCanciones, String sku, int precio, String nombre) {
        super(sku, precio, nombre);
        this.artista = artista;
        this.numCanciones = numCanciones;
    }
    
    /**
     * Con este metodo se modifica el atributo artista
     * @param artista Dato tipo String que representa el nombre del artista de un disco
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Con este metodo se modifica el atributo numCanciones
     * @param numCanciones Dato tipo entrero que representa el numero de canciones que contiene el disco
     */
    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    /**
     * 
     * @return Muestra los datos de un producto
     */
    @Override
    public String toString() {
        return super.toString()+"\nArtista: " + artista + "\nNum. de canciones: " + numCanciones;
    }
    
    
    
}

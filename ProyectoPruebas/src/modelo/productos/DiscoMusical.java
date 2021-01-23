/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.productos;

import java.util.ArrayList;
import vista.KeyboardInput;

/**
 * Clase DiscoMusical con la que se crean objetos que representan productos
 * @author Equipo D
 */
public class DiscoMusical extends Disco{

    private String fechaPublicacion;
    private ArrayList<String> listaCanciones = new ArrayList<>(); //Arreglo para la lista de canciones de un objeto de la clase Album
    private KeyboardInput resp = new KeyboardInput();
    
    /**
     * Este es el constructor vacio de un álbum.
     */
    public DiscoMusical() {
    }

    /**
     * Este es el constructor completo de un álbum.
     * @param sku Representa el código numérico de almacén con el que puede ser ubicado por los empleados.
     * @param precio Representa una cantidad monetaria del costo del producto.
     * @param nombre Representa una cadena de caracteres que componen el nombre del álbum.
     * @param artista Representa una cadena de caracteres que componen el nombre del artista del álbum.
     * @param fechaPublicacion Representa una cadena de caracteres que componen la fecha de publicación del álbum.
     * @param numCanciones Representa la cantidad numérica de canciones incluídas en el álbum.
     */
    public DiscoMusical(String sku, int precio, String nombre, String artista, String fechaPublicacion, int numCanciones) {
        super(artista, numCanciones, sku, precio, nombre);
        this.fechaPublicacion = fechaPublicacion;
        setCanciones();
    }
    
    public DiscoMusical(String sku, int precio, String nombre, String artista, String fechaPublicacion) {
        super(artista, 4, sku, precio, nombre);
        this.fechaPublicacion = fechaPublicacion;
        setCancionesGenerico();
    }
     
    /**
     * Con este metodo se modifica el atributo fechaPublicacion
     * @param fechaPublicacion Dato tipo String que representa la fecha de publicacion de un disco
     */
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    
    /**
     * Este método permite agregar canciones a un álbum dependiendo del máximo especificado para el álbum.
     */
    public void setCanciones(){
        String cancion;
        for (int i = 0; i < this.numCanciones; i++) {
            System.out.println("Ingrese nombre de la cancion " + i+1);
            cancion = resp.readString();
            listaCanciones.add(i, cancion);
        }
    }
    
    /**
     * Con este método se agregan canciones con titulos genericos para una muestra.
     */
    public void setCancionesGenerico(){
        String cancion;
        for (int i = 0; i < 4; i++) {
            listaCanciones.add(i, "cancion "+i);
        }
    }
    
    /**
     * Con este método se obtienen la lista de canciones del disco musical
     * @return Arreglo con datos tipo string que representa las canciones que contiene el disco musical
     */
    public ArrayList<String> getCanciones(){
        return listaCanciones;
    }
    
    /**
     * Este método permite desplegar en una lista con formato las canciones del álbum.
     */
    public void mostrarCanciones(){
        if(numCanciones>0){
            for (int i = 0; i < numCanciones; i++) {
                System.out.println("\n\t" + (i+1) + ". " + listaCanciones.get(i));
            }
        }else
            System.out.println("El album no cuenta con canciones.");
    }
    
    /**
     * Este método despligega toda la información pertinente al disco musical
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+ "\nFecha de publicacion: "+fechaPublicacion;
    }
    
    
}

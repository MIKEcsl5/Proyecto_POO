
package modelo.productos;

import java.util.ArrayList;
import vista.KeyboardInput;

/**
 *
 * @author Equipo D
 */
public class Album extends Producto{
    String artista;
    String fechaPublicacion;
    int numCanciones = 0;
    ArrayList<String> listaCanciones = new ArrayList<>(); //Arreglo para la lista de canciones de un objeto de la clase Album
    KeyboardInput resp = new KeyboardInput();
    
    /**
     * Este es el constructor vacio de un álbum.
     */
    public Album() {
    }

    /**
     * Este es el constructor completo de un álbum.
     * @param sku Representa el código numérico de almacén con el que puede ser ubicado por los empleados.
     * @param precio Representa una cantidad monetaria del costo del producto.
     * @param nombre Representa una cadena de caracteres que componen el nombre del álbum..
     * @param artista Representa una cadena de caracteres que componen el nombre del artista del álbum.
     * @param fechaPublicacion Representa una cadena de caracteres que componen la fecha de publicación del álbum.
     * @param numCanciones Representa la cantidad numérica de canciones incluídas en el álbum.
     */
    public Album(String sku, int precio, String nombre, String artista, String fechaPublicacion, int numCanciones) {
        super(sku, precio, nombre);
        this.artista = artista;
        this.fechaPublicacion = fechaPublicacion;
        this.numCanciones = numCanciones;
    }
    
    /**
     * Constructor utilizado para un album (solo se introducen nombre, artista y fecha de publicación).
     * @param nombre Representa una cadena de caracteres que componen el nombre del álbum..
     * @param artista Representa una cadena de caracteres que componen el nombre del artista del álbum.
     * @param fechaPublicacion Representa una cadena de caracteres que componen la fecha de publicación del álbum.
     */
     public Album(String nombre, String artista, String fechaPublicacion) {
        super(nombre);
        this.artista = artista;
        this.fechaPublicacion = fechaPublicacion;
    }

     
    //Métodos de información

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }
    
    /**
     * Este método permite agregar canciones a un álbum dependiendo del máximo especificado para el álbum.
     */
    public void setCanciones(){
        String cancion;
        for (int i = 0; i < numCanciones; i++) {
            System.out.println("Ingrese nombre de la cancion " + i);
            cancion = resp.readString();
            listaCanciones.add(i, cancion);
        }
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
            System.out.println("El album no cuenta con canciones. Revise el contenido con un Gerente");
    }
    
    public void info() {
        System.out.println(super.toString() + "\nArtista: " + artista + "\nFecha de Publicacion: " + fechaPublicacion + "\nNum. de Canciones: " + numCanciones + "\nLista de canciones: ");
        mostrarCanciones();
    }

    
   
}

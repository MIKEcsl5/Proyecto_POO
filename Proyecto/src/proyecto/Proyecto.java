/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

//se importa la clase gerente del paquete Login
import productos.Album;
import productos.DiscoVideo;
import login.Gerente;
import java.util.ArrayList;

/**
 *
 * @author Equipo D
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 1;
        KeyboardInput input = new KeyboardInput();
        ArrayList<Album> inventario = new ArrayList<>();
        
        while(opcion != 0){
            System.out.print("Que desea realizar\n 1)Iniciar sesion \n 2)Agregar album al inventario: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1: 
                    
                    break;
                case 2:
                    nuevoAlbum(inventario);
                    inventario.forEach((album) -> {
                        System.out.println(album.toString());
                    });
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    break;
                    
                case 6:
                    break;
                    
                case 7: 
                    break;
                default:
                    System.out.println(opcion + "no es opcion valida");
                break;
            }
        }
        
        /* Prueba ingresar datos
        KeyboardInput input = new KeyboardInput();
        System.out.println("Ingrese datos de la cancion");
        Cancion cancion1 = new Cancion();
        cancion1.fechaPublicacion = input.readString();
        System.out.println("fecha"+cancion1.fechaPublicacion);
        */
        
        //prueba: usar clases de otros paquetes
        //creando un areglo de album's
        /*for(Album album : inventario){
            System.out.println(album);
        } */ 
        
        
        
        
        
        
        Gerente pruebaGerente = new Gerente();
        System.out.println("toString Gerente:"+pruebaGerente.toString());     
    }
    
    public static void nuevoAlbum (ArrayList<Album> inventario){
        KeyboardInput input = new KeyboardInput();
        Album nuevoAlbum = new Album();
        System.out.println("ingrese nombre del artista");
        nuevoAlbum.setArtista(input.readString());
        System.out.println("ingrese nombre del titulo");
        nuevoAlbum.setTitulo(input.readString());
        inventario.add(nuevoAlbum);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import modelo.productos.*;
import vista.KeyboardInput;

/**
 *
 * @author line_
 */
public class Almacen {
    ArrayList<Producto> inventario;
    
    public Almacen() {
    }

    public Almacen(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }
    
    public Producto buscarProducto(ArrayList<Producto> inventario) {
        if(inventario.isEmpty()){
            System.out.println("\nInventario vacio......\n");
            return null;
        }
        int opcion = 0;
        String busqueda;
        KeyboardInput entrada = new KeyboardInput();
        System.out.println("\nBuscar por\n 1)Nombre\n 2)SKU\n\nOpción: ");
        opcion = entrada.readInteger();
        switch(opcion){
            case 1:
                System.out.println("\nIngrese el nombre del producto que busca: ");
                busqueda = entrada.readString();
                Producto tmpProducto = new Producto(); 
                tmpProducto.setNombre(busqueda);
               
                for(int i=0;i<inventario.size();i++) {
                    if(inventario.get(i).getNombre().equals(busqueda)){
                        System.out.println("\nDetalles del producto: "+inventario.get(i)+"\n");
                        tmpProducto.setPrecio(inventario.get(i).getPrecio());
                        tmpProducto.setSku(inventario.get(i).getSku());
                        return tmpProducto;
                    } 
                    
                    System.out.println("No se ha encontrado el producto\n");
                    return null;
                }
                break;
                
            case 2:
                System.out.println("\nIngrese el SKU del producto que busca: ");
                busqueda = entrada.readString();
                Producto tmpProducto2 = new Producto(); 
                tmpProducto2.setSku(busqueda);
                
                for(int i=0;i<inventario.size();i++) {
                    if(inventario.get(i).getSku().equals(busqueda)){
                        System.out.println("\nDetalles del producto: "+inventario.get(i)+"\n");
                        tmpProducto2.setPrecio(inventario.get(i).getPrecio());
                        tmpProducto2.setNombre(inventario.get(i).getNombre());
                        return tmpProducto2;
                    } 
                    
                    System.out.println("No se ha encontrado el producto\n");
                    return null;
                }
                break;
                
            default:
                System.out.println("Opcion no valida");
                return null;
                
        }
        return null;
       
    }
    
    public void agregarProducto (ArrayList<Producto> inventario){
        int opcion2 = 0, numCanciones, precio; //String artista, int numCanciones, float duracion, String sku, int precio, String nombre
        String nombre, artista, sku, fechaPublicacion;
        float duracion;
        KeyboardInput input = new KeyboardInput(), tmpNombre = new KeyboardInput(), tmpArtista = new KeyboardInput(), tmpFechaPublicacion = new KeyboardInput(), tmpNumCanciones = new KeyboardInput(), tmpPrecio = new KeyboardInput(), tmpSku = new KeyboardInput(), tmpDuracion = new KeyboardInput();
       
        while (opcion2 != 4){
            System.out.print("\nQue producto desea agrear \n 1)Disco de musica \n 2)Disco de video\n 3)Audifonos \n 4)Cancelar\n\nOpción: ");
            opcion2 = input.readInteger();
            switch(opcion2){
                case 1:
                    System.out.println("\nIngrese nombre del disco de video: ");
                    nombre = tmpNombre.readString();
                    
                    System.out.println("\nIngrese nombre del artista: ");
                    artista = tmpArtista.readString();
                    
                    System.out.println("\nIngrese fecha de publicacion: ");
                    fechaPublicacion = tmpFechaPublicacion.readString();
                    
                    System.out.println("\nIngrese el numero de canciones: ");
                    numCanciones = tmpNumCanciones.readInteger();
                    
                    System.out.println("\nIngrese el precio: ");
                    precio = tmpPrecio.readInteger();
                    
                    System.out.println("\nIngrese el SKU de identificacion: ");
                    sku = tmpSku.readString();
                    
                    inventario.add(new Album(sku, precio, nombre, artista, fechaPublicacion, numCanciones));//creacion de objeto en tiempo dinamico
                    break;
                   
                case 2:
                    System.out.println("\nIngrese nombre del disco musical: ");
                    nombre = tmpNombre.readString();
                    
                    System.out.println("\nIngrese nombre del artista: ");
                    artista = tmpArtista.readString();
                    
                    System.out.println("\nIngrese fecha de publicacion: ");
                    fechaPublicacion = tmpFechaPublicacion.readString();
                    
                    System.out.println("\nIngrese la duracion: ");
                    duracion = tmpDuracion.readFloat();
                    
                    System.out.println("\nIngrese el numero de canciones: ");
                    numCanciones = tmpNumCanciones.readInteger();
                    
                    System.out.println("\nIngrese el precio: ");
                    precio = tmpPrecio.readInteger();
                    
                    System.out.println("\nIngrese el SKU de identificacion: ");
                    sku = tmpSku.readString();
                    
                    inventario.add(new DiscoVideo(duracion, artista, numCanciones, sku, precio, nombre));//creacion de objeto en tiempo dinamico
                    break;
                case 3:
                    System.out.println("\nIngrese marca y/o modelo de los audifonos: ");
                    nombre = tmpNombre.readString();
                    
                    System.out.println("\nIngrese el precio: ");
                    precio = tmpPrecio.readInteger();
                    
                    System.out.println("\nIngrese el SKU de identificacion: ");
                    sku = tmpSku.readString();
                    
                    inventario.add(new Audifonos(sku, precio, nombre));
                    break;
                case 4:
                    System.out.println("");
                    opcion2 = 4;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }  
}


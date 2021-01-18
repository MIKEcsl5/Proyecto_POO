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
 * @author Daniel Rojas
 */
public class Almacen {
    ArrayList<Producto> inventario;
    
    public Almacen() {
    }

    public Almacen(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }
    
    public Producto buscarProducto() {
        if(inventario.isEmpty()){
            System.out.println("\nInventario vacio......\n");
            return null;
        }
        int opcion = 0;
        String busqueda;
        Producto prodBuscado;
        KeyboardInput entrada = new KeyboardInput();
        System.out.println("\nBuscar por\n\t 1)Nombre\n\t 2)SKU\n\nOpción: ");
        opcion = entrada.readInteger();
        switch(opcion){
            case 1: //Busqueda por nombre
                System.out.println("\nIngrese el nombre del producto que busca: ");
                busqueda = entrada.readString();
                for(int i=0;i<inventario.size();i++) {
                    prodBuscado = inventario.get(i);
                    if(prodBuscado.getNombre().equals(busqueda)){
                        System.out.println(prodBuscado.toString());
                        return inventario.remove(i);
                    } 
                }
                System.out.println("No se ha encontrado el producto\n");
                return null;
                
            case 2:
                System.out.println("\nIngrese el SKU del producto que busca: ");
                busqueda = entrada.readString();
                for(int i=0;i<inventario.size();i++) {
                    prodBuscado = inventario.get(i);
                    if(prodBuscado.getSku().equals(busqueda)){
                        System.out.println(prodBuscado.toString());
                        return inventario.remove(i);
                    } 
                }
                System.out.println("No se ha encontrado el producto\n");
                return null;
                
            default:
                System.out.println("Opcion no valida");
                return null;
                
        }
       
    }
    
    public void agregarProducto (ArrayList<Producto> inventario){
        int opcion = 0, numCanciones, precio, cantidad; //String artista, int numCanciones, float duracion, String sku, int precio, String nombre
        String nombre, artista, sku, fechaPublicacion;
        float duracion;
        KeyboardInput input = new KeyboardInput(), tmpNombre = new KeyboardInput(), 
                tmpArtista = new KeyboardInput(), tmpFechaPublicacion = new KeyboardInput(), 
                tmpNumCanciones = new KeyboardInput(), tmpPrecio = new KeyboardInput(), 
                tmpSku = new KeyboardInput(), tmpDuracion = new KeyboardInput(),
                tmpCantidad = new KeyboardInput();
       
        while (opcion != 4){
            System.out.print("\nQue producto desea agregar \n 1)Disco de musica \n 2)Disco de video\n 3)Audifonos \n 4)Cancelar\n\nOpción: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1:
                    System.out.println("\nIngrese nombre del disco de musica: ");
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
                    
                    System.out.println("\nIngrese la cantidad de productos para agregar: ");
                    cantidad = tmpCantidad.readInteger();
                    for (int i = 0; i < cantidad; i++) {
                        inventario.add(new DiscoMusical(sku,precio,nombre,artista,fechaPublicacion,numCanciones));
                    }
                    break;
                   
                case 2:
                    System.out.println("\nIngrese nombre del disco de video: ");
                    nombre = tmpNombre.readString();
                    
                    System.out.println("\nIngrese nombre del artista: ");
                    artista = tmpArtista.readString();
                    
                    System.out.println("\nIngrese la duracion: ");
                    duracion = tmpDuracion.readFloat();
                    
                    System.out.println("\nIngrese el numero de canciones: ");
                    numCanciones = tmpNumCanciones.readInteger();
                    
                    System.out.println("\nIngrese el precio: ");
                    precio = tmpPrecio.readInteger();
                    
                    System.out.println("\nIngrese el SKU de identificacion: ");
                    sku = tmpSku.readString();
                    
                    System.out.println("\nIngrese la cantidad de productos para agregar: ");
                    cantidad = tmpCantidad.readInteger();
                    for (int i = 0; i < cantidad; i++) {
                        inventario.add(new DiscoVideo(duracion, artista, numCanciones, sku, precio, nombre));
                    }
                    //creacion de objeto en tiempo dinamico
                    break;
                    
                case 3:
                    System.out.println("\nIngrese marca y/o modelo de los audifonos: ");
                    nombre = tmpNombre.readString();
                    
                    System.out.println("\nIngrese el precio: ");
                    precio = tmpPrecio.readInteger();
                    
                    System.out.println("\nIngrese el SKU de identificacion: ");
                    sku = tmpSku.readString();
                    
                    System.out.println("\nIngrese la cantidad de productos para agregar: ");
                    cantidad = tmpCantidad.readInteger();
                    for (int i = 0; i < cantidad; i++) {
                        inventario.add(new Audifonos(sku, precio, nombre));
                    }
                    break;
                    
                case 4:
                    System.out.println("\nOperacion cancelada");
                    opcion = 4;
                    break;
                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }
        }
    }
    
    public void llenarInventario(ArrayList<Producto> inventario){
        for (int i = 0; i < 10; i++)
            inventario.add(new DiscoMusical("M0"+i,250,"Disco de musica "+i,"Generico","2021",10));
        for (int i = 0; i < 10; i++)
            inventario.add(new DiscoVideo(50f, "Generico", 10, "V0"+i, 300, "Disco de video "+i));
        for (int i = 0; i < 10; i++)
            inventario.add(new Audifonos("A0"+i, 750, "Audifonos "+i));
    }
}


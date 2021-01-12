/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import vista.caja.Caja;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.productos.*;
import vista.KeyboardInput;

/**
 *
 * @author Equipo D
 */
public class Vendedor extends Empleado {
    
    public Vendedor() {
        super.setPinAcceso(3170); //PIN de accesos por defecto para un objeto de la clase Vendedor
    }

    public Vendedor(String nombre, int numEmpleado) {
        super(nombre, numEmpleado);
        super.setPinAcceso(3170);
    }
    
    public void venderProducto(ArrayList<Object> inventario) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        Object producto = null;
        producto = buscarProducto(inventario);
        if(producto == null){
            return;
        }else{
            Caja caja_1 = new Caja();
            caja_1.cobrar(producto);
            caja_1.crearArchivoTicket(producto);
        }
        
        /* ciclo que muestra todos los metodos de un objeto
        Method [] metodos = objeto.getMethods(); 
        System.out.println("Prueba precio:"+metodos[9].invoke(producto));
        System.out.println("Lista de atributos del objeto recivido");
        for(Method allMetodos: metodos){
            System.out.println("sdsadsdadsa XDXD: "+allMetodos);
        }*/ 
    }
    
    public Object buscarProducto(ArrayList<Object> inventario) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        int opcion = 0;
        String busqueda;
        KeyboardInput entrada = new KeyboardInput();
        System.out.println("Buscar por\n 1)Nombre\n 2)SKU");
        opcion = entrada.readInteger();
        switch(opcion){
            case 1:
                System.out.println("Ingrese el nombre del producto que busca: ");
                busqueda = entrada.readString();
                Method metodoGetNombre;
                for(Object tmpProducto : inventario) {
                    metodoGetNombre = tmpProducto.getClass().getMethod("getNombre");
                    if(busqueda.equals(metodoGetNombre.invoke(tmpProducto))){
                        System.out.println("Detalles del producto: "+tmpProducto.toString());
                        return tmpProducto;
                    }
                }
                break;
                
            case 2:
                System.out.println("Ingrese el SKU del producto que busca: ");
                busqueda = entrada.readString();
                Method metodoGetSku;
                for(Object tmpProducto : inventario) {
                    metodoGetNombre = tmpProducto.getClass().getMethod("getSku");
                    if(busqueda.equals(metodoGetNombre.invoke(tmpProducto))){
                        System.out.println("Detalles del producto: "+tmpProducto.toString());
                        return tmpProducto;
                    }
                }
                break;
                
            default:
                System.out.println("Opcion no valida");
                return null;
                
        }
        return null;
        
        
    }
    
    public void reproducirMultimedia(){
        
    }
    
    public void acomodarInventario(ArrayList<Object> inventario){
        
    }
    
    public void imprimirListaInventario(ArrayList<Object> inventario){
        Iterator iterador = inventario.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
    
    public void agregarProducto (ArrayList<Object> inventario){
        int opcion2 = 0, numCanciones, precio; //String artista, int numCanciones, float duracion, String sku, int precio, String nombre
        String nombre, artista, sku, fechaPublicacion;
        float duracion;
        KeyboardInput input = new KeyboardInput(), tmpNombre = new KeyboardInput(), tmpArtista = new KeyboardInput(), tmpFechaPublicacion = new KeyboardInput(), tmpNumCanciones = new KeyboardInput(), tmpPrecio = new KeyboardInput(), tmpSku = new KeyboardInput(), tmpDuracion = new KeyboardInput();
       
        while (opcion2 != 4){
            System.out.print("Que producto desea agrear \n 1)Disco de musica \n 2)Disco de video\n 3)Audifonos \n 4)Cancelar: ");
            opcion2 = input.readInteger();
            switch(opcion2){
                case 1:
                    System.out.println("Ingrese nombre del disco de video: ");
                    nombre = tmpNombre.readString();
                    
                    System.out.println("Ingrese nombre del artista: ");
                    artista = tmpArtista.readString();
                    
                    System.out.println("Ingrese fecha de publicacion: ");
                    fechaPublicacion = tmpFechaPublicacion.readString();
                    
                    System.out.println("Ingrese el numero de canciones");
                    numCanciones = tmpNumCanciones.readInteger();
                    
                    System.out.println("Ingrese el precio");
                    precio = tmpPrecio.readInteger();
                    
                    System.out.println("Ingrese el SKU de identificacion");
                    sku = tmpSku.readString();
                    
                    inventario.add(new Album(sku, precio, nombre, artista, fechaPublicacion, numCanciones));//creacion de objeto en tiempo dinamico
                    break;
                   
                case 2:
                    System.out.println("Ingrese nombre del disco musical: ");
                    nombre = tmpNombre.readString();
                    
                    System.out.println("Ingrese nombre del artista: ");
                    artista = tmpArtista.readString();
                    
                    System.out.println("Ingrese fecha de publicacion: ");
                    fechaPublicacion = tmpFechaPublicacion.readString();
                    
                    System.out.println("Ingrese la duracion: ");
                    duracion = tmpDuracion.readFloat();
                    
                    System.out.println("Ingrese el numero de canciones");
                    numCanciones = tmpNumCanciones.readInteger();
                    
                    System.out.println("Ingrese el precio");
                    precio = tmpPrecio.readInteger();
                    
                    System.out.println("Ingrese el SKU de identificacion");
                    sku = tmpSku.readString();
                    
                    inventario.add(new DiscoVideo(duracion,artista, numCanciones, sku, precio, nombre));//creacion de objeto en tiempo dinamico
                    break;
                case 3:
                    System.out.println("Ingrese marca y/o modelo de los audifonos: ");
                    nombre = tmpNombre.readString();
                    
                    System.out.println("Ingrese el precio");
                    precio = tmpPrecio.readInteger();
                    
                    System.out.println("Ingrese el SKU de identificacion");
                    sku = tmpSku.readString();
                    
                    inventario.add(new Audifonos(sku, precio, nombre));
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
    
    public void editarProducto (ArrayList<Object> inventario){
        
    }

    @Override
    public String toString() {
        return super.toString() +  "Vendedor{" + '}';
    }
    
    
}

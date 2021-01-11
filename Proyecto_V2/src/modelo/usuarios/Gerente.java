/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import vista.caja.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.productos.*;
import proyecto_v2.KeyboardInput;

/**
 *
 * @author Equipo D
 */
public class Gerente extends Empleado{

    public Gerente() {
        super.setPinAcceso(2390); //PIN de accesos por defecto para un objeto de la clase Gerente
    }

    public Gerente(String nombre, int numEmpleado) {
        super(nombre, numEmpleado);
        super.setPinAcceso(2390);
    }
    
    
    
    public void venderProducto(ArrayList<Producto> inventario) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
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
    
    public Object buscarProducto(ArrayList<Producto> inventario) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        int opcion = 0;
        String busqueda;
        KeyboardInput entrada = new KeyboardInput();
        System.out.println("Buscar por\n 1)Nombre\n 2)SKU");
        opcion = entrada.readInteger();
        switch(opcion){
            case 1:
                System.out.println("Ingrese el nombre del producto que busca: ");
                busqueda = entrada.readString();
                Producto tmpProducto = new Producto(); 
                tmpProducto.setNombre(busqueda);
               
                for(int i=0;i<inventario.size();i++) {
                    if(inventario.get(i).getNombre().equals(busqueda)){
                        System.out.println("Detalles del producto: "+inventario.get(i));
                        tmpProducto.setPrecio(inventario.get(i).getPrecio());
                        tmpProducto.setSku(inventario.get(i).getSku());
                        return tmpProducto;
                    } else {
                        System.out.println("No se ha encontrado el producto");
                    }
                }
                break;
                
            case 2:
                System.out.println("Ingrese el SKU del producto que busca: ");
                busqueda = entrada.readString();
                Producto tmpProducto2 = new Producto(); 
                tmpProducto2.setSku(busqueda);
                
                for(int i=0;i<inventario.size();i++) {
                    if(inventario.get(i).getSku().equals(busqueda)){
                        System.out.println("Detalles del producto: "+inventario.get(i));
                        tmpProducto2.setPrecio(inventario.get(i).getPrecio());
                        tmpProducto2.setNombre(inventario.get(i).getNombre());
                        return tmpProducto2;
                    } else {
                        System.out.println("No se ha encontrado el producto");
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
                    
                    inventario.add(new DiscoVideo(duracion, artista, numCanciones, sku, precio, nombre));//creacion de objeto en tiempo dinamico
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
        return super.toString() + "Gerente{" + '}';
    }
    
    
}

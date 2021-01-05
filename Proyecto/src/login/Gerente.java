/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import caja.Caja;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import productos.*;
import proyecto.KeyboardInput;

/**
 *
 * @author Equipo D
 */
public class Gerente extends Empleado {

    public Gerente() {
        super.setPinAcceso(2390); //PIN de accesos por defecto para un objeto de la clase Gerente
    }

    public Gerente(String nombre, int numEmpleado) {
        super(nombre, numEmpleado);
        super.setPinAcceso(2390);
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
        KeyboardInput entrada = new KeyboardInput();
        System.out.println("Ingrese el nombre del producto que busca: ");
        String busqueda = entrada.readString();
        Method metodoGetNombre;
        for(Object tmpProducto : inventario) {
            metodoGetNombre = tmpProducto.getClass().getMethod("getNombre");
            if(busqueda.equals(metodoGetNombre.invoke(tmpProducto))){
                System.out.println("Detalles del producto: "+tmpProducto.toString());
                return tmpProducto;
            }
        }
        System.out.println("No se encontro el producto buscado");
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
        int opcion = 0;
        KeyboardInput input = new KeyboardInput();
        KeyboardInput datos = new KeyboardInput();
        while (opcion != 4){
            System.out.print("Que producto desea agrear\n 1)Disco de musica \n 2)Disco de video\n 3)Audifonos\n 4)Cancelar: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1:
                   inventario.add(new Album("aaaaaaaaaaa", "XDXDXD", "1/1/1"));//creacion de objeto en tiempo dinamico
                   break;
                   
                case 2:
                    inventario.add(new DiscoVideo());
                    break;
                case 3:
                    inventario.add(new Audifonos());
                    break;
            }
        }
        
       
        Album nuevoAlbum = new Album();
        System.out.println("ingrese nombre del artista");
        nuevoAlbum.setArtista(input.readString());
        System.out.println("ingrese nombre del titulo");
        nuevoAlbum.setNombre(input.readString());
        inventario.add(nuevoAlbum);
    }
    
    public void editarProducto (ArrayList<Object> inventario){
        
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + '}';
    }
    
    
}

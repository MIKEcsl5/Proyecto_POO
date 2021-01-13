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
import modelo.*;

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
        Producto producto = null;
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
    
    public Producto buscarProducto(ArrayList<Producto> inventario) {
        Producto producto;
        Almacen almacen = new Almacen();
        producto = almacen.buscarProducto(inventario);
        return producto;
   
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
    
    public void agregarProducto (ArrayList<Producto> inventario){
        Almacen almacen = new Almacen();
        almacen.agregarProducto(inventario);
    }
    
    public void editarProducto (ArrayList<Object> inventario){
        
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + '}';
    }
    
    
}

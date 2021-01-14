/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import controlador.Venta;
import vista.caja.Caja;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Almacen;
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
    
    public void venderProducto(ArrayList<Producto> inventario) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        Venta venta_1 = null;
        venta_1.venderProducto(inventario);
    }
    
    public Producto buscarProducto(ArrayList<Producto> inventario){
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
        return super.toString() +  "Vendedor{" + '}';
    }
    
    
}

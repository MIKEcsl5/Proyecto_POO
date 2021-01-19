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
        super.setPinAcceso("3170"); //PIN de accesos por defecto para un objeto de la clase Vendedor
    }
    
     public Vendedor(String nombre, String numEmpleado) {
        super(nombre, numEmpleado);
    }
     
    public Vendedor(String nombre, String numEmpleado, String pass) {
        super(nombre, numEmpleado, "Vendedor", pass);
        super.setPinAcceso(pass);
    }
    
    public void venderProducto(Almacen almacen, String nombreUsuario) {
        Venta venta_1 = new Venta();
        venta_1.venderProducto(almacen, nombreUsuario);
       
    }
    
    public void buscarProducto(Almacen almacen) {
        almacen.buscarProducto(0);
    }
    
    public void ponerCancion(Almacen almacen){
        
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
       almacen.agregarProducto(); 
    }
    
    public void editarProducto (ArrayList<Object> inventario){
        
    }

    @Override
    public String toString() {
        return super.toString() +  "Puesto: Vendedor";
    }
    
    
}

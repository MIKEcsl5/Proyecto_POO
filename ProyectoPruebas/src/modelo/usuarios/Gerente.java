/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import java.util.ArrayList;
import java.util.Iterator;
import modelo.productos.*;
import modelo.*;
import controlador.Venta;

/**
 *
 * @author Equipo D
 */
public class Gerente extends Empleado  {

    public Gerente(){
        super.setPinAcceso("2390"); //PIN de accesos por defecto para un objeto de la clase Gerente
    }
    
    public Gerente(String nombre, String numEmpleado) {
        super(nombre, numEmpleado);
    }

    public Gerente(String nombre, String numEmpleado, String pass) {
        super(nombre, numEmpleado, "Gerente", pass);
        super.setPinAcceso(pass);
    }
    
    public void venderProducto(Almacen almacen, String nombreUsuario) {
        Venta venta_1 = new Venta();
        venta_1.venderProducto(almacen, nombreUsuario);
       
    }
    
    public void buscarProducto(Almacen almacen) {
        almacen.buscarProducto(0);
    }
    
    
    public void reproducirMultimedia(){
        
    }
    
    public void imprimirListaInventario(ArrayList<Producto> inventario){
        Iterator iterador = inventario.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
    
    public void agregarProducto (Almacen almacen){
        almacen.agregarProducto();
    }
    
    public void editarProducto (ArrayList<Producto> inventario){
        
    }

    @Override
    public String toString() {
        return super.toString() + "Puesto: Gerente";
    }
    
    
}

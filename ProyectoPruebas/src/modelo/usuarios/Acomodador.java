/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import controlador.*;
import java.util.ArrayList;
import modelo.Almacen;
import modelo.productos.Producto;
import vista.KeyboardInput;

/**
 *
 * @author Equipo D
 */
public class Acomodador extends Empleado {
    
    public Acomodador() {
        super.setPinAcceso("4030"); //PIN de accesos por defecto para un objeto de la clase Acomodador
    }

    public Acomodador(String nombre, int numEmpleado, String pass) {
        super(nombre, numEmpleado, "Acomodador");
        super.setPinAcceso(pass);
    }
    
   public Producto buscarProducto(ArrayList<Producto> inventario) {
        Producto producto;
        Almacen almacen = new Almacen(inventario);
        producto = almacen.buscarProducto(0);
        return producto;
    }
    
    public void ponerCancion(){
        
    }
    
    public void ordenarInventario(ArrayList<Producto> inventario){
        int opcion;
        KeyboardInput input = new KeyboardInput();
        System.out.println("Por que valor desea ordenar la lista de productos\n 1)Nombre (menor a mayor)\n 2)Precio (menor a mayor)");
        opcion = input.readInteger();
        switch(opcion){
            case 1:
                inventario.sort(new NombreComparator());
                for(Producto tmpProducto : inventario){
                    System.out.println(tmpProducto.getNombre());
                }
            break;
            
            case 2:
                inventario.sort(new PrecioComparator());
                for(Producto tmpProducto : inventario){
                    System.out.println(tmpProducto.getNombre()+ tmpProducto.getPrecio());
                }
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Puesto: Acomodador";
    }
    
    
    
}

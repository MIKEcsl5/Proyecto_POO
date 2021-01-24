/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import controlador.Venta;
import modelo.almacen.Almacen;


/**
 * Clase Vendedor que hereda de la Clase Acomodador y tiene mas metodos
 * @author Equipo D
 */
public class Vendedor extends Acomodador {
    
    /**
     * Constructor vacio de la clase Vendedor
     */
    public Vendedor() {
        super.setPinAcceso("3170"); //PIN de accesos por defecto para un objeto de la clase Vendedor
    }
    
    /**
     * Constructor sobrecargado
     * @param nombre Dato tipo String que representa el nombre del Acomodador
     * @param numEmpleado Dato tipo String que representa el numero de empleado
     */
     public Vendedor(String nombre, String numEmpleado) {
        super(nombre, numEmpleado);
    }

    /**
     * Constructor sobrecargado
     * @param nombre Dato tipo String que representa el nombre del Vendedor
     * @param numEmpleado Dato tipo String que representa el numero de empleado
     * @param pass Dato tipo String que representa la contraseña del empleado
     */
    public Vendedor(String nombre, String numEmpleado, String pass) {
        super(nombre, numEmpleado, pass);
        super.setPinAcceso(pass);
    }
    
    /**
     * Este método crea un objeto de la clase Venta para inciar un proceso de venta de un producto
     * @param almacen Recibe almacen que contiene el inventario de los productos
     * @param empleadoActual Recibe objeto que representa el empleado con sesion activa actual
     */
    public void venderProducto(Almacen almacen, Empleado empleadoActual) {
        Venta venta_1 = new Venta();
        venta_1.venderProducto(almacen, empleadoActual);
    }
    
    /**
     * 
     * @return Retorna el puesto que ejerce el empleado
     */
    @Override
    public String toString() {
        return "Puesto: Vendedor";
    }
    
    
}

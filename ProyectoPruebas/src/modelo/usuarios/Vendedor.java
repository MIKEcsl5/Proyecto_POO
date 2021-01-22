/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import controlador.Venta;
import modelo.Almacen;


/**
 *
 * @author Equipo D
 */
public class Vendedor extends Acomodador {
    
    public Vendedor() {
        super.setPinAcceso("3170"); //PIN de accesos por defecto para un objeto de la clase Vendedor
    }
    
     public Vendedor(String nombre, String numEmpleado) {
        super(nombre, numEmpleado);
    }

    public Vendedor(String nombre, String numEmpleado, String pass) {
        super(nombre, numEmpleado, pass);
        super.setPinAcceso(pass);
    }
    
    public void venderProducto(Almacen almacen, Empleado empleadoActual) {
        Venta venta_1 = new Venta();
        venta_1.venderProducto(almacen, empleadoActual);
    }

    @Override
    public String toString() {
        return "Puesto: Vendedor";
    }
    
    
}

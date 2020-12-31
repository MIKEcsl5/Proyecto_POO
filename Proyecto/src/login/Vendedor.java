/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

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

    @Override
    public String toString() {
        return super.toString() +  "Vendedor{" + '}';
    }
    
    
}

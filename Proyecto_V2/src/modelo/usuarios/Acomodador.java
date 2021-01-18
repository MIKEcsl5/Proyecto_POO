/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

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
    
    public void buscar(){
        
    }
    
    public void ponerCancion(){
        
    }

    @Override
    public String toString() {
        return super.toString() + "Puesto: Acomodador";
    }
    
    
    
}

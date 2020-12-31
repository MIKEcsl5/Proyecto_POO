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
public class Gerente extends Empleado {

    public Gerente() {
        super.setPinAcceso(2390); //PIN de accesos por defecto para un objeto de la clase Gerente
    }

    public Gerente(String nombre, int numEmpleado) {
        super(nombre, numEmpleado);
        super.setPinAcceso(2390);
    }
    
    
    
    public static void vender(){
        
    }
    
    public static void buscar(){
        
    }
    
    public static void ponerCancion(){
        
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + '}';
    }
    
    
}

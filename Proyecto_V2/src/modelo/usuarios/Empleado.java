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
public class Empleado {
    String nombre;
    int numEmpleado;
    private int pinAcceso;

    public Empleado() {
        this.nombre = "Nombre no asignado";
        this.numEmpleado = 0000;
        
    }
    
    public Empleado(String nombre, int numEmpleado) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getPinAcceso() {
        return pinAcceso;
    }

    public void setPinAcceso(int pinAcceso) {
        this.pinAcceso = pinAcceso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", pinAcceso=" + pinAcceso + '}';
    }
  
}

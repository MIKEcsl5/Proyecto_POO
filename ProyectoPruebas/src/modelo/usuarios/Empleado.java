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
    String puesto;
    String numEmpleado;
    private String pinAcceso;

     public Empleado() {
        this.numEmpleado = "0000";
    }
     
    public Empleado(String nombre, String numEmpleado) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
    }
    
    public Empleado(String nombre, String numEmpleado, String puesto, String contraseña) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.puesto = puesto;
        this.pinAcceso = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getPinAcceso() {
        return pinAcceso;
    }

    public void setPinAcceso(String pinAcceso) {
        this.pinAcceso = pinAcceso;
    }

   

    @Override
    public String toString() {
        return "Empleado = " + "nombre: " + nombre + ", numEmpleado: " + numEmpleado + ", pinAcceso: " + pinAcceso + ", ";
    }
  
}

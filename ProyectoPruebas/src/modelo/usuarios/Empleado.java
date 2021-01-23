/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

/**
 * Clase Empleado de la cual hereda la clase Acomodador
 * @author Equipo D
 */
public class Empleado {
    String nombre;
    String puesto;
    String numEmpleado;
    private String pinAcceso;

    /**
     * Constructor vacio de la clase empleado
     */
    public Empleado() {
        this.numEmpleado = "0000";
    }
    
    /**
     * Constructor sobrecargado
     * @param nombre Dato tipo String que representa el nombre del empleado
     * @param numEmpleado Dato tipo entero que representa un numero de identificacion
     */
    public Empleado(String nombre, String numEmpleado) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
    }
    
    /**
     * Constructor sobrecargado
     * @param nombre Dato tipo String que representa el nombre del empleado
     * @param numEmpleado Dato tipo entero que representa un numero de identificacion
     * @param puesto Dato tipo String que representa el puesto que ejerce el empleado
     * @param contraseña Dato tipo Stirng que representa la contraseña de acceso de
     */
    public Empleado(String nombre, String numEmpleado, String puesto, String contraseña) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.puesto = puesto;
        this.pinAcceso = contraseña;
    }

    /**
     * Con este método se obtiene el nombre del empleado
     * @return Retorna dato tipo String que representa el nommbre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Con este método se modifia el atributo nombre
     * @param nombre Dato tipo String que representa el nombre del empleado 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Con este método se obtiene el puesto que ejerce el empleado
     * @return Retorna dato tipo String que representa el puesto que ejerce el empleado
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Con este metodo se modifica el atributo puesto
     * @param puesto Dato tipo String que representa el puesto que ejerce el empleado
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Este metodo devuelve el numero de empleado
     * @return Retorna dato tipo String del atributo numEmpleado
     */
    public String getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Este método modifica el atributo numEmpleado
     * @param numEmpleado Dato tipo String que representa el numero de empleado
     */
    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * Con este método se obtiene el atributo de pinAcceso
     * @return Retorna dato tipo String que representa la constraseña del empleado
     */
    public String getPinAcceso() {
        return pinAcceso;
    }
    
    /**
     * Con este método se modifica el atributo pinAcceso
     * @param pinAcceso Dato tipo String que representa la contraseña del empleado
     */
    public void setPinAcceso(String pinAcceso) {
        this.pinAcceso = pinAcceso;
    }
    
    /**
     * 
     * @return Retorna los atributos para ser imprimidos
     */
    @Override
    public String toString() {
        return "Empleado = " + "nombre: " + nombre + ", numEmpleado: " + numEmpleado + ", pinAcceso: ";
    }
  
}

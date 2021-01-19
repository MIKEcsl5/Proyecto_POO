/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.productos;

/**
 *
 * @author Equipo D
 */
public class Audifonos extends Producto{
    
    /**
     * Este es el constructor vacío de los Audífonos
     */
    public Audifonos() {
    }

    /**
     * Este es el constructor completo de los Audífonos
     * @param sku Representa el código numérico con el que se identifica en almacén a los audífonos.
     * @param precio Representa el valor monetario (numérico) de los audífonos.
     * @param nombre Representa una cadena de caracteres que componen el modelo de audífonos.
     */
    public Audifonos(String sku, int precio, String nombre) {
        super(sku, precio, nombre);
    }

    //Métodos de información  

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}

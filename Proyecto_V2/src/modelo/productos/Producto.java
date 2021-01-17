/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.productos;

/**
 *
 * @author socce
 */
public class Producto {
    public String nombre;
    public String sku;
    public int precio = 0;

    /**
     * Es el constructor de la clase producto (no debe ser instanciado por si mismo como una entidad).
     */
    public Producto() {
    }

    /**
     * Este es el constructor completo de la clase Producto (no debe ser instanciada como una entidad).
     * @param sku Representa el código numérico con el que se identifica en almacén un producto.
     * @param precio Representa el valor monetario (numérico) del producto.
     * @param nombre Representa una cadena de caracteres que componen el modelo del producto.
     */
    public Producto(String sku, int precio, String nombre) {
        this.nombre = nombre;
        this.sku = sku;
        this.precio = precio;
    }
    
    /**
     * Este es el constructor que únicamente asigna el nombre del producto.
     * @param nombre Representa una cadena de caracteres que componen el modelo del producto.
     */
    public Producto(String nombre) {
        this.nombre = nombre;
    }

    //Métodos de información
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nSKU: " + sku + "\nPrecio: $" + precio;
    }


}

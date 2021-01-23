/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.productos;

/**
 * Clase Producto de la cual van a heredar las clases Disco y Audifonos
 * @author Equipo D
 */
public class Producto {
    protected String nombre;
    protected String sku;
    protected int precio = 0;

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
     * Con este método obtenemos el nombre del producto
     * @return Dato tipo String que representa el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Con este metodo obtenemos el SKU de identificación del producto
     * @return Dato tipo String que representa el SKU de identificacion del producto
     */
    public String getSku(){
        return sku;
    }

    /**
     * Este método modifica el atributo nombre
     * @param nombre Dato tipo String que representa el nombre de un producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este metodo modifica el atributo SKU
     * @param sku Dato tipo String que representa el SKU de identificacion del producto
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * Este método modifica el atributo Precio 
     * @param precio Dato tipo entero que representa el precio de un producto
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Con este método se obtiene el Precio de un producto
     * @return Retorna dato tipo entero que representa el Precio de un producto
     */
    public int getPrecio() {
        return precio;
    }
    
    /**
     * 
     * @return Retorna los datos de un producto para que sean impresos
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nSKU: " + sku + "\nPrecio: $" + precio;
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author socce
 */
public class Producto {
    public String nombre;
    private int sku;
    private int precio = 0;

    public Producto() {
    }

    public Producto(int sku, int precio, String nombre) {
        this.nombre = nombre;
        this.sku = sku;
        this.precio = precio;
    }
    
    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", sku=" + sku + ", precio=" + precio + '}';
    }


}

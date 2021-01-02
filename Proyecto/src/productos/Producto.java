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
    private int sku;
    private int precio = 0;

    public Producto() {
    }

    public Producto(int sku, int precio) {
        this.sku = sku;
        this.precio = precio;
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
        return "Producto{" + "sku=" + sku + ", precio=" + precio + '}';
    }

}

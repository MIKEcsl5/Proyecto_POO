/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author Equipo D
 */
public class Audifonos extends Producto{
    
    public Audifonos() {
    }

    public Audifonos(String sku, int precio, String nombre) {
        super(sku, precio, nombre);
    }

    @Override
    public String toString() {
        return super.toString() + "audifonos{" + '}';
    }
    
    
}

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

    public Audifonos(int sku, int precio) {
        super(sku, precio);
    }

    @Override
    public String toString() {
        return super.toString() + "audifonos{" + '}';
    }
    
    
}

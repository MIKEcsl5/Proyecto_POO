/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.caja;

import modelo.productos.Producto;

/**
 *
 * @author Equipo D
 */
public class Ticket {
    Producto producto;
    String fecha;

    public Ticket() {
    }

    public Ticket(Producto producto, String fecha) {
        this.producto = producto;
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ticket{" + "producto=" + producto + ", fecha=" + fecha + '}';
    }
    
    
}

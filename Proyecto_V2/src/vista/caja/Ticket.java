/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.caja;

import modelo.productos.Producto;

/**
 *
 * @author socce
 */
public class Ticket {
    Producto producto;
    Object fecha;

    public Ticket() {
    }

    public Ticket(Producto producto, String fecha) {
        this.producto = producto;
        this.fecha = fecha;
    }

}

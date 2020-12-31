/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author socce
 */
public class Ticket {
    Object producto;
    Object fecha;

    public Ticket() {
    }

    public Ticket(Object producto, Object fecha) {
        this.producto = producto;
        this.fecha = fecha;
    }
    
    public Ticket(Object fecha) {
        this.fecha = fecha;
    }
    
    
}

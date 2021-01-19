/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import modelo.productos.*;
import vista.caja.Caja;
import modelo.Almacen;

/**
 *
 * @author line_
 */
public class Venta {

    public Venta() {
    }
   
    public void venderProducto(Almacen almacen, String nombreUsuario) {
        Producto producto = null;
        producto = almacen.buscarProducto(1);
        if(producto == null){
            System.out.println("Venta fallida\n");
//        }else{
            Caja caja_1 = new Caja();
            caja_1.cobrar(producto);
            caja_1.crearArchivoTicket(producto, nombreUsuario);
        }
    }
}

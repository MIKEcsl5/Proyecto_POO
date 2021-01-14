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
   
    public void venderProducto(ArrayList<Producto> inventario) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        Producto producto = null;
        Almacen almacenTMP = new Almacen();
        producto = almacenTMP.buscarProducto(inventario);
        if(producto == null){
            System.out.println("Venta fallida\n");
        }else{
            Caja caja_1 = new Caja();
            caja_1.cobrar(producto);
            caja_1.crearArchivoTicket(producto);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Comparator;
import modelo.productos.Producto;

/**
 * Esta clase sirve para poder hacer un orden de menor a mayor de datos enteros
 * @author Equipo D
 */
public class PrecioComparator implements Comparator{

    @Override
    public int compare(Object producto1, Object producto2) {
        int resultado;
        Producto tmpProducto1 = (Producto) producto1;
        Producto tmpProducto2 = (Producto) producto2;
        System.out.println(tmpProducto1.getNombre()+": "+tmpProducto1.getPrecio());
        if (tmpProducto1.getPrecio() < tmpProducto2.getPrecio()){
            resultado = -1;
        }else if(tmpProducto1.getPrecio() > tmpProducto2.getPrecio()){
            resultado = 1;
        }else{
            resultado = 0;
        }
        return resultado;
    }
    
}

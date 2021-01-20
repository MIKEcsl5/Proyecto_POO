/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Comparator;
import modelo.productos.Producto;

/**
 *
 * @author Equipo D
 */
public class NombreComparator implements Comparator{

    @Override
    public int compare(Object producto1, Object producto2) {
        Producto tmpProducto1 = (Producto) producto1;
        Producto tmpProducto2 = (Producto) producto2;
        
        return (tmpProducto1.getNombre().compareTo(tmpProducto2.getNombre()));
        
    }
    
}

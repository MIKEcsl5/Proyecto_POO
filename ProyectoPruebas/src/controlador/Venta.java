/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import vista.KeyboardInput;
import modelo.productos.*;
import vista.caja.Caja;
import modelo.Almacen;
import modelo.usuarios.Empleado;

/**
 *
 * @author Equipo D
 */
public class Venta {

    public Venta() {
    }
   
    public void venderProducto(Almacen almacen, Empleado empleadoActual) {
        Producto producto = null;
        int opcion = 0;
        KeyboardInput input = new KeyboardInput();
        ArrayList<Producto> carritoCompras = new ArrayList<>();
        
        System.out.println("\n\t\t\t\t\tCARRITO DE COMPRAS ");
        while (opcion != 8){
            System.out.println("\n 1)Agregar producto al carrito de compras\n 2)Realizar venta\n 3)Mostrar carrito de compras\n 8)Cancelar y salir\n\nOpcion a elegir: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1:
                    producto = almacen.buscarProducto(1);
                    if(producto == null){
                        System.out.println("El producto solicitado no existe o se agotaron existencias...");
                    }else
                       carritoCompras.add(producto);
                    break;
                    
                case 2:
                    Caja caja_1 = new Caja();
                    caja_1.cobrar(carritoCompras, empleadoActual, almacen);
                    break;
                    
                case 3:
                    System.out.println("\nProductos dentro del carrito: \n");
                    for (int k=0; k < carritoCompras.size(); k++)
                        System.out.println(carritoCompras.get(k).toString()+"\n\n");
                        
                    break;
                case 8:
                    opcion = 8;
                    break;
                    
                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }
        }
    }
}

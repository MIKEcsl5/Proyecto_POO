/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuarios;

import controlador.*;
import java.util.Iterator;
import modelo.almacen.Almacen;
import modelo.productos.Producto;
import vista.KeyboardInput;

/**
 * Clase Acomodador de la cual heredan la clase Vendedor y Gerente
 * @author Equipo D
 */
public class Acomodador extends Empleado {
    
    /**
     * Constructo vacio de la clase Acomodador
     */
    public Acomodador(){
        super.setPinAcceso("4030"); //PIN de accesos por defecto para un objeto de la clase Acomodador
    }
    
    /**
     * Constructor sobrecagado
     * @param nombre Dato tipo String que representa el nombre del Acomodador
     * @param numEmpleado Dato tipo String que representa el numero de empleado
     */
    public Acomodador(String nombre, String numEmpleado) {
        super(nombre, numEmpleado);
    }

    /**
     * Constructor sobrecargado
     * @param nombre Dato tipo String que representa el nombre del Acomodador
     * @param numEmpleado Dato tipo String que representa el numero de empleado
     * @param pass Dato tipo String que representa la contraseña del empleado
     */
    public Acomodador(String nombre, String numEmpleado, String pass) {
        super(nombre, numEmpleado, "Acomodador", pass);
        super.setPinAcceso(pass);
    }
    
    /**
     * Metodo con el cual hacemos una busqueda de solo consulta de un producto
     * @param almacen Recibe almacen que contiene el inventario de los productos
     */
    public void buscarProducto(Almacen almacen) {
        almacen.buscarProducto(0);
    }
    
    /**
     * Método en el cual se crea un aparato de ambiente para reproducir un disco musical o de video
     * @param almacen Recibe almacen que contiene el inventario de los productos
     */
    public void ponerCancion(Almacen almacen) {
        AparatoAmbiental aparatoTMP = new AparatoAmbiental();
        aparatoTMP.elegirReproductor(almacen);
    }
    
    /**
     * Este método despliega la lista de los productos
     * @param almacen Recibe almacen que contiene el inventario de los productos
     */
    public void imprimirListaInventario(Almacen almacen){
        Iterator iterador = almacen.inventario.iterator();
        while(iterador.hasNext()){
            System.out.println("***************************");
            System.out.println(iterador.next());
        }
    }
    
    /**
     * Este método se encarga de ordena la lista de productos ya sea por nombre o por precio ambos de menor a mayor
     * @param almacen Recibe almacen que contiene el inventario de los productos
     */
    public void ordenarInventario(Almacen almacen){
        int opcion;
        KeyboardInput input = new KeyboardInput();
        System.out.println("Por que valor desea ordenar la lista de productos\n 1)Nombre (menor a mayor)\n 2)Precio (menor a mayor)");
        opcion = input.readInteger();
        switch(opcion){
            case 1:
                almacen.inventario.sort(new NombreComparator());
                for(Producto tmpProducto : almacen.inventario){
                    System.out.println(tmpProducto.getNombre());
                }
            break;
            
            case 2:
                almacen.inventario.sort(new PrecioComparator());
                for(Producto tmpProducto : almacen.inventario){
                    System.out.println(tmpProducto.getNombre()+tmpProducto.getPrecio());
                }
                break;
        }
    }

    /**
     * 
     * @return Retorna el puesto que ejerce el empleado
     */
    @Override
    public String toString() {
        return "Puesto: Acomodador";
    }
    
    
    
}

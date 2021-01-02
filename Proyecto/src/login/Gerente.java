/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import productos.Producto;

/**
 *
 * @author Equipo D
 */
public class Gerente extends Empleado {

    public Gerente() {
        super.setPinAcceso(2390); //PIN de accesos por defecto para un objeto de la clase Gerente
    }

    public Gerente(String nombre, int numEmpleado) {
        super(nombre, numEmpleado);
        super.setPinAcceso(2390);
    }
    
    
    
    public void vender(Object producto) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        System.out.println("Prueba obtener la clase que pertenece el objeto: "+producto.getClass());
        Class objeto = producto.getClass();
        
        //como esta funcion recibe un objeto de clase no es pecificada no es posible usar metodos tradicionales para acceder a sus atributos y metodos
        //usando java.lang.reflect.Method; es posible "bascar si existe el metodo en el objetivo recibido y si si existe se invoca
        //Method [] metodos = objeto.class.getMethods(); 
        
        
        
        
        Method method = producto.getClass().getMethod("getPrecio");//creando un objeto Metodo buscando el metodo "getPrecio" del objeto recivido (producto)
        System.out.println("Precio: "+ method.invoke(producto));//invocando el metodo al objeto recibido
        
        Method [] metodos = objeto.getMethods(); 
        System.out.println("Prueba precio:"+metodos[9].invoke(producto));
        System.out.println("Lista de atributos del objeto recivido");
        for(Method allMetodos: metodos){
            System.out.println("sdsadsdadsa XDXD: "+allMetodos);
          
        }
        
        
    }
    
    public Object buscar(ArrayList<Object> inventario){
        Object producto;
        return producto;
    }
    
    public void ponerCancion(){
        
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + '}';
    }
    
    
}

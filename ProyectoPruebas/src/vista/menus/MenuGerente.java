
package vista.menus;

import java.util.ArrayList;
import modelo.Almacen;
import modelo.productos.Audifonos;
import modelo.productos.Producto;
import modelo.usuarios.Acomodador;
import modelo.usuarios.Gerente;
import vista.KeyboardInput;

/**
 *
 * @author Daniel Rojas
 */
public class MenuGerente extends Menu{

    /**
     * Constructor vacío de la clase.
     */
    public MenuGerente() {
        
    }
    
    /**
     * Este método despliega el menú específico de un usuario que accedió como gerente.
     * @param nombreUsuario
     * @param almacen
     */
    @Override
    public void despliegue(String nombreUsuario, Almacen almacen) {
        int opcion = 1;
        KeyboardInput input = new KeyboardInput();
        Gerente empleadoGerente = new Gerente(nombreUsuario);
        
        
        System.out.println("Empleado en turno: "+empleadoGerente.getNombre());
       
        while(opcion != 8){
            System.out.print("\n¿Que desea realizar?\n 1)Venta de un producto\n 2)Buscar producto\n 3)Agregar Producto al inventario\n 8)Cerrar sesion\n\nOpción a elegir: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1:
                        empleadoGerente.venderProducto(almacen, nombreUsuario);
                    break;
                case 2:
                        empleadoGerente.buscarProducto(almacen);
                    break;
                    
                case 3:
                        empleadoGerente.agregarProducto(almacen);
                case 4:
                    break;
                    
                case 5:
                    System.out.println("prueba :(");
                    break;
                    
                case 8:
                    System.out.println("Adios :)");
                    break;
                default:
                    System.out.println(opcion + "no es opcion valida");
                break;
            }
        }
    }
}

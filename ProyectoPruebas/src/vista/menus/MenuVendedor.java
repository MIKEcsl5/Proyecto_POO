
package vista.menus;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Almacen;
import modelo.usuarios.Vendedor;
import vista.KeyboardInput;

/**
 *
 * @author Equipo D
 */
public class MenuVendedor extends Menu{
    
    /**
     * Constructor vacío de la clase.
     */
    public MenuVendedor() {
        
    }
    
    /**
     * Este método despliega el menú específico de un usuario que accedió como vendedor.
     */
    @Override
    public void despliegue(String nombreUsuario, String numEmpleado, Almacen almacen) {
        int opcion = 1;
        KeyboardInput input = new KeyboardInput();
        Vendedor empleadoVendedor = new Vendedor(nombreUsuario, numEmpleado);
        System.out.println("Hola " + empleadoVendedor.getNombre());
        while(opcion != 8){
            System.out.print("\n**********MENU VENDEDOR*************\n¿Que desea realizar?\n 1)Venta de un producto\n 2)Buscar producto\n 3)Reproducir disco\n 8)Cerrar sesion\n\nOpción a elegir: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1:
                        empleadoVendedor.venderProducto(almacen, empleadoVendedor);
                    break;
                case 2:
                        empleadoVendedor.buscarProducto(almacen);
                    break;
                    
                case 3:
                    try {
                        empleadoVendedor.ponerCancion(almacen);
                    } catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        Logger.getLogger(MenuVendedor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                break;
            
                case 4:
                    break;
                    
                case 5:
                    System.out.println("prueba :(");
                    break;
                    
                case 8:
                    System.out.println("Adios "+empleadoVendedor.getNombre()+"\n");
                    break;
                default:
                    System.out.println(opcion + "no es opcion valida");
                break;
            }
        }
    }
}

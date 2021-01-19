
package vista.menus;

import modelo.Almacen;
import modelo.usuarios.Gerente;
import modelo.usuarios.Vendedor;
import vista.KeyboardInput;

/**
 *
 * @author Daniel Rojas
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
        
        while(opcion != 8){
            System.out.print("Hola " + empleadoVendedor.getNombre()+"\n**********MENU VENDEDOR*************\n¿Que desea realizar?\n 1)Venta de un producto\n 2)Buscar producto\n 3)Reproducir disco\n 8)Cerrar sesion\n\nOpción a elegir: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1:
                        empleadoVendedor.venderProducto(almacen, nombreUsuario);
                    break;
                case 2:
                        empleadoVendedor.buscarProducto(almacen);
                    break;
                    
                case 3:
                        empleadoVendedor.ponerCancion(almacen);
                case 4:
                    break;
                    
                case 5:
                    System.out.println("prueba :(");
                    break;
                    
                case 8:
                    System.out.println("Adios "+empleadoVendedor.getNombre());
                    break;
                default:
                    System.out.println(opcion + "no es opcion valida");
                break;
            }
        }
    }
}

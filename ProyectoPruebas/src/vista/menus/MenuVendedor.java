
package vista.menus;

import modelo.almacen.Almacen;
import modelo.usuarios.Vendedor;
import vista.KeyboardInput;

/**
 * Con esta clase se creara el objeto que generara el menu personalizado para el inicio de sesion Vendedor
 * @author Equipo D
 */
public class MenuVendedor extends Menu{
    
    /**
     * Constructor vacío de la clase.
     */
    public MenuVendedor() {
    }
    
    /**
     * Este método despliega el menú específico de un usuario que accedió como Vendedor.
     * @param nombreUsuario Dato tipo String que representa el nombre del empleado con sesion iniciada actua
     * @param numEmpleado Dato tipo String que representa el numero de empleado
     * @param almacen Recibe almacen que contiene el inventario de los productos
     */
    @Override
    public void despliegue(String nombreUsuario, String numEmpleado, Almacen almacen) {
        int opcion = 1;
        KeyboardInput input = new KeyboardInput();
        Vendedor empleadoVendedor = new Vendedor(nombreUsuario, numEmpleado);
        System.out.println("Hola " + empleadoVendedor.getNombre());
        while(opcion != 8){
            System.out.print("\n**********MENU VENDEDOR*************\n¿Que desea realizar?\n 1)Venta de un producto\n 2)Buscar producto\n 3)Tocar un disco\n 4)Ordenar inventario\n 5)Imprimir lista de productos\n 8)Cerrar sesion\n\nOpción a elegir: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1:
                    empleadoVendedor.venderProducto(almacen, empleadoVendedor);
                    break;
                case 2:
                    empleadoVendedor.buscarProducto(almacen);
                    break;
                case 3:
                    empleadoVendedor.ponerCancion(almacen);
                    break;
                case 4:
                    empleadoVendedor.ordenarInventario(almacen);
                    break;  
                case 5:
                    empleadoVendedor.imprimirListaInventario(almacen);
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

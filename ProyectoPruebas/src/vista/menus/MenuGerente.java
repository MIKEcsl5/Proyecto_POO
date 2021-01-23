
package vista.menus;

import modelo.Almacen;
import modelo.usuarios.Gerente;
import vista.KeyboardInput;

/**
 * Con esta clase se creara el objeto que generara el menu personalizado para el inicio de sesion Gerente
 * @author Equipo D
 */
public class MenuGerente extends Menu{

    /**
     * Constructor vacío de la clase.
     */
    public MenuGerente() {
        
    }
    
    /**
     * Este método despliega el menú específico de un usuario que accedió como Gerente.
     * @param nombreUsuario Dato tipo String que representa el nombre del empleado con sesion iniciada actua
     * @param numEmpleado Dato tipo String que representa el numero de empleado
     * @param almacen Recibe almacen que contiene el inventario de los productos
     */
    @Override
    public void despliegue(String nombreUsuario, String numEmpleado, Almacen almacen) {
        int opcion = 1;
        KeyboardInput input = new KeyboardInput();
        Gerente empleadoGerente = new Gerente(nombreUsuario, numEmpleado);
        System.out.println("Hola " + empleadoGerente.getNombre());
        while(opcion != 8){
            System.out.print("\n**********MENU GERENTE*************\n¿Que desea realizar?\n 1)Venta de un producto\n 2)Buscar producto\n 3)Agregar Producto al inventario\n 4)Crear nuevo usuario\n 5)Tocar un disco\n 6)Ordenar inventario\n 7)Imprimir lista de productos\n 8)Cerrar sesion\n\nOpción a elegir: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1:
                    empleadoGerente.venderProducto(almacen, empleadoGerente);
                    break;
                case 2:
                    empleadoGerente.buscarProducto(almacen);
                    break;
                case 3:
                    empleadoGerente.agregarProducto(almacen);
                    break;
                case 4:
                    empleadoGerente.crearUsuario();
                    break;
                case 5:
                    empleadoGerente.ponerCancion(almacen);
                    break;
                case 6:
                    empleadoGerente.ordenarInventario(almacen);
                    break;
                case 7:
                    empleadoGerente.imprimirListaInventario(almacen);
                    break;
                case 8:
                    System.out.println("Adios "+empleadoGerente.getNombre()+"\n");
                    break;
                default:
                    System.out.println(opcion + "no es opcion valida");
                break;
            }
        }
    }
}

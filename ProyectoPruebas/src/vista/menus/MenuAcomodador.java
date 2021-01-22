
package vista.menus;

import modelo.Almacen;
import modelo.usuarios.Acomodador;
import vista.KeyboardInput;

/**
 *
 * @author Equipo D
 */
public class MenuAcomodador extends Menu{
    
    /**
     * Constructor vacío de la clase.
     */
    public MenuAcomodador() { 
    }
    
    /**
     * Este método despliega el menú específico de un usuario que accedió como acomodador.
     */
    @Override
    public void despliegue(String nombreUsuario, String numEmpleado, Almacen almacen){
        int opcion = 1;
        KeyboardInput input = new KeyboardInput();
        Acomodador empleadoAcomodador = new Acomodador(nombreUsuario, numEmpleado);
        System.out.println("Hola " + empleadoAcomodador.getNombre());
        while(opcion != 8){
            System.out.print("\n**********MENU ACOMODADOR*************\n¿Que desea realizar?\n 1)Tocar un disco\n 2)Buscar producto\n 3)Ordenar el inventario\n 4)Imprimir lista de productos\n 8)Cerrar sesion\n\nOpción a elegir: ");
            opcion = input.readInteger();
            switch(opcion){
                case 1:
                    empleadoAcomodador.ponerCancion(almacen);
                    break;
                case 2:
                    empleadoAcomodador.buscarProducto(almacen);
                    break;
                case 3:
                    empleadoAcomodador.ordenarInventario(almacen);
                    break;
                case 4:
                    empleadoAcomodador.imprimirListaInventario(almacen);
                    break;
                case 8:
                    System.out.println("Adios "+empleadoAcomodador.getNombre()+"\n");
                    break;
                default:
                    System.out.println(opcion + "no es opcion valida");
                break;
            }
        }
    }
}


package vista.menus;

import modelo.almacen.Almacen;

/**
 * Esta clase supone un menú generico de entrada al usuario donde se presenta el acceso de un empleado,
 * este deberá identificarse para acceder a ciertas características según su nivel de usuario.
 * @author Equipo D
 */
public abstract class Menu {
    
   
    
    /**
     * El método despliegue es un método abstracto que debe ser implementado por cada menu específico
     * de el nivel de empleado (gerente, vendedor o acomodador) que se obtiene del
     * paquete "vista.caja"; su implementación supone mostrar las acciones disponibles del empleado.
     * @param nombreUsuario Dato tipo String que representa el nombre del empleado con sesion iniciada actua
     * @param numEmpleado Dato tipo String que representa el numero de empleado
     * @param almacen Recibe almacen que contiene el inventario de los productos
     */
    public abstract void despliegue(String nombreUsuario, String numEmpleado, Almacen almacen);
}

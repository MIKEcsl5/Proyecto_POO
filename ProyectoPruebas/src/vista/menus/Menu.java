
package vista.menus;

import modelo.Almacen;

/**
 * Esta clase supone un menú generico de entrada al usuario donde se presenta el acceso de un empleado,
 * este deberá identificarse para acceder a ciertas características según su nivel de usuario.
 * @author Daniel Rojas
 */
public abstract class Menu {
    
    protected int respuesta;
    
    /**
     * El método despliegue es un método abstracto que debe ser implementado por cada menu específico
     * de el nivel de empleado (gerente, vendedor o acomodador) que se obtiene del
     * paquete "vista.caja"; su implementación supone mostrar las acciones disponibles del empleado.
     */
    public abstract void despliegue(String nombreUsuario, Almacen almacen);
    
}

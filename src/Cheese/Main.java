/*
*	grupo  : 1ºGDAM
*	alumno : Jose Ignacio Goidno
*	n.exp. : 7238
*	fecha  : 01/06/2022
 */
package Cheese;

/**
 *
 * @author ___
 */
public class Main {
    ListaProductos produc = new ListaProductos();
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
         
         
        String cod1 = "0001";        
        Producto prod1 = new Producto(cod1, "vaca", 2, 1.2);
         
        String cod2 = "0002";        
        Producto prod2 = new Producto(cod2, "cabra", 3, 1.2);
         
    }
}

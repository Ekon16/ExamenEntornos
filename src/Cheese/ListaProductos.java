/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;


public class ListaProductos {
    
    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     * 
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;


    
    private int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean check_null(String campo){
    
        if (campo.replace(" ","") == "")  return true; else return false;
    }
    
    
    
    /**
     * Añade un producto a la lista
     * @param prod es el producto
     * @return Si esta dubplicado devuleve null sino devuelve añade el producto y lo devuelve.
     */
    public Producto addProducto(Producto prod) {
        if(prod.getcode() == null){
        return null;
        }
        if (listaP.containsKey(prod.getcode())) {
            // System.out.println("Producto con código duplicado");
            return null;
        }
        n++;
        this.setN(n);
        listaP.put(prod.getcode(), prod);
        return prod;
    }

    
    
    
    /**
     * Elimina un producto de la Lista.
     * @param codigo es el codigo de los productos.
     * @return regresa el codigo del producto borrado.
     */
    public Producto eliminarProducto(String codigo) { 
        if(codigo == null){
        return null;
        }
        Producto prod = buscarProducto(codigo);
        if (prod != null) {
        listaP.remove(codigo);
        n--;
        this.setN(n);
        }
        return prod;
    }
    /**
     * busca un producto de la Lista
     * @param codigo es el codigo de los productos
     * @return regresa el codigo del producto buscado
     */
    public Producto buscarProducto(String codigo) { 
        
        if(codigo == null){
        return null;
        }
        Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
    /**
     * busca un producto de la Lista
     * @return regresa el codigo del producto buscado
     */
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    /**
     * busca un producto de la Lista
     * @return regresa todos los prouctos
     */
    public int totalProductos(){
            return this.getN();
    }
}

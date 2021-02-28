/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 */

/**
 * Stack<E>
 * Inicio de la interface Stack con genéricos
 */
public interface StackC<E>{

    /**
     * Metodo push equivalente a "add"
     */
    void push(E Obj);
    /**
     * Metodo pop equivalente a remove
     */
    E pop();
    /**
     * Método peek, consigue el primer valor del stack
     */
    E peek();
    /**
     * Método empty, verifica si el stack está vacío o no y devuelve un boolean
     */
    boolean empty();
    /**
     * Método size, retorna el tamaño del stack
     */
    int size();

}
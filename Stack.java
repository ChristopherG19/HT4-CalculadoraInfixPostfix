/**---------------------------------------
 Christopher Garcia-20541
 3er semestre - Ciclo 1
 Algoritmos y estructura de datos
 @Version 3.0 5/02/2021
 ---------------------------------------*/
/**
 * Stack<E>
 * Inicio de la interface Stack con genéricos
 */
public interface Stack<E>{

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
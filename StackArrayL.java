/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 */

 /**
  * Inicio de la clase StackArrayL que implementa Stack
  * También se realiza un import de ArrayList para su utilización
  */
import java.util.ArrayList;
public class StackArrayL<E> implements StackC<E> {

    /**
     * Se crea el ArrayList para guardar los datos
     */
    ArrayList<E> Operaciones = new ArrayList<E>(); 
    
    /**
     * @param E
     * Metodo push equivalente a "add"
     */
    public void push(E item){
        /**
         * Se agrega el elemento al ArrayList
         */
        Operaciones.add(item);
    }
    
    /**
     * @return E
     * Metodo pop equivalente a remove
     */
    public E pop(){
        /**
         * Se remueve el último elemento y se retorna
         */
        E valor = Operaciones.get(size() - 1);
        Operaciones.remove(valor);
        return valor;
    }
    
    /**
     * @return E 
     * Método peek, consigue el primer valor del stack
     */
    public E peek() {

        return Operaciones.get(size()-1);
    }
    
    /**
     * @return boolean
     * Método empty, verifica si el ArrayList está vacío o no y devuelve un boolean
     */
    public boolean empty(){
        return size() == 0;
    }
    
    /**
     * @return int
     * Retorna el tamaño del almacen existente
     */
    public int size(){
       return (Operaciones.size()); 
    }
    
}

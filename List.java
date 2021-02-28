/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 */

 /**
  * Inicio de la clase List que implementa Stack 
  * También se realiza un import de LinkedList para poder utilizarlo
  */
import java.util.LinkedList;
public abstract class List<T> implements StackC<T>{
   
    LinkedList<T> datos = new LinkedList<T>();
 
    /** 
     * @param e: Dato de tipo genérico T que se agrega a la lista encadenada
     */
    public void push(T e){
        /**
         * Se agrega el dato a la lista utilizada
         */
        datos.add(e);
    }
    
    /** 
     * @return dato: Luego de haber removido el último dato de tipo T lo retorna
     */
    public T pop(){
        /**
         * Se realiza la operación de pop en la lista
         */
        T dato = datos.get(size()-1);
        datos.remove(dato);
        return dato;
    }
    
    /** 
     * @return TamañoF: Tamaño de la lista utilizada
     */
    public int size(){
        int TamanoF = datos.size();
        return TamanoF;
    }

    /**
     * @return dato: Último dato de la lista utilizada
     */
    @Override
    public T peek() {
        return datos.get(datos.size()-1);
    }

    /**
     * @return boolean: True o false dependiendo de si está o no vacía la lista utilizada
     */
    @Override
    public boolean empty() {
        return size() == 0;
    }
}

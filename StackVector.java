/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 */

/**
 * Import de Vector
 */
import java.util.Vector;

/**
 * Inicio de la clase StackVector que implementa la interface Stack con genéricos
 */
public class StackVector<E> implements StackC<E> {

    /**
     * Instancia de un almacén para información
     */
    Vector<E> data;

    /**
     * Constructor que instancia un nuevo Vector<E>
     */
    public StackVector(){
        data = new Vector<E>();
    }

    /**
     * @param num
     * Agrega el elemento al almacén
     */
    @Override
    public void push(E num) {
        data.add(num);
    }

    /**
     * @return E
     * Elimina el elemento del almacen y lo retorna
     */
    @Override
    public E pop() {
        E valor = data.get(size() - 1);
        data.remove(valor);
        return valor;
    }

    /**
     * @return E
     * Consigue el primer valor del almacen y lo retorna
     */
    @Override
    public E peek() {
        return data.get(data.size()-1);
    }

    /**
     * @return boolean
     * Comprueba si el almacen se encuentra vacío o no y retorna su valor como boolean
     */
    @Override
    public boolean empty() {
        return size() == 0;
    }

    /**
     * @return int
     * Retorna el tamaño del almacen existente
     */
    @Override
    public int size() {
        return data.size();
    }



}
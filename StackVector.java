/**---------------------------------------
 Christopher Garcia-20541
 3er semestre - Ciclo 1
 Algoritmos y estructura de datos
 @Version 3.0 5/02/2021
 ---------------------------------------*/
/**
 * Import de Vector
 */
import java.util.Vector;

/**
 * Inicio de la clase StackVector que implementa la interface Stack con genéricos
 */
public class StackVector<E> implements Stack<E> {

    /**
     * Instancia de un almacén para información
     */
    protected Vector<E> data;

    /**
     * Constructor que instancia un nuevo Vector<E>
     */
    public StackVector(){
        data = new Vector<E>();
    }

    /**
     * Inicio de métodos "Overrideados"
     */

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
        return data.remove(data.size()-1);
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
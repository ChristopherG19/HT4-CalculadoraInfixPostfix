/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 * Referencias de código en el módulo de canvas de listas
 */

 /**
  * Clase SingleLL que extiende de List
  * SingleLinkedList como funcionamiento
  */
public class SingleLL<E> extends List<E>{

    /**
     * Instancias para almacenamiento de información
     */
    protected Nodo<E> Head;
    protected int cuentaT;

    /**
     * @param datoF: Recibe un dato que se convertirá
     * en la cabeza del nodo
     */
    @Override 
    public void push(E datoF){
        Head = new Nodo<E>(datoF, Head);
        cuentaT++;
    }

    /**
     * @return E: Retorna el valor del último dato
     * que se sacó de la lista
     */
    @Override
    public E pop(){
        Nodo<E> DatoTempo = Head;
        Head = Head.siguienteDato();
        cuentaT--;
        return DatoTempo.ValorDS();
    }

    /**
     * @return: Tamaño de la lista utilizada
     */
    @Override
    public int size(){
        return cuentaT;
    }
    
}

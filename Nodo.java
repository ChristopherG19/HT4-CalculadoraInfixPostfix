/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 * Referencias de código en el módulo de canvas de listas
 */

 /**
  * Inicio de la clase Nodo que permite a la clase
  * SingleLL correctamente
  */
public class Nodo<E>{
    
    /**
     * Instancias para almacenamiento de información
     */
    protected E info;
    protected Nodo<E> DatoS;

    /**
     * Constructor
     * @param dato: recibe el valor de un dato
     * @param siguienteD: recibe el dato que será la 
     * "cabeza" de la lista
     */
    public Nodo(E dato, Nodo<E> siguienteD){
        info = dato;
        DatoS = siguienteD;
    }

    /**
     * Constructor 2, se crea la "cola" de la lista con el valor dato
     * @param dato: valor de un dato, pero sin el dato para 
     * convertirse en la cabeza de la lista
     */
    public Nodo(E dato){
        this(dato, null);
    }

    /**
     * @return DatoS: Referencia del siguiente dato en la lista
     */
    public Nodo<E> siguienteDato(){
        return DatoS; 
    }

    /**
     * @param siguienteD: Recibe el dato que se sustituirá
     * como siguiente dato en la lista y lo sustituye
     */
    public void setDatoS(Nodo<E> siguienteD){
        DatoS = siguienteD;
    }

    /**
     * @return info: Retorna la información de su dato asociado
     */
    public E ValorDS(){
        return info;
    }

    /**
     * @param valorF: Recibe el dato que se sustituirá
     * como información de un dato asociado en la lista 
     * y lo sustituye
     */
    public void setValorDS(E valorF){
        info = valorF;
    }

}

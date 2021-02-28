/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 * Referencias de código en el módulo de canvas de listas
 */

 /**
  * Clase DoubleLL que extiende de List
  * DoubleLinkedList como funcionamiento
  */
public class DoubleLL<E> extends List<E>{

   protected NodoDoble<E> Head;
   protected NodoDoble<E> Tail;
   protected int CuentaFD;

    public DoubleLL(){
        Head = null;
        Tail = null;
        CuentaFD = 0;
    }

   @Override
   public void push(E dato){
       Head = new NodoDoble<E>(dato, Head, Tail);
       if(Tail == null){
           Tail = Head;
       }
       CuentaFD++;
   }
    
   @Override
   public E pop(){

    NodoDoble<E> DatoTemp = Head;
    Head = Head.Siguiente();
    CuentaFD--;
    return DatoTemp.Info();

   }

   @Override
   public int size(){
       return CuentaFD;
   }

}

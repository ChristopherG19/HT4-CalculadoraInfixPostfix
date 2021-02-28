/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 */

/**
 * Clase NodoDoble necesaria para que la 
 * clase DoubleLL funcione correctamente
 */
public class NodoDoble<E> {

    //B next
    //ElementoB nextE
    //A previous
    //ElementoA previousE

    protected NodoDoble<E> ElementoB;
    protected NodoDoble<E> ElementoA;
    protected E Dat;

    public NodoDoble(E dato, NodoDoble<E> B, NodoDoble<E> A) {

        Dat = dato;
        ElementoB = B;
        if (ElementoB != null){
            ElementoB.ElementoA = this;
            ElementoA = A;
        }

        if(ElementoA != null){
            ElementoA.ElementoB = this;
        }
        
    }

    public NodoDoble(E dat){
        this(dat, null, null);
    }

    public NodoDoble<E> Siguiente(){
        return ElementoB;
    }

    public void setSiguiente(NodoDoble<E> SigEl){
        ElementoB = SigEl;
    }

    public E Info(){
        return Dat;
    }

    public void SetInfo(E NuevaInfo){
        Dat = NuevaInfo;
    }

    public NodoDoble<E> AnteriorDato(){
        return null;
    }

}

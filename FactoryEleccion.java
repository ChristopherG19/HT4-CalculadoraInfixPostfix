/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 */

public class FactoryEleccion {
    
    public StackC<Integer> getStackN(int elecc) {

        if (elecc == 1){

            return new StackVector<Integer>();

        } else if(elecc == 2){

            return new StackArrayL<Integer>();

        } else if(elecc == 4){
            
            return new SingleLL<Integer>();

        } else if(elecc == 5){
            
            return new DoubleLL<Integer>();

        }
        return null;
    }

    public StackC<String> getStackS(int elecc) {

        if (elecc == 1){

            return new StackVector<String>();

        } else if(elecc == 2){

            return new StackArrayL<String>();

        } else if(elecc == 4){
            
            return new SingleLL<String>();

        } else if(elecc == 5){
            
            return new DoubleLL<String>();

        }
        return null;
    }
 
}

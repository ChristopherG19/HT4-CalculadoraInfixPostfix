/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 */

/**
 * Calculadora
 * Inicio de la clase Calculadora que implementa la interface CalculadoraGeneral
 */
public class Calculadora{

    int A = 0;
    int B = 0;
    int Resu = 0;
    String OperandoF;

    public Calculadora(){

    }
    /**
     * 
     */
    public <E> String Operaci(String operacion, StackC<String> Operandos, StackC<Integer> Operadores) {

        /**
         * Instancias
         */
        StackC<Integer> Num = Operadores;
        StackC<String> Sig = Operandos;
        Resu = 0;

        for(int i=0; i < operacion.length();i++){
            //obtener segun la variable
            char unico = operacion.charAt(i);
            String Res = String.valueOf(unico);

            if (Res.equals("+") || Res.equals("-") ||
                Res.equals("*") || Res.equals("/")){
                Sig.push(Res);
            } else {
                try {
                    int nu = Integer.parseInt(Res);
                    Num.push(nu);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            if (Num.size() >= 2 && Sig.size() >= 1){
                
                A = Num.pop();
                B = Num.pop();
                OperandoF = Sig.pop();

                if (OperandoF.equals("+")){
                    Resu = A + B;
                } else if (OperandoF.equals("-")){
                    Resu = B - A;
                } else if (OperandoF.equals("*")){
                    Resu = A * B;
                } else if (OperandoF.equals("/")){
                    Resu = B / A;
                }

                Num.push(Resu);
            }
        }
        String Respuesta = String.valueOf(Resu);
        return Respuesta;
    }

}
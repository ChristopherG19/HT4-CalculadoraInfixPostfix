/**---------------------------------------
 Christopher Garcia-20541
 3er semestre - Ciclo 1
 Algoritmos y estructura de datos
 @Version 3.0 5/02/2021
 ---------------------------------------*/
/**
 * Calculadoras
 * Inicio de la clase Calculadora que implementa la interface CalculadoraGeneral
 */
public class Calculadora implements CalculadoraGeneral{

    /**
     * Creamos un stack Vector con Integer como genérico
     */
    StackVector<Integer> stack = new StackVector<Integer>();

    /**
     * @param operacion
     * @return String
     */

    /**
     * Override del método Calculo en la interface
     * @param operacion = string de la expresión a operar
     */
    @Override
    public String Calculo(String operacion) {

        /**
         * Instancias
         */
        boolean Veri = true;
        int Respuesta = 0;
        /**
         * Se crea un arreglo donde se separa la operacion del txt y así poder trabajar con cada caracter
         */
        String[] operaciones;
        operaciones = operacion.split(" ");
        int Op1 = 0, Op2 = 0;
        String OpeFinal = "";

        /**Se verifica que tipo de caracter es, si es operador u operando
         * Dependiendo de que sea se verifica si el stack cumple el requisito para funcionar
         * Realiza operaciones de la interface de Stack y retorna un boolean y se guarda la respuesta
         */

        for(int i = 0; i < operaciones.length; i ++){
            /**
             * Encuentra una operación de diferencia
             */
            if(operaciones[i].equals("-")){
                if(stack.size() >=2){
                    Op1 = stack.pop();
                    Op2 = stack.pop();
                    Respuesta = Op2-Op1;
                    stack.push(Respuesta);
                    Veri = true;
                }
                /**
                 * Encuentra una operación de suma
                 */
            } else if (operaciones[i].equals("+")){
                if(stack.size() >=2){
                    Op1 = stack.pop();
                    Op2 = stack.pop();
                    Respuesta = Op2+Op1;
                    stack.push(Respuesta);
                    Veri = true;
                }
                /**
                 * Encuentra una operación de multiplicación
                 */
            } else if (operaciones[i].equals("*")){
                if(stack.size() >=2){
                    Op1 = stack.pop();
                    Op2 = stack.pop();
                    Respuesta = Op2*Op1;
                    stack.push(Respuesta);
                    Veri = true;
                }
                /**
                 * Encuentra una operación de división
                 */
            } else if (operaciones[i].equals("/")){
                if(stack.size() >=2){
                    try {
                        /**
                         * Si el operador del denominador es 0 manda una advertencia
                         */
                        if(Op1 == 0){
                            System.out.println("La division dentro de 0 no existe");
                        } else {
                            Op1 = stack.pop();
                            Op2 = stack.pop();
                            Respuesta = Op2 / Op1;
                            stack.push(Respuesta);
                            Veri = true;
                        }
                    } catch (Exception e){
                        System.out.println("Lo sentimos esta division no se puede");
                    }
                }
                /**
                 * No acepta paréntesis para separar las operaciones
                 */
            } else if (operaciones[i].equals("(")){
                System.out.println("Lo sentimos pero este caracter es invalido");
                Veri = false;
            } else if (operaciones[i].equals(")")){
                System.out.println("Lo sentimos pero este caracter es invalido");
                Veri = false;

            } else {
                Veri = false;
                int operador = Integer.parseInt(operaciones[i]);
                stack.push(operador);
            }
        }
        /**
         * Al terminar retorna el String correspondiente al resultado
         */
        if(Veri == true){
            OpeFinal = Integer.toString(stack.pop());
        } else if (Veri == false){
            OpeFinal = "Lo sentimos, no es posible operar esta expresion";
        }

        return OpeFinal;
    }

}
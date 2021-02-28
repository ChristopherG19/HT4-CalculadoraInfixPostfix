/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 * Referencias para esta clase tomadas de: https://youtu.be/NZaXM67fxbs?list=PLF206E906175C7E07
*/
public class SingleCalcu {

    /**
     * Variable Estática para poder accersarla desde cualquier lado
     */
    private static SingleCalcu One_instance = null;
    static boolean Creacion;
    Calculadora calculadora;

    /**
     * Constructor privado para restringir que solo se utilice e instancie por esta
     * clase
     */
    private SingleCalcu() {
        calculadora = new Calculadora();
    }

    /**
     * @param operacion: Recibe la operacion postfix ya convertida para operarla
     * @return: Retorna el resultado de la operacion
     */
    public String Operaci(String operacion, StackC<String> Signos, StackC<Integer> Numeros) {
        return calculadora.Operaci(operacion, Signos, Numeros);
    }

    /**
     * @return One_instance: Retorna una instancia de calculadora
     */
    public static SingleCalcu getInstance() {
        /**
         * Si en dado caso no existe alguna calculadora la crea, de lo contrario
         * devuelve la existente.
         */
        if (One_instance == null) {
            One_instance = new SingleCalcu();
        }
        return One_instance;
    }

    /**
     * Método que comprueba que la única instancia de la calculadora se creó
     * @return: Retorna un boolean dependiendo del resultado
     */
    public static boolean Comprobacion() {
        if (One_instance != null) {
            Creacion = true;
        }
        return Creacion;
    }

}

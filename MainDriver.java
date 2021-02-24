/**---------------------------------------
 Christopher Garcia-20541
 3er semestre - Ciclo 1
 Algoritmos y estructura de datos
 @Version 3.0 5/02/2021
 ---------------------------------------*/
/**
 * Imports
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

/**
 * Inicio de la clase Main
 */
public class MainDriver {
    /**
     * @param args
     *Inicio del main
     */
    public static void main(String[] args) {

        /**
         * Instancias
         */
        Calculadora Calculadora = new Calculadora();
        Vector<String> Data = new Vector<String>();

        /**
         * Try-Catch para evitar y atrapar errores en cuanto a la lectura del texto
         */
        try {

            /**
             * Se lee el archivo línea por línea y se agrega a un almacen que se lee posteriormente
             */
            String x = "";
            FileReader Datos = new FileReader("datos.txt");
            BufferedReader Lector = new BufferedReader(Datos);

            while(x != null){
                x = Lector.readLine();
                if(x == null){
                    Lector.close();
                    break;
                }
                Data.add(x);
            }

            /**
             * Si no se encuentra archivo con el nombre que se plantea en la hoja enseña una advertencia
             */
        } catch (Exception e) {
            System.out.println("Error!! Archivo no encontrado");
        }

        System.out.println();
        /**
         * Se lee Cada línea del almacen y se realiza la operación en ellas
         * Posterior a la resolución se muestra el resultado
         */
        for (int f = 0; f < Data.size(); f++){
            String Total = Calculadora.Calculo(Data.get(f));
            System.out.println("Resultado " + (f+1) + ": " + Total);
        }
        System.out.println();
    }

}
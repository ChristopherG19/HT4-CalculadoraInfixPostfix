/**
 * UVG-Algoritmos y Estructura de datos-Seccion 10
 * Catedrático: Douglas Barrios
 * @author Christopher García, 20541
 * @author Maria Fernanda Argueta, 20458 
 * @version 3
 */

/**
 * Imports
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

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
         * Instancias de almacenes
         */
        ArrayList<String> Infix = new ArrayList<String>();
        ArrayList<String> Postfix = new ArrayList<String>();

        /**
         * Creacion de la Calculadora Única utilizando Singleton
         */
        SingleCalcu CalculadoraU = SingleCalcu.getInstance();

        /**
         * Try-Catch para evitar y atrapar errores en cuanto a la lectura del texto
         */
        try {

            /**
             * Se lee el archivo línea por línea y se agrega a un almacen que se lee posteriormente
             */
            File Informacion = new File("datos.txt");
            Scanner Lector = new Scanner(Informacion);

            /**
             * Lee cada linea hasta completar el archivo y la agrega a un ArrayList
             */
            while(Lector.hasNextLine()){
                String x = Lector.nextLine();
                Infix.add(x);
            }
            Lector.close();
            /**
             * Si no se encuentra archivo con el nombre que se plantea en la hoja enseña una advertencia
             */
        } catch (Exception e) {
            System.out.println("Error!! Archivo no encontrado");
            e.printStackTrace();
        }
        System.out.println();

        /**
         * Agrega cada conversión de Infix a Postfix en un ArrayList
         */
        for(String Lineas: Infix){
            Postfix.add(ChangeTypeOperation(Lineas));
        }

        /**
         * Imprime las operaciones Infix del .txt
         */
        for(String Lineas: Infix){
            System.out.println("Operacion Infix: " + Lineas);
        }

        System.out.println();
        
        /**
         * Imprime las operaciones PostFix del .txt
         */
        for(String Lineas: Postfix){
            System.out.println("Operacion PostFix: " + Lineas);
        }

        /**
         * Menú que se utilizará para enviar la información a Factory
         * De acuerdo a la elección se elegirá que tipo de pila utilizar
         */
        FactoryEleccion Seleccionador = new FactoryEleccion();
        int eleccion = Menu();
        StackC<Integer> Num = Seleccionador.getStackN(eleccion); 
        StackC<String> Sig = Seleccionador.getStackS(eleccion); 

        System.out.println("\n----Un momento por favor----\n");
        System.out.println("       ----Listo----\n");

        /**
         * Se lee Cada línea del almacen y se realiza la operación en ellas
         * Posterior a la resolución se muestra el resultado
         */

        for(String Ope : Postfix){
            String operar = CalculadoraU.Operaci(Ope, Sig, Num);
            System.out.println("Resultado: " + operar);
        }
        System.out.println();
    }

    /**
     * Determina que signo es y retorna un int para determinar la operación que se hace posteriormente
     * @param chP: Recibe un caracter del String de operación separado para determinar que operador es
     * @return: Retorna un int dependiendo del tipo de signo que es
     */
    public static int SignoOperacion(char chP){

        switch (chP) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;

    }

    /**
     * Conversión de Infix a Postfix
     * @param LineaF: Recibe una linea del .txt que incluya la información
     * @return: Retorna la operación en formato Postfix
     */
    public static String ChangeTypeOperation(String LineaF){

        String PostFixLine = "";

        /**
         * Se crea un stack para almacenar los datos
         */
        Stack<Character> Carac = new Stack<>();

        /**
         * Evalua si es operador u operando y los almacena dependiendo de esto
         * para poder ordenarlos posteriormente
         */
        for(int i = 0; i < LineaF.length(); i++){
            
            char ch = LineaF.charAt(i);

            if(Character.isLetterOrDigit(ch)){

                PostFixLine += ch;

            } else if (ch == '('){

                Carac.push(ch);

            } else if (ch == ')'){

                while(!Carac.isEmpty() && Carac.peek() != '('){
                    PostFixLine += Carac.pop();
                    Carac.pop();
                }

            } else {

                while(!Carac.isEmpty() && SignoOperacion(ch) <= SignoOperacion(Carac.peek())){
                    PostFixLine += Carac.pop();
                }
                Carac.push(ch);

            }
        }

        while(!Carac.isEmpty()){
            if(Carac.peek() == '('){
                return "Lo siento...Expresion invalida";
            }
            PostFixLine += Carac.pop();
        }

        return PostFixLine;
    }

    /**
     * Menu de opciones para el usuario
     * @return: Retorna un int que se refiere a la opción elegida
     */
    public static int Menu(){

        int opcionU = 0;
        boolean Ver = true;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("\n----------------");
            System.out.println("Menu de opciones");
            System.out.println("----------------");
            System.out.println("\nRealizar operaciones con: "); 
            System.out.println("1) Vector"); 
            System.out.println("2) ArrayList"); 
            System.out.println("3) Listas encadenadas"); 
            opcionU = Verificador();

            if(opcionU == 3){
                System.out.println("\n--------------------------------");
                System.out.println("Opciones para listas encadenadas");
                System.out.println("--------------------------------");
                System.out.println("\nRealizar operaciones con: "); 
                System.out.println("4) SingleList"); 
                System.out.println("5) DoubleList"); 
                opcionU = Verificador2();
            }

            Ver = false;

        } while(Ver);

        return opcionU;
    }

    /**
     * Verificador para comprobar la validez del dato ingresado y evitar errores (Programación defensiva)
     * @return: Retorna un int correspondiente a la opcion elegida y que ha sido comprobada
     */
    public static int Verificador(){
        
        Scanner scan2 = new Scanner(System.in);
        int opcionUNum = 0;
        boolean Ver2 = true;

        do{

            String OpcionString = scan2.nextLine();
            try {
                opcionUNum = Integer.parseInt(OpcionString);

                if (opcionUNum >= 1 && opcionUNum <= 3){
                    Ver2 = false;
                } else {
                    System.out.println("Lo sentimos, esa no es una opcion del menu");
                }

            } catch (Exception e) {
                System.out.println("Lo sentimos, no es dato valido. Ingresa solo numeros.");
            }

        } while (Ver2);

        return opcionUNum;
    }

     /**
     * Verificador 2 para comprobar la validez del dato ingresado y evitar errores (Programación defensiva)
     * @return: Retorna un int correspondiente a la opcion elegida y que ha sido comprobada
     */
    public static int Verificador2(){
        
        Scanner scan3 = new Scanner(System.in);
        int opcionUNum = 0;
        boolean Ver3 = true;

        do{

            String OpcionString = scan3.nextLine();
            try {
                opcionUNum = Integer.parseInt(OpcionString);

                if (opcionUNum >= 4 && opcionUNum <= 5){
                    Ver3 = false;
                } else {
                    System.out.println("Lo sentimos, esa no es una opcion del menu");
                }

            } catch (Exception e) {
                System.out.println("Lo sentimos, no es dato valido. Ingresa solo numeros.");
            }

        } while (Ver3);

        return opcionUNum;
    }
}
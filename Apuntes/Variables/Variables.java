package Variables;

public class Variables {
    public static void main(String[] args) {

        System.out.println("Bienvenido a las variables!");

        //-----------------DECLARACIÓN DE VARIABLES CON VAR------------------
        //var es una forma de declarar variables en la que se convierte al tipo de dato, ha de ser en el main
        var edad = 2;
    }
}

class variableTypes{
    //Declaración de variables primitivas

    //-----------------NUMBERS------------------
    int age = 25;
    double myDouble = 3.122223;

    //De -128  a 127
    byte myBite = 127;

    //De -32768 a 32767
    short myShort = 32000;

    //De -9223372036854775808 a 9223372036854775807
    long myLong = 32000;

    //-----------------TEXT------------------
    char myChar = 'a';

    // String no es primitiva
    String name = "Adrián";

    //-----------------BOOLEANO------------------
    boolean myBool = false;


    //-----------------VARIABLES CONSTANTES------------------
    //Declaración de variables CONSTANTES, en CAPS para mayor legibilidad
    final String EMAIL = "constante@gmail.com";


}
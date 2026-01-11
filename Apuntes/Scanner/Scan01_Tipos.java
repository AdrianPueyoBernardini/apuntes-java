package Scanner;

//IMPORTAMOS SCANNER
import java.util.Scanner;

public class Scan01_Tipos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Scann scan = new Scann();

        //scan.scanString();
        //scan.scanInt();
        //scan.scanDouble();
        //scan.scanBool();
        //scan.scanLineSpace();
        scan.scanLineInt();




        //Un truco para solicitar otro tipo de datos sin tener en cuenta en consumir el espacio es solicitar un sc.NextLine y convertir de string al dato que queramos.

    }
}

class Scann{
    void scanString(){
        //INSTANCIAMOS EL OBJETO Y LEEMOS DE LA ENTRADA ESTANDAR "IN -INPUT"
        Scanner sc = new Scanner(System.in);

        //Solicitar datos hasta que se presiona "Enter"
        System.out.print("Introduce tu linea: ");
        var linea = sc.nextLine();
        System.out.println(linea);
    }
    void scanInt(){
        //INSTANCIAMOS EL OBJETO Y LEEMOS DE LA ENTRADA ESTANDAR "IN -INPUT"
        Scanner sc = new Scanner(System.in);

        //Solicitar datos enteros
        System.out.print("Introduce tu número entero: ");
        int entero = sc.nextInt();
        System.out.println(entero);
    }
    void scanDouble(){
        //INSTANCIAMOS EL OBJETO Y LEEMOS DE LA ENTRADA ESTANDAR "IN -INPUT"
        Scanner sc = new Scanner(System.in);

        //Solicitar datos decimales
        System.out.print("Introduce tu número decimal: ");
        double decimal = sc.nextDouble();
        System.out.println(decimal);
    }
    void scanBool(){
        Scanner sc = new Scanner(System.in);
        boolean bool = sc.nextBoolean();
        System.out.println(bool);
    }
    void scanLineSpace(){
        Scanner sc = new Scanner(System.in);
        //El método nextLine necesita consumir un espacio, sino no se ejecutará
        //Por ejemplo, nextBoolean consume el booleano, no el espacio, entonces el programa pasará de largo si hay un nextLine
        System.out.print("Introduce tu nueva linea: ");
        var newLinea = sc.nextLine();
        System.out.println(newLinea);
        //Para solucionarlo solo tendríamos que poner lo siguiente encima, para consumir el ENTER:
        sc.nextLine();

    }
    void scanLineInt(){
        Scanner sc = new Scanner(System.in);
        //Declaramos la entrada que será String
        System.out.println("Introduce tu edad: ");
        var data = sc.nextLine();
        //Convertimos al valor esperado, en este caso Int
        var dataInt = Integer.parseInt(data);

        System.out.println(dataInt);
    }
}

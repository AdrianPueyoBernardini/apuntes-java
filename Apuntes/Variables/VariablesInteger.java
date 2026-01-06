package Variables;
import java.util.Scanner;

public class VariablesInteger {
    public static void main(String[] args){
        OperacionesInteger op = new OperacionesInteger();
        op.convertirAInteger();

    }
}

class OperacionesInteger{

    //-----------------------------------------------------------------
    //Conversión de cualquier dato a Integer

    void convertirAInteger(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número, que lo quiero convertir: ");
        var datoString = sc.nextLine();

        int datoInteger = Integer.parseInt(datoString);
        System.out.println(datoInteger);

    }
}

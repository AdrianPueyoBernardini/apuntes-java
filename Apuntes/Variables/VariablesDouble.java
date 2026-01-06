package Variables;

import java.util.Scanner;

public class VariablesDouble {
    public static void main(String[] args){
        OperacionesDouble op = new OperacionesDouble();
        op.convertirADouble();

    }
}
class OperacionesDouble{

    //-----------------------------------------------------------------
    //Conversión de cualquier dato a Double
    void convertirADouble(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número flotante, que lo quiero convertir: ");
        var datoString = sc.nextLine();

        double datoDouble = Double.parseDouble(datoString);
        System.out.println(datoDouble);

    }
}
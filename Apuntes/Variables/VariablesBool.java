package Variables;

import java.util.Scanner;

public class VariablesBool {
    public static void main(String[] args){
        OperacionesBool op =  new OperacionesBool();
        op.convertirABoolean();
    }
}

class OperacionesBool{

    //-----------------------------------------------------------------
    //Conversión de cualquier dato a Bool
    void convertirABoolean(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu booleano: ");
        var myBool = Boolean.parseBoolean(sc.nextLine());
        System.out.println(myBool);
    }
}
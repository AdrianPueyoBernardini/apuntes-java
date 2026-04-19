package fundamentos.arrays;
import java.util.Scanner;

public class Arrays00_Practice {
    public static void main(String[] args) {
        //vacio
        int[] intArray;
        int[] intArray2 = new int[5];
        int[] intArray3 = {5,3,2};
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de tu array: ");
        var longitudArray = Integer.parseInt(sc.nextLine());
        intArray = new int[longitudArray];

        for(int i=0; i<intArray.length; i++){
            System.out.println("Introduce el valor de tu array con indice: " + i);
            intArray[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("-----------------------------------------------------------");
        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println(intArray);

    }
}

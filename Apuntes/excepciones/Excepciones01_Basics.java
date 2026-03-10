package excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones01_Basics {
    public static void main(String[] args) {
        int valor_a = 10;
        int valor_b = 0;

        try {
            System.out.println(valor_a/valor_b);
        }catch (Exception e){
            System.out.println("Error: " + e);
        }


    }
}

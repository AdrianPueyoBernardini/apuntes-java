package excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Excepciones02_Throw {


    public static void main(String[] args) {
        try {

            double valor = division(5,2);
            System.out.println(valor);

            Random rand = new Random();
            int dado = rand.nextInt(0,10);
            System.out.println(dado);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static float division (float a, float b) throws Exception{
        if(b==0){
            throw new Exception("No puedes dividir sobre 0");
        }
        return a/b;
    }
}






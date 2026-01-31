package bucles;
import java.util.Scanner;

public class Bucles04_BreakContinue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un límite para el loop");
        var num = Integer.parseInt(sc.nextLine());

        for(int i=0; i<=num; i++){

            if(i==3){
                //Si ponemos continue antes del printeo, saltaremos a la siguiente iteración cuando de i=3
                continue;
            }

            System.out.println(i);

            if(i==10){
                //BREAK ROMPERÁ EL BUCLE SI DA A CONDICIÓN
                break;
            }

        }

    }
}

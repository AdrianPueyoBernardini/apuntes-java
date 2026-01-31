package condicionales;
import java.util.Scanner;

public class Condicionales04_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu número");
        var num = Integer.parseInt(sc.nextLine());

        switch(num){
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            default:
                System.out.println("Invalido");
                break;

        }
    }
}

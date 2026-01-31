package practicas;
import java.util.Scanner;

public class Practica11_Rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el tamaño de tu figura: ");
        var tamaño = sc.nextInt();

        for(int i=0; i<=tamaño; i++){
                System.out.println(" ".repeat(tamaño-i) + "* ".repeat(i));

        }

    }
}

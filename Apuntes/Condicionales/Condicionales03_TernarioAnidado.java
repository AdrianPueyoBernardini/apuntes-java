package Condicionales;
import java.util.Scanner;

public class Condicionales03_TernarioAnidado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu número");
        var num = Integer.parseInt(sc.nextLine());

        var resultado = (num>0) ? "Mayor a cero" : (num<0) ? "Menor a cero" : "cero";


        System.out.println(resultado);
    }

}

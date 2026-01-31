package practicas;
import java.util.Scanner;


public class Practica01_GeneradorEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido al generador de emails!");
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Introduce tus apellidos");
        String apellidos = sc.nextLine();
        apellidos = apellidos.replaceAll(" ", ".");

        System.out.println("Introduce tu empresa");
        String empresa = sc.nextLine();

        System.out.println("Introduce el dominio, sin el punto");
        String dominio = sc.nextLine();

        String email = nombre + "." + apellidos + "@" + empresa + "." + dominio;
        System.out.println("Tu email es generado es: " + email);//System.out.println(nombre );

    }
}

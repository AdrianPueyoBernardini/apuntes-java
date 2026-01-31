package practicas;
import java.util.Scanner;

public class Practica08_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var salir = false;
        while(!salir){
            System.out.println("""
                    SISTEMA DE REGISTRO:
                    1. Registrarse
                    2. Logearse
                    3. Salir
                    
                    """);
            var opcion = sc.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Registrando...");
                case 2-> System.out.println("Logeando...");
                case 3-> salir = true;
            }
        }
    }
}

package Practicas;
import java.util.Random;
import java.util.Scanner;

public class Practica04_GeneradorID {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);



        System.out.println("----------------------------------------------------------------------");
        System.out.println("¡Bienvenido al sistema de registro de tu App!");
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Introduce tu nombre: ");
        String Nombre = scan.nextLine();

        System.out.println("Introduce tu apellido: ");
        String Apellido = scan.nextLine();

        var id = rand.nextInt(1,9999);
        var idFormat = String.format("%04d", id);

        String mensaje = """
                -----------------------USUARIO-----------------------
                \tNombre: %s
                \tApellido: %s
                \tId único: %s
                ------------------------------------------------------
                """.formatted(Nombre,Apellido, idFormat);

        System.out.println(mensaje);
    }
}

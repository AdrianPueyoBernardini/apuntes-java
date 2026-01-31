package practicas;
import java.util.Scanner;

public class Practica03_RecetasCocina {
    public static void main(String[] args){
        MetodosCocina met = new MetodosCocina();
        met.bienvenidaUsuario();
        met.añadeReceta();
    }
}

class MetodosCocina{
    void bienvenidaUsuario(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("¡Bienvenido a tu APP de recetas!");
        System.out.println("----------------------------------------------------------------------");
    }
    void añadeReceta(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de tu receta: ");
        var nombre = sc.nextLine();

        System.out.println("Introduce los ingredientes principales seguidos por una coma: ");
        var ingredientes = sc.nextLine();

        System.out.println("Introduce la duración en minutos de tu receta: ");
        var duracion = Double.parseDouble(sc.nextLine());

        System.out.println("Introduce la dificultad de tu receta *baja/media/alta: ");
        var dificultad = sc.nextLine();

        System.out.println("---------------------------RECETA---------------------------");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tDuración: " + duracion);
        System.out.println("\tDificultad: " + dificultad);
        System.out.println("-----------------------------------------------------------");
    }
}

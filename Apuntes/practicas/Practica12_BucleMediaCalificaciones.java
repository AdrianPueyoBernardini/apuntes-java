package practicas;
import java.util.Scanner;

public class Practica12_BucleMediaCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorTotal=0;

        System.out.println("¿Cuántas notas quieres agregar?");
        var longitudCalificaciones = Integer.parseInt(sc.nextLine());

        int[] arrayCalificaciones = new int[longitudCalificaciones];

        for(int i=0; i<arrayCalificaciones.length; i++){
            System.out.println("Introduce el valor de la nota " + i + " :");
            arrayCalificaciones[i] = Integer.parseInt(sc.nextLine());
        }

        for(int i=0; i<arrayCalificaciones.length; i++){
            System.out.println("El valor del alumno " + i + " es igual a : " + arrayCalificaciones[i]);
            valorTotal += arrayCalificaciones[i];
        }

        var media = valorTotal/longitudCalificaciones;
        System.out.println(media);

    }
}

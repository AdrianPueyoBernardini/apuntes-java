package Arrays;
import java.util.Scanner;

public class Arrays03_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad total de alumnos de la clase");
        var alumnos = Integer.parseInt(sc.nextLine());
        int[] arrayAlumnos = new int[alumnos];

        for(int i = 0; i<arrayAlumnos.length; i++){
            System.out.println("Introduce el ID del alumno: " + i);
            arrayAlumnos[i] = sc.nextInt();
        }
    }
}

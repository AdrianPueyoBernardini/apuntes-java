package practicas01.ejercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numerador: ");
        var numerador1 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el primer denominador: ");
        var denominador1 = Integer.parseInt(sc.nextLine());

        NumeroRacional racional1 = new NumeroRacional(numerador1,denominador1);

        System.out.println("""
                ----------Selecciona la opción que deseas----------
                \t 1. Suma
                \t 2. Resta
                \t 3. Multiplicacion
                \t 4. Division
                ---------------------------------------------------------
                """);

        System.out.println("Ingresa la opcion del menu: ");
        var opcion = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el segundo numerador: ");
        var numerador2 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el segundo denominador: ");
        var denominador2 = Integer.parseInt(sc.nextLine());

        NumeroRacional racional2 = new NumeroRacional(numerador2,denominador2);

        switch (opcion){
            case 1 -> racional1.numRacionalSuma(racional2);
            case 2 -> racional1.numRacionalResta(racional2);
            case 3 -> racional1.numRacionalMult(racional2);
            case 4 -> racional1.numRacionalDiv(racional2);
            default -> System.out.println("No es válido");
        }

    }

}

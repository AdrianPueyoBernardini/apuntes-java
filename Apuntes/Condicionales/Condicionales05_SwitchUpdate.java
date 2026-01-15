package Condicionales;
import java.util.Scanner;

public class Condicionales05_SwitchUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu mes del año: ");
        var mes = Integer.parseInt(sc.nextLine());

        var estacion = switch (mes){
            case 1 -> "invierno";
            case 2 -> "invierno";
            case 3 -> "invierno";
            case 4 -> "primavera";
            case 5 -> "primavera";
            case 6 -> "primavera";
            case 7 -> "verano";
            case 8 -> "verano";
            case 9 -> "verano";
            case 10 -> "otoño";
            case 11 -> "otoño";
            case 12 -> "primavera";
            default -> "mes no válido";
        };

        System.out.println(estacion);

    }
}

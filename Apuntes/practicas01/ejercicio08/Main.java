package practicas01.ejercicio08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;

        do {
            System.out.print("Introduce DNI/NIE: ");
            entrada = sc.nextLine();

            if (!entrada.isEmpty()) {
                NIF d = new NIF(entrada);

                if (d.dniCorrecto()) {
                    System.out.println(d);
                } else {
                    System.out.println("Documento incorrecto");
                }
            }

        } while (!entrada.isEmpty());

        sc.close();
    }
}

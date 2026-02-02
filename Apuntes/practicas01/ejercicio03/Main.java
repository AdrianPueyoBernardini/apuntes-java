package practicas01.ejercicio03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CuentaCorriente cuenta1 = new CuentaCorriente(001, 0);
        CuentaCorriente cuenta2 = new CuentaCorriente(002, 0);

        boolean menu = true;

        while (menu){
            System.out.println("""
                ----------BIENVENIDO A TU BANCA ONLINE----------
                \t 1. Ingresa dinero en la cuenta 001
                \t 2. Ingresa dinero en la cuenta 002
                \t 3. Retira dinero en la cuenta 001
                \t 4. Retira dinero en la cuenta 002
                \t 5. Visualiza tus cuentas
                \t 6. Salir de la App
                ---------------------------------------------------------
                """);
            System.out.println("Ingresa la opcion del menu: ");
            var opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){
                case 1 -> cuenta1.ingresaEfectivo();
                case 2 -> cuenta2.ingresaEfectivo();
                case 3 -> cuenta1.retiraEfectivo();
                case 4 -> cuenta2.retiraEfectivo();
                case 5 ->{
                    cuenta1.visualiza();
                    cuenta2.visualiza();
                }
                case 6 ->{
                    System.out.println("Saliendo...");
                    menu = false;

                }
            }
        }

    }
}

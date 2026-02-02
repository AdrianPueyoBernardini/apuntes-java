package practicas01.ejercicio10;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Cliente[] clientes = new Cliente[10];

    public static void main(String[] args) {
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- MENÚ CLIENTES ---");
            System.out.println("1. Alta cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Baja cliente");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    altaCliente();
                    break;
                case 2:
                    mostrarClientes();
                    break;
                case 3:
                    bajaCliente();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }

    static void altaCliente() {
        int pos = -1;

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("No hay huecos libres");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Cuota: ");
        float cuota = Float.parseFloat(sc.nextLine());

        System.out.print("Deporte: ");
        String deporte = sc.nextLine();

        clientes[pos] = new Cliente(nombre, cuota, deporte);
    }

    static void mostrarClientes() {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                System.out.println(i + " " + clientes[i].getNombre() + " " +
                        clientes[i].getCuota() + " " + clientes[i].getDeporte());
            }
        }
    }

    static void bajaCliente() {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                System.out.printf("%03d %s %s%n", i,
                        clientes[i].getNombre(),
                        clientes[i].getDeporte());
            }
        }

        System.out.print("Número de cliente: ");
        int pos = Integer.parseInt(sc.nextLine());

        if (pos < 0 || pos >= clientes.length || clientes[pos] == null) {
            System.out.println("Cliente no válido");
            return;
        }

        Cliente c = clientes[pos];

        System.out.println(c.getNombre());
        System.out.println(c.getCuota());
        System.out.println(c.getDeporte());

        System.out.print("Confirmar baja (s/n): ");
        char conf = sc.nextLine().toLowerCase().charAt(0);

        if (conf == 's') {
            clientes[pos] = null;
        }
    }
}

package practicas02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        int opcion = -1;
        Practica13_AppExcursion[] listaExcursiones;
        try {
            while(menu==true){
                System.out.println("""
                    1. Añade excrusión
                    2. Elimina excursion
                    3.Muestra las excrusiones
                    4. Salir
                    """);

                System.out.println("Elige la opción: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion){
                    case 1->{
                        System.out.println("Cuantas excrusiones deseas añadir");
                    }
                    case 2->System.out.println("test");
                    case 3->System.out.println("test");
                    case 4-> menu = false;
                    default->System.out.println("test");
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e);
        }finally {
            System.out.println("Cierre de la App");
        }
    }
}

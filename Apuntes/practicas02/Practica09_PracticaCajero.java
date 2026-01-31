package practicas02;
import java.util.Scanner;

public class Practica09_PracticaCajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cajero cajero = new Cajero();

        var salir = false;

        while(!salir){
            System.out.println("Bienvenido a tu cajero automático");
            System.out.println("""
                Introduce la opción que corresponda:
                \t 1. Depositar dinero
                \t 2. Retirar dinero
                \t 3. Consultar dinero
                \t 4. Salir
                """);
            var opcion = sc.nextInt();

            switch (opcion){
                case 1 -> cajero.depositarDinero();
                case 2 -> cajero.retirarDinero();
                case 3 -> cajero.consultarDinero();
                case 4 ->{
                    System.out.println("Saliendo...");
                    salir = true;
                }

            }
        }



    }
}

class Cajero{
    double dinero =0;
    Scanner sc = new Scanner(System.in);
    void depositarDinero(){

        System.out.println("¿Cuanto dinero deseas depositar?");
        var dineroAñadido = sc.nextDouble();
        dinero += dineroAñadido;

        System.out.println("\tHas depositado: " + dineroAñadido);
        System.out.println("\tTotal: " + String.format("%.2f", dinero));

    }
    void retirarDinero(){

        System.out.println("¿Cuanto dinero deseas retirar?");
        var dineroRetirado = sc.nextDouble();
        if(dineroRetirado>dinero){
            System.out.println("La cantidad a retirar es mayor a la que tienes en cuenta...");
        }else{
            dinero -= dineroRetirado;
            System.out.println("\tHas retirado: " + dineroRetirado);
            System.out.println("\tTotal: " + String.format("%.2f", dinero));
        }

    }
    void consultarDinero(){
        System.out.println("\tTotal: " + String.format("%.2f", dinero));
    }
}

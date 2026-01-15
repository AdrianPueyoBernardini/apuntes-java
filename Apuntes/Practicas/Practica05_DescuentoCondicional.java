package Practicas;
import java.util.Locale;
import java.util.Scanner;

public class Practica05_DescuentoCondicional {
    public static void main (String[] args){
        tienda t = new tienda();
        Scanner sc = new Scanner(System.in);

        t.bienvenidaCliente();

        System.out.println("¡Hola!¿Deseas registrarte?");
        System.out.println("si / no");
        var registro = sc.nextLine().toLowerCase();

        if(registro.equals("si")){
            t.registroCliente();
            t.mostrarDatos();
        }else if(registro.equals("no")){
            System.out.println("Saliendo...");
        }else{
            System.out.println("Respuesta no válida...");

        }
    }

}

class tienda{
    String nombre, apellidos, esMiembro;
    double gastoTotal;


    void bienvenidaCliente(){
        var mensajeBienvenida = """
                ----------------------------------------------------------------------
                \t\t\tBIENVENIDO A TU TIENDA ONLINE
                ----------------------------------------------------------------------
                """;

        System.out.println(mensajeBienvenida);
    }
    void registroCliente(){

        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido al sistema de registro!");

        System.out.println("Introduce tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Introduce tu apellido: ");
        apellidos = sc.nextLine();

        System.out.println("¿Eres miembro del club? si / no: ");
        esMiembro = sc.nextLine().toLowerCase();

        System.out.println("¿Qué importe has gastado con nosotros?: ");
        gastoTotal = sc.nextDouble();

    }

    void mostrarDatos(){
        String esMiembroFixed;
        Integer descuento=0;

        if(esMiembro.equals("si")){
            esMiembroFixed = "si";

        }else{
            esMiembroFixed = "no";
        }

        if(esMiembro.equals("si") && gastoTotal>1000){
            descuento = 10;
        }else if(esMiembro.equals("si") && gastoTotal<1000){
            descuento = 5;
        }else{
            descuento = 0;
        }

        String datos = """
                ------------------------------CLIENTE---------------------------------
                \tNombre: %s
                \tApellidos: %s
                \tEs miembro: %s
                \tPorcentaje de descuento: %d
                ----------------------------------------------------------------------
                """.formatted(nombre,apellidos,esMiembroFixed, descuento);

        System.out.println(datos);
    }
}

package Practicas;
import java.util.Scanner;


public class Practica02_SistemaDeEmpleados {
    public static void main(String[] args){
        MetodosEmpleado op = new MetodosEmpleado();
        op.bienvenidaEmpleado();
        op.solicitarDatos();
    }

}

class MetodosEmpleado{
    void bienvenidaEmpleado(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("¡Bienvenido al sistema de registro de empleados de Aperture Science!");
        System.out.println("----------------------------------------------------------------------");
    }

    void solicitarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        var nombre = sc.nextLine();

        System.out.println("Introduce tu edad: ");
        var edad = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce tu salario: ");
        var salario = Double.parseDouble(sc.nextLine());

        System.out.println("¿Eres jefe? ---- true o false ----  ");
        var esJefe = Boolean.parseBoolean(sc.nextLine());

        System.out.println("---------------------------DATOS---------------------------");
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Edad del empleado: " + edad);
        System.out.println("Salario del empleado: " + salario);
        System.out.println("¿Es jefe de Aperture Science?: " + esJefe);
        System.out.println("-----------------------------------------------------------");
    }
}

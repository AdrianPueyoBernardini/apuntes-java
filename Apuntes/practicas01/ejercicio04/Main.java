package practicas01.ejercicio04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indícame el día: ");
        var dia = Integer.parseInt(sc.nextLine());
        if (dia == 0) {

        }else{
            System.out.println("Indícame el mes: ");
            var mes = Integer.parseInt(sc.nextLine());

            System.out.println("Indícame el año: ");
            var año = Integer.parseInt(sc.nextLine());

            ManejoFechas fecha1 = new ManejoFechas(dia, mes, año);

            if(fecha1.esCorrecta()){
                System.out.println("La fecha indicada es correcta ");
            }else{
                System.out.println("La fecha indicada es incorrecta ");
            }

            System.out.println(fecha1.toString());
        }

    }
}

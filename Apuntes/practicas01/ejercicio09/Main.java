package practicas01.ejercicio09;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas veces quieres tirar 2 dados?");
        var numeroTiradas = Integer.parseInt(sc.nextLine());
        int iguales= 0;
        for (int i = 0; i<numeroTiradas; i++){
            Lanzador dados = new Lanzador();
            dados.lanza();
            dados.sonIguales();
            dados.muestraDados();

            if(dados.sonIguales()==true){
                iguales +=1;
            }
        }
        System.out.println("Han salido: " + iguales + " repeticion/es en los dados");
    }
}

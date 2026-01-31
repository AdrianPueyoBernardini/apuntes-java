package matrices;
import java.util.Scanner;


public class Matrices02_RecorrerMatriz {
    public static void main(String[] argz){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame las filas de la matriz");
        var filas = Integer.parseInt(sc.nextLine());

        System.out.println("Dame las columnas de la matriz");
        var columnas = Integer.parseInt(sc.nextLine());

        int[][] miMatriz = new int[filas][columnas];

        for(int f=0; f<filas; f++){
            for(int c=0; c<columnas; c++){
                System.out.println("Valor: " + f + " " + c + " = " + miMatriz[f][c]);
            }
        }


    }
}

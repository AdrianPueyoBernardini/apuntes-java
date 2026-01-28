package Practicas;
import java.util.Scanner;
import java.util.Random;

public class Practica10_JuegoAdivinanza {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        var winnerNumber = random.nextInt(1, 50);
        var playerNumber = 0;

        while(playerNumber!=winnerNumber){
            System.out.println("Prueba suerte! :) ");
            playerNumber = sc.nextInt();
            System.out.println("Sigue intentando...");

        }
        System.out.println("Enhorabuena! tu número es: " + winnerNumber);
    }
}

package practicas01.ejercicio02;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Tamagotchi tamagotchi1 = new Tamagotchi("Abby", 0, 100);
        //Tamagotchi tamagotchi2 = new Tamagotchi("Marvin", 0, 80);

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Tamagotchi tamagotchi = null;

        boolean menu = true;
        while(menu){
            System.out.println("""
                ----------BIENVENIDO AL MENU DE TU TAMAGOTCHI----------
                \t 1. Crea tu Tamagotchi
                \t 2. Juega con tu Tamagotchi
                \t 3. Da de comer a tu Tamagotchi
                \t 4. Visualiza el estado de tu Tamagotchi
                \t 5. Salir del juego
                ---------------------------------------------------------
                """);
            System.out.println("Ingresa la opcion del menu: ");
            var opcion = Integer.parseInt(sc.nextLine());


            switch (opcion){
                case 1 ->{
                    System.out.println("Elige el nombre de tu Tamagotchi :) : ");
                    String nombre = sc.nextLine();

                    System.out.println("¡Asigno aleatoriamente su vida máxima entre 10 y 100, suerte...!");
                    int vidaMax = random.nextInt(10,100);
                    System.out.println("Su vida es...: " + vidaMax);

                    tamagotchi = new Tamagotchi(nombre, 0,vidaMax);
                    tamagotchi.visualiza();
                }
                case 2 ->{
                    if(tamagotchi !=null){
                        tamagotchi.juega();
                    }else{
                        System.out.println("¡Tienes que crear primero tu Tamagotchi!");
                    }

                }
                case 3 ->{
                    if(tamagotchi !=null){
                        tamagotchi.come();
                    }else{
                        System.out.println("¡Tienes que crear primero tu Tamagotchi!");
                    }

                }
                case 4 ->{
                    if(tamagotchi !=null){
                        tamagotchi.visualiza();
                    }else{
                        System.out.println("¡Tienes que crear primero tu Tamagotchi!");
                    }

                }
                case 5 ->{
                    System.out.println("Saliendo...");
                    menu = false;
                }
            }
        }

    }
}

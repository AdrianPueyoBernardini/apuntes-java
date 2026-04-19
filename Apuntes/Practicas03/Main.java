package Practicas03;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> userList = new ArrayList<>();
        boolean menu=true;
        var opcion = 0;


        while(menu){
            System.out.println("""
                    _____________________________________________________________________________
                              /\\         *              *       *           *        *
                             /**\\              *                                               *
                            /****\\   /\\                    *       *           *       *
                           /      \\ /**\\
                          /  /\\    /    \\        /\\    /\\  /\\      /\\            /\\/\\/\\  /\\
                         /  /  \\  /      \\      /  \\/\\/  \\/  \\  /\\/  \\/\\  /\\  /\\/ / /  \\/  \\
                        /  /    \\/ /\\     \\   /    \\ \\   /    \\/ /   /  \\/  \\/  \\  /    \\   \
                    
                    
                    ¡BIENVENIDO A HUELLA, AVENTURERO!
                    Selecciona la opción que deseas realizar: 
                    1. Login
                    2. Registro
                    3. Ver usuarios registrados
                    4. Salir
                    """);
                    opcion = Integer.parseInt(sc.nextLine());

                    switch (opcion){
                        case 1 ->{
                            try {
                                System.out.println("Escribe el nombre de usuario: ");
                                var nombre = sc.nextLine();

                                for (Usuario user : userList){
                                    if(user.getNombre().equals(nombre)){
                                        System.out.println("Escribe la password de: " + user.getNombre());
                                        var pass = sc.nextLine();
                                        if(user.getContraseña().equals(pass)){
                                            System.out.println("¡Exito! Te has logueado ");
                                            break;
                                        }
                                    }else{
                                        System.out.println("Usuario no encontrado... ");
                                        break;
                                    }
                                }

                            }catch (Exception e){

                            }
                        }
                        case 2 ->{
                            System.out.println("Introduce tu nombre de usuario: ");
                            var nombre = sc.nextLine();
                            System.out.println("Introduce la contraseña: ");
                            var password = sc.nextLine();

                            Usuario user = new Usuario(nombre, password);

                            userList.add(user);
                        }
                        case 3 ->{
                            try {
                                for (Usuario user : userList){
                                    System.out.println(user.toString());
                                }
                                System.out.println("Presiona cualquier tecla para continuar...");
                                sc.nextLine();

                            }catch (Exception e){
                                System.out.println("error: " + e);
                            }
                        }
                        case 4 ->{
                            System.out.println("Saliendo...");
                            menu =false;
                        }
                    }


        }
        var user1 = new Usuario("Adrian", "1234");
        System.out.println(user1.toString());
    }
}

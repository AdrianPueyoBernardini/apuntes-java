package colecciones.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02_Practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> userList = new ArrayList<>();
        System.out.println("¿Cuántos users deseas agregar?: ");
        var users = Integer.parseInt(sc.nextLine());

        for (int i=0; i<users; i++){
            System.out.println("Indroduce el nombre del user: " + i);
            var user = sc.nextLine();
            userList.add(user);
        }

        System.out.println("Lista de usuarios: ");
        for (int i=0; i<userList.size(); i++){
            System.out.println(userList.get(i));
        }
        System.out.println("Lista de usuarios: ");
        for(String elementos: userList){
            System.out.println(elementos);
        }

    }
}

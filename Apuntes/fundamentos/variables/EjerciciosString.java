package fundamentos.variables;
import java.util.Scanner;
public class EjerciciosString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("Introduce una frase:");
        String frase1 = sc.nextLine();
        System.out.println("Texto: " + frase1);
        System.out.println("La frase tiene " + frase1.length() + " caracteres.");

        // Ejercicio 2
        System.out.println("\nIntroduce una palabra:");
        String palabra2 = sc.nextLine();
        System.out.println("Primera letra: " + palabra2.charAt(0));
        System.out.println("Última letra: " + palabra2.charAt(palabra2.length() - 1));

        // Ejercicio 3
        System.out.println("\nIntroduce una frase:");
        String frase3 = sc.nextLine();
        System.out.println("Introduce una palabra:");
        String palabra3 = sc.nextLine();
        if (frase3.contains(palabra3)) {
            System.out.println("La frase contiene la palabra.");
        } else {
            System.out.println("La frase no contiene la palabra.");
        }

        // Ejercicio 4
        System.out.println("\nPalabra 1:");
        String p1 = sc.nextLine();
        System.out.println("Palabra 2:");
        String p2 = sc.nextLine();
        if (p1.equals(p2)) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("Las palabras no son iguales.");
        }

        // Ejercicio 5
        System.out.println("\nIntroduce una palabra:");
        String palabra5 = sc.nextLine();
        System.out.println("Introduce un carácter:");
        char letra5 = sc.nextLine().charAt(0);
        int pos = palabra5.indexOf(letra5);
        if (pos != -1) {
            System.out.println("La letra aparece en la posición " + pos);
        } else {
            System.out.println("La letra no aparece.");
        }

        // Ejercicio 6
        System.out.println("\nIntroduce un texto:");
        String texto6 = sc.nextLine();
        texto6 = texto6.trim();
        if (texto6.isEmpty()) {
            System.out.println("El texto está vacío.");
        } else {
            System.out.println("El texto no está vacío.");
        }

        // Ejercicio 7
        System.out.println("\nIntroduce una frase:");
        String frase7 = sc.nextLine();
        System.out.println("Mayúsculas: " + frase7.toUpperCase());
        System.out.println("Minúsculas: " + frase7.toLowerCase());

        // Ejercicio 8
        System.out.println("\nIntroduce una frase:");
        String frase8 = sc.nextLine();
        String reemplazo = frase8.replace('a', '@');
        System.out.println(reemplazo);

        // Ejercicio 9
        System.out.println("\nIntroduce una palabra:");
        String palabra9 = sc.nextLine();
        if (palabra9.length() >= 3) {
            System.out.println(palabra9.substring(2));
        } else {
            System.out.println("La palabra es demasiado corta.");
        }

        // Ejercicio 10
        System.out.println("\nIntroduce una frase:");
        String frase10 = sc.nextLine();
        String[] palabras = frase10.split(" ");
        for (String p : palabras) {
            System.out.println(p);
        }

        // Ejercicio 11
        System.out.println("\nIntroduce un número:");
        int numero = sc.nextInt();
        String textoNumero = String.valueOf(numero);
        System.out.println("El número como texto es: \"" + textoNumero + "\"");
        sc.nextLine();

        // Ejercicio 12
        System.out.println("\nIntroduce una frase:");
        String frase12 = sc.nextLine();
        System.out.println("Introduce una letra:");
        char letra12 = sc.nextLine().charAt(0);
        int contador = 0;
        for (int i = 0; i < frase12.length(); i++) {
            if (frase12.charAt(i) == letra12) {
                contador++;
            }
        }
        System.out.println("La letra aparece " + contador + " veces");

        // Ejercicio 13
        System.out.println("\nIntroduce una frase:");
        String frase13 = sc.nextLine();
        String limpia = frase13.trim();
        System.out.println("Frase limpia: " + limpia);
        System.out.println("Mayúsculas: " + limpia.toUpperCase());
        System.out.println("Caracteres: " + limpia.length());
        String[] partes = limpia.split("\\s+");
        System.out.println("Palabras: " + partes.length);

        sc.close();
    }

}

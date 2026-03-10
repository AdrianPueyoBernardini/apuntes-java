package bucles;

public class Bucles05_ForEach {
    public static void main(String[] args) {
        //Bucle foreach, para los arrays facilita mucho el visionado y es más sencillo
        int edades[] = {1,2,3,4,5,6,7};
        for (int edad : edades){
            System.out.println(edad);
        }
    }
}

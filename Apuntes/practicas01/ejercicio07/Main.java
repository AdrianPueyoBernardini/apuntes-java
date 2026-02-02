package practicas01.ejercicio07;

public class Main {
    public static void main(String[] args) {
        LineaAutobus linea1 = new LineaAutobus("34", 10, new int[]{2,4,5});
        System.out.println(linea1.toString());

        LineaAutobus linea2 = new LineaAutobus("C1", 12, new int[]{21,33,156});
        System.out.println(linea2.toString());

        LineaAutobus linea3 = new LineaAutobus("C2", 5, new int[]{42,24,33});
        System.out.println(linea3.toString());


        LineaAutobus linea4 = new LineaAutobus("42", 20, new int[]{1,2,7,8,22});
        System.out.println(linea4.toString());
    }
}

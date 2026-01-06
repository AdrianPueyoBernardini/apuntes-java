package Operadores;

public class OperadoresDeComparacion {
    public static void main(String[] args) {

    }
}

class OperadoresDeComp{
    int a = 1;
    int b = 2;
    int c = 1;

    void mostrarComparacionAB(){
        System.out.println("A es igual a B?: ");
        System.out.println(a == b);
    }
    void mostrarComparacionAC(){
        System.out.println("A es igual a C?: ");
        System.out.println(a == c);
    }
    void mostrarComparacionDistintaAB(){
        System.out.println("A es distinta a B?: ");
        System.out.println(a != b);
    }
    void mostrarComparacionMayorAB(){
        System.out.println("A es mayor a B?: ");
        System.out.println(a > b);
    }
}

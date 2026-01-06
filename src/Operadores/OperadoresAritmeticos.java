package Operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        OperadoresArit nuevoOperador = new OperadoresArit();
        nuevoOperador.mostrarSuma();
    }
}

class OperadoresArit{

    int num1 = 4;
    int num2 = 2;

    void mostrarSuma(){
        System.out.println("Suma de: " + num1 + " y " + num2);
        System.out.println(num1+num2);
    }
    void mostrarResta(){
        System.out.println("Resta de: "  + num1 + " y " + num2);
        System.out.println(num1-num2);
    }
    void mostrarMultiplicacion(){
        System.out.println("Multiplicación de: "  + num1 + " y " + num2);
        System.out.println(num1*num2);
    }
    void mostrarDivision(){
        System.out.println("Division de: "  + num1 + " y " + num2);
        System.out.println(num1/num2);
    }
    void mostrarResto(){
        System.out.println("Resto de: "  + num1 + " y " + num2);
        System.out.println(num1%num2);
    }
    int hacerCalculo() {
        return num1+num2;
    }

}
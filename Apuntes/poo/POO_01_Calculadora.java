package poo;

//Creación básica de un objeto y su instancia en "Zona Practica01"

public class POO_01_Calculadora {
    int operando1,operando2;

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("El resultado de la resta es: " + resultado);
    }
    void multiplicar(){
        var resultado = operando1 * operando2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
    void dividir(){
        var resultado = operando1 / operando2;
        System.out.println("El resultado de la división es: " + resultado);
    }
}

package practicas01.ejercicio06;

public class NumeroRacional {
    private int numerador;
    private int denominador;

    public NumeroRacional(int num, int den){
        this.numerador = num;
        this.denominador = den;
    }

    public void numRacionalSuma(NumeroRacional num2){
        System.out.println(numerador + "\n-\n" + denominador);
        System.out.println("MAS");
        System.out.println(num2.numerador + "\n-\n" + num2.denominador);

        var nuevoNumerador = (numerador * num2.denominador + num2.numerador * denominador);
        var nuevoDenominador = denominador * num2.denominador;

        System.out.println("El nuevo numero racional es: ");
        System.out.println(nuevoNumerador + "\n-\n" + nuevoDenominador);
    }
    public void numRacionalResta(NumeroRacional num2){
        System.out.println(numerador + "\n-\n" + denominador);
        System.out.println("MENOS");
        System.out.println(num2.numerador + "\n-\n" + num2.denominador);

        var nuevoNumerador = (numerador * num2.denominador - num2.numerador * denominador);
        var nuevoDenominador = denominador * num2.denominador;

        System.out.println("El nuevo numero racional es: ");
        System.out.println(nuevoNumerador + "\n-\n" + nuevoDenominador);
    }
    public void numRacionalMult(NumeroRacional num2){
        System.out.println(numerador + "\n-\n" + denominador);
        System.out.println("MULTIPLICADO POR: ");
        System.out.println(num2.numerador + "\n-\n" + num2.denominador);

        var nuevoNumerador = numerador * num2.numerador;
        var nuevoDenominador = denominador * num2.denominador;

        System.out.println("El nuevo numero racional es: ");
        System.out.println(nuevoNumerador + "\n-\n" + nuevoDenominador);
    }
    public void numRacionalDiv(NumeroRacional num2){
        System.out.println(numerador + "\n-\n" + denominador);
        System.out.println("DIVIDIDO POR: ");
        System.out.println(num2.numerador + "\n-\n" + num2.denominador);

        var nuevoNumerador = numerador * num2.denominador;
        var nuevoDenominador = denominador * num2.numerador;

        System.out.println("El nuevo numero racional es: ");
        System.out.println(nuevoNumerador + "\n-\n" + nuevoDenominador);
    }
}

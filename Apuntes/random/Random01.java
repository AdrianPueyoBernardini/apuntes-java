package random;
import java.util.Random;

public class Random01 {
    public static void main(String[] args) {
        RandomMetod met = new RandomMetod();
        met.generarIntAleatorio();
        met.generarIntAleatorio2();
        met.generarFloatAleatorio();
    }
}
class RandomMetod{
    void generarIntAleatorio(){
        Random random = new Random();
        var randomNum = random.nextInt(10);
        System.out.println("El número random elegido entre 0 y 9 es...: " + randomNum);
    }

    //Si queremos que el rango de aleatorios sea entre 1 y 10 y que no empiece desde el 0:
    void generarIntAleatorio2(){
        Random random = new Random();
        var randomNum = random.nextInt(10)+1;
        System.out.println("El número random elegido entre 1 y 10 es...: " + randomNum);
    }

    //Podemos generar aleatorio flotantes también
    void generarFloatAleatorio(){
        Random random = new Random();
        var randomFloat = random.nextFloat();
        System.out.println("El número random flotante entre 0 y 9 es...: " + randomFloat);
    }
}

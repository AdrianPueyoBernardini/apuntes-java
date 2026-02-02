package practicas01.ejercicio09;
import java.util.Random;

public class Lanzador {
    private int dado1, dado2;

    public void lanza(){
        Random rand = new Random();
        dado1 = rand.nextInt(6)+1;
        dado2 = rand.nextInt(6)+1;
    }
    public boolean sonIguales(){
        if(dado1==dado2){
            System.out.println("Son iguales!");
            return true;
        }else{
            System.out.println("No son iguales!");
            return false;
        }
    }
    public void muestraDados(){
        System.out.println("El dado 1 ha sacado: " + dado1);
        System.out.println("El dado 2 ha sacado: " + dado2);
    }
}

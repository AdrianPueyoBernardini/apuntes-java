package poo.herencia;

public class Vehiculo {

    //Protected: Solo puede ser accedido por la clase origen o hijos de ella
    protected void repostar(){
        System.out.println("Repostando vehiculo....");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("¡Repostado!");
    }
}

class Coche extends Vehiculo{

    public void pitar(){
        System.out.println("Coche dice: asdasd asdsdasd");
    }

    //1. Podemos sobreescribir los métodos de la clase padre, de esta forma, añadiremos funcionabilidades
    //Override no hace realmente nada, sin embargo, es una anotación muy util
    //2. super hace que aunque tengamos una clase sobreescrita, podamos llamar a la clase padre, con el metodo original
    @Override
    protected void repostar(){
        System.out.println("Repostando coche....");
        super.repostar();
    }


}

class Avion extends Vehiculo{

    public void volar(){
        System.out.println("Volando...");
    }

}

package poo.interfaces;

public interface Traductor  {
    void traducir();

    //No es obligatorio implementar este método "default"
    default void iniciarTraductor(){
        System.out.println("Iniciando...");
    }
}

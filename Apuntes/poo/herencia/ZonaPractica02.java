package poo.herencia;

public class ZonaPractica02 {
    public static void main(String[] args){
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.repostar();

        Coche coche = new Coche();
        Avion avion = new Avion();

        coche.repostar();
        coche.pitar();

        avion.repostar();
        avion.volar();
    }
}

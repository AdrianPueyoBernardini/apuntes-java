package poo.practicas.Practica02;

public class Coche extends Vehiculo{
    public String matricula;
    public String conduccion;
    public String combustible;
    public int caballos;

    public Coche(boolean motorizado, int ruedas, String marca, String color, String dueño, int añoCompra, String matricula, String conduccion, String combustible, int caballos){
        super(motorizado, ruedas, marca, color, dueño, añoCompra);
        this.matricula = matricula;
        this.conduccion = conduccion;
        this.combustible = combustible;
        this.caballos = caballos;

    }

    public void arrancar(){

    }
    public void cambiarMarcha(int marcha){

    }
    @Override
    public String toString(){
        return "Coche: \n" + "matricula: " +  matricula + " conduccion: " + conduccion + " combustible: " + combustible + " Caballos: " + caballos;
    }
}

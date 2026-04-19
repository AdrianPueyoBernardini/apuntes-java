package poo.practicas.Practica02;

public class Motocicleta extends Vehiculo{
    public String matricula;
    public String combustible;
    public int caballos;

    public Motocicleta(boolean motorizado, int ruedas, String marca, String color, String dueño, int añoCompra, String matricula, String combustible, int caballos){
        super(motorizado, ruedas, marca, color, dueño, añoCompra);
        this.matricula = matricula;
        this.combustible = combustible;
        this.caballos = caballos;
    }

    public void arrancar(){

    }
    public void subirMarcha(){

    }
    private void bajarMarcha(){

    }
    @Override
    public String toString(){
        return "Motocicleta: \n" + "matricula: " +  matricula + " combustible: " + combustible + " caballos: " + caballos;
    }
}

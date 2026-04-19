package poo.practicas.Practica02;

public class Bicicleta extends Vehiculo{
    public boolean electrico;
    public int platos;
    public int pinones;

    public Bicicleta(boolean motorizado, int ruedas, String marca, String color, String dueño, int añoCompra, boolean electrico, int platos, int pinones){
        super(motorizado, ruedas, marca, color, dueño, añoCompra);
        this.electrico = electrico;
        this.platos = platos;
        this.pinones = pinones;
    }

    public void subirse(){

    }

    @Override
    public String toString(){
        return "Bicicleta: \n" + "Electrica: " +  electrico + " Platos: " + platos + " Piñones: " + pinones;
    }
}

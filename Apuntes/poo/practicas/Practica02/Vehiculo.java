package poo.practicas.Practica02;

public class Vehiculo {
    public boolean motorizado;
    public int ruedas;
    public String marca;
    public String color;
    public String dueño;
    protected int añoCompra;

    public Vehiculo(boolean motorizado, int ruedas, String marca, String color, String dueño, int añoCompra){
        this.motorizado = motorizado;
        this.ruedas = ruedas;
        this.marca = marca;
        this.color = color;
        this.dueño = dueño;
        this.añoCompra = añoCompra;
    }
    public void estacionar(){

    }
    @Override
    public String toString(){
        return "Vehiculo: " + motorizado + " " + ruedas + " " + marca + " " + color + " " + dueño + " " + añoCompra;
    }
}

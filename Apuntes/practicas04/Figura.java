package practicas04;

public abstract class Figura {
    double dato1;
    String tipo;

    public Figura(double dato1, String tipo){
        this.dato1 = dato1;
        this.tipo = tipo;
    }

    public abstract double area();
}

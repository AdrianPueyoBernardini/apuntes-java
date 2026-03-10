package practicas02;

public class Practica13_AppExcursion {
    private String nombre;
    private double distancia;
    private int duracion, dificultad, puntuacion;


    public Practica13_AppExcursion(String nombre, double distancia, int duracion, int dificultad){
        this.nombre = nombre;
        this.distancia = distancia;
        this.duracion = duracion;
        this.dificultad = dificultad;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getDistancia(){
        return  distancia;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
    public int getDuracion(){
        return duracion;
    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    public int getDificultad(){
        return dificultad;
    }
    public void setDificultad(int dificultad){
        this.dificultad = dificultad;
    }
    public int getPuntuacion(){
        return puntuacion;
    }

    public void puntuaExcursion(int puntuacion) throws Exception{
        if(puntuacion <0 || puntuacion>10){
            throw  new Exception("El valor ha de ser entre 0 y 10");
        }
        this.puntuacion = puntuacion;
    }


}



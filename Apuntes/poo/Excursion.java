package poo;

public class Excursion {

    //1. Primero seleccionamos los atributos que tendrá la clase, en privado, ya que para acceder a ellos tendrá que ser
    //   con el metodo get y set

    private String nombre;
    private double duracion;
    private double distancia;
    private int dificultad;

    //2. Creamos un constructor, tiene que tener el mismo nombre de la clase
    //   Introduciremos todos los atributos que se puedan aplicar en la creación de la clase e igualaremos los atributos
    //   creados anteriormente para que una vez se cree la isntancia, le de los valores a nuestra clase

    public Excursion(String nombre, double duracion, double distancia, int dificultad){
        this.nombre = nombre;
        this.duracion = duracion;
        this.distancia = distancia;
        this.dificultad = dificultad;
    }

    //3. Dejando este duplicado del constructor vacía, aplicamos la "sobrecarga de constructores" es decir, ahora
    //   no tendremos un error cuando creemos una instancia vacía y saldrán los siguientes valores por defecto

    public Excursion(){
        this("No hay datos", 0, 0, 1);
    }

    //4. Añadimos el metodo get y set de cada uno de los atributos

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getDuracion(){
        return duracion;
    }
    public void setDuracion(double duracion){
        this.duracion = duracion;
    }

    public double getDistancia(){
        return distancia;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }

    public int getDificultad(){
        return dificultad;
    }
    public void setDificultad(int dificultad){
        this.dificultad = dificultad;
    }


    public void muestraExcursion(){

        System.out.println("------------------DATOS--------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("duracion: " + duracion  + " minutos");
        System.out.println("Distancia: " + distancia + " kilometros");
        System.out.println("Dificultad: " + dificultad + " (escala del 1 al 10)");
        System.out.println("-------------------------------------------");

    }
}



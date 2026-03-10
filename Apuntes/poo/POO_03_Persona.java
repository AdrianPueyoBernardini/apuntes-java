package poo;

//Creación básica de un objeto con getters,setters, toString y atributo estático contador de objetos Persona

public class POO_03_Persona {

    static int contadorPersonas;
    private String nombre;
    private int edad;

    public POO_03_Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        POO_03_Persona.contadorPersonas++;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    //ToString proviene de la clase object, por lo que ponemos override ya que la vamos a "sobreescribir"
    //Una de las ventajas del toString, es que no hay que especificar llamarlo, de forma automatica, si printeamos el object aparecerá el método

    @Override
    public String toString(){
        return "Nombre: " + nombre +"\nEdad: " + edad;
    }
}

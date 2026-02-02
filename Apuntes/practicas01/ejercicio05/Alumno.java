package practicas01.ejercicio05;

public class Alumno {
    private String nombre;
    private float nota;
    private int edad;

    public Alumno(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //en vez de usarlo con "ponNota", creo getters y setters ya que en el metodo del ejercicio no hace mas que "setear" la nota.
    public float getNota(){
        return nota;
    }
    public void setNota(float nota){
        this.nota = nota;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    @Override
    public String toString(){
        return "-------------" + "\nAlumno: " + nombre + "\nEdad: " + edad + "\nNota: " + nota + "\n-------------";
    }

}

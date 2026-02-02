package practicas01.ejercicio10;

public class Cliente {
    private String nombre;
    private float cuota;
    private String deporte;

    public Cliente(String nombre, float cuota, String deporte){
        this.nombre = nombre;
        this.cuota = cuota;
        this.deporte = deporte;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public float getCuota(){
        return cuota;
    }
    public void setCuota(float cuota){
        this.cuota = cuota;
    }
    public String getDeporte(){
        return deporte;
    }
    public void setDeporte(String deporte){
        this.deporte = deporte;
    }

}

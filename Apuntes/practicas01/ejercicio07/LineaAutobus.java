package practicas01.ejercicio07;

public class LineaAutobus {
    private String numeroLinea;
    private int frecuencia;
    private int[] paradas;

    public LineaAutobus(String numeroLinea, int frecuencia, int[] paradas){
        this.numeroLinea = numeroLinea;
        this.frecuencia = frecuencia;
        this.paradas = paradas;
    }

    public String getNumeroLinea(){
        return numeroLinea;
    }
    public void setNumeroLinea(String numeroLinea){
        this.numeroLinea = numeroLinea;
    }

    public int getFrecuencia(){
        return  frecuencia;
    }
    public void setFrecuencia(int frecuencia){
        this.frecuencia = frecuencia;
    }

    public int[] getParadas(){
        return paradas;
    }
    public void setParadas(int[] paradas){
        this.paradas = paradas;
    }

    @Override
    public String toString(){
        String mensaje = "Linea: " + numeroLinea + " Frecuencia: " + frecuencia + " minutos"
                + "\nParadas: ";

        for(int i=0; i<paradas.length; i++){
            if(i< paradas.length-1){
                mensaje += paradas[i] + "-";
            }else{
                mensaje += paradas[i];
            }

        }
        return mensaje;
    }
}

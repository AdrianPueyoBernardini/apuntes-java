package practicas01.ejercicio04;

public class ManejoFechas {
    private int dia;
    private int mes;
    private int año;

    public ManejoFechas(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año = año;
    }

    //Métodos
    //Lo he hecho public en vez de private por que he creado una clase main para separar la zona de prácticas

    public String getMesLetras(){
        switch (mes){
            case 1 ->{
                return "enero";
            }
            case 2 ->{
                return "febrero";
            }
            case 3 ->{
                return "marzo";
            }
            case 4 ->{
                return "abril";
            }
            case 5 ->{
                return "mayo";
            }
            case 6 ->{
                return "junio";
            }
            case 7 ->{
                return "julio";
            }
            case 8 ->{
                return "agosto";
            }
            case 9 ->{
                return "septiembre";
            }
            case 10 ->{
                return "octubre";
            }
            case 11 ->{
                return "noviembre";
            }
            case 12 ->{
                return "diciembre";
            }
            default ->{
                return "No has seleccionado mes válido";
            }
        }
    }
    public boolean esBisiesto(){
        if((año % 4 == 0 && año % 100 != 0) || año % 400 == 0){
            System.out.println("Si, es bisiesto");
            return true;
        }else{
            System.out.println("No, no es bisiesto");
            return false;
        }
    }

    public int getDiasMes(){
        switch (mes){
            case 1 ->{
                return 31;
            }
            case 2 ->{
                if((año % 4 == 0 && año % 100 != 0) || año % 400 == 0){

                    return 29;
                }else{

                    return 28;
                }
            }
            case 3 ->{
                return 31;
            }
            case 4 ->{
                return 30;
            }
            case 5 ->{
                return 31;
            }
            case 6 ->{
                return 30;
            }
            case 7 ->{
                return 31;
            }
            case 8 ->{
                return 31;
            }
            case 9 ->{
                return 30;
            }
            case 10 ->{
                return 31;
            }
            case 11 ->{
                return 30;
            }
            case 12 ->{
                return 31;
            }
            default ->{
                System.out.println("Mes no valido...");
                return 0;
            }
        }
    }
    public boolean esCorrecta(){
        return dia>getDiasMes() || dia<=0 || mes<1 || mes>12 || año<0 ? false : true;
    }

    @Override
    public String toString(){
        return dia + " de " + getMesLetras() + " de " + año;
    }
}

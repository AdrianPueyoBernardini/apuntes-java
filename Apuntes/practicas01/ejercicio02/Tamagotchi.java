package practicas01.ejercicio02;

//PRACTICAS REALIZADAS SIN USO DE CHATGPT*
//He creado una clase main como menú selector de la "App"

public class Tamagotchi {
    private String nombre;
    private int cantidadVida=0;
    private int maxVida;

    //Creo el constructor
    public Tamagotchi(String nombre, int cantidadVida, int maxVida){
        this.nombre = nombre;
        this.cantidadVida = cantidadVida;
        this.maxVida = maxVida;
    }

    //Introduzco getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getCantidadVida(){
        return cantidadVida;
    }
    public void setCantidadVida(int cantidadVida){
        this.cantidadVida = cantidadVida;
    }

    public int getMaxVida(){
        return maxVida;
    }
    public void setMaxVida(int maxVida){
        this.maxVida = maxVida;
    }

    public void visualiza(){
        var mensaje = String.format("""
                ----------BIENVENIDO AL PERFIL DE TU TAMAGOTCHI----------
                \t Nombre: %s
                \t Cantidad de vida: %d
                \t Vida máxima: %d
                ---------------------------------------------------------
                """,nombre, cantidadVida, maxVida);

        System.out.println(mensaje);
    }

    public void juega(){
        if(cantidadVida>=1){
            for(int i=0; i<5; i++){
                System.out.println("Estoy jugando");
            }
            cantidadVida-=1;
        }else{
            System.out.println("No puedo jugar, no tengo vida :(");
        }

    }

    public void come(){
        if(cantidadVida<maxVida){
            for(int i=0; i<5; i++){
                System.out.println("Estoy comiendo...");
            }
            cantidadVida+=1;
        }else{
            System.out.println("¡No tengo hambre, estoy lleno!");
        }
    }

}

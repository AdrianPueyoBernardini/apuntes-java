package Practicas03;

public class Usuario {
    private String nombre;
    private String contraseña;
    private int id;
    private static int contadorPersonas=0;

    public Usuario(String nombre, String contraseña){
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.id = contadorPersonas;
        contadorPersonas++;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getContraseña(){
        return this.contraseña;
    }
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    public int getId(){
        return this.id;
    }

    @Override
    public String toString(){
        var mensaje = String.format("""
                -----------------USUARIO-----------------
                Nombre de usuario: %s
                Contraseña: %s
                Id: %s
                -----------------------------------------
                """, nombre,contraseña,id);
        
         return mensaje;
    }


}

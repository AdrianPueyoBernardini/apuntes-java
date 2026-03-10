package poo;


public class ZonaPractica01 {

    public static void main(String[] args) {
        POO_03_Persona p1 = new POO_03_Persona("Adri", 32);
        p1.setEdad(22);
        //El metodo to String nos permite mostrar el objecto sin tener que llamarlo
        //System.out.println(p1.toString());
        System.out.println(p1);

        POO_03_Persona p2 = new POO_03_Persona("Noelia", 26);
        System.out.println(POO_03_Persona.contadorPersonas);



    }



}

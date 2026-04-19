package colecciones.ArrayList;

import java.util.ArrayList;

public class ArrayList01_Basics {

    //------------------ARRAYLIST-------------------
    //*. Mantiene el orden de los elementos conforme su inserción
    //*. Permite elementos duplicados
    //*. Acceso rápido
    //*. Lento a la hora de insertar elementos intermedios

    ArrayList<String> miLista = new ArrayList<>();


    public static void main(String[] args) {
        ArrayList01_Basics arr = new ArrayList01_Basics();

        //Añadir elementos
        arr.añadirElementos();
        //Obtener elementos
        arr.obtenerElementos();


    }

    //------------------------------
    //1. Añadir elementos
    //------------------------------

    public void añadirElementos(){
        //Con .add añadimos elementos, se permiten duplicados
        miLista.add("Pepe");
        miLista.add("Pepe");
        miLista.add("Juan");
        System.out.println(miLista);
    }

    //------------------------------
    //2. Obtener elementos
    //------------------------------

    public void obtenerElementos(){
        //Con lista.get(i) obtenemos el elemento de la lista
        System.out.println(miLista.get(1));

    }

    //------------------------------
    //3. Eliminar elementos
    //------------------------------

    public void eliminarElementos(){

    }

}

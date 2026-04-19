package colecciones.List.ArrayList;

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
        //Eliminar elementos
        arr.eliminarElementos();
        //Limpiar elementos
        arr.limpiarElementos();
        //Contiene elemento
        arr.contieneElemento();
        //Tamaño lista
        arr.tamañoLista();


    }

    //------------------------------
    //1. Añadir elementos: add
    //------------------------------

    public void añadirElementos(){
        //Con .add añadimos elementos, se permiten duplicados
        miLista.add("Pepe");
        miLista.add("Pepe");
        miLista.add("Juan");

        System.out.println("Hemos añadido los siguientes elementos: ");
        System.out.println(miLista);
        System.out.println();
    }

    //------------------------------
    //2. Obtener elementos: get
    //------------------------------

    public void obtenerElementos(){
        //Con lista.get(i) obtenemos el elemento de la lista
        System.out.println("Obtenemos el elemento 1: ");
        System.out.println(miLista.get(1));
        System.out.println();
    }

    //------------------------------
    //3. Eliminar elementos: remove
    //------------------------------

    public void eliminarElementos(){
        System.out.println("Mi lista actual: ");
        System.out.println(miLista);

        System.out.println("Eliminamos el primer Pepe: ");
        miLista.remove("Pepe");
        System.out.println(miLista);

        System.out.println("Eliminamos el index 0: ");
        miLista.remove(0);
        System.out.println(miLista);
        System.out.println();

    }

    //------------------------------
    //4. Limpiar elementos: clear
    //------------------------------

    public void limpiarElementos(){
        System.out.println("Mi lista actual: ");
        System.out.println(miLista);

        System.out.println("Limpiamos el array: ");
        miLista.clear();
        System.out.println(miLista);
        System.out.println();
    }

    //------------------------------
    //5. ¿Contiene?: Contains
    //------------------------------

    public void contieneElemento(){
        System.out.println("Mi lista actual: ");
        miLista.add("Juan");
        miLista.add("Noelia");
        System.out.println(miLista);

        System.out.println("¿Contiene Noelia?");
        System.out.println(miLista.contains("Noelia"));
        System.out.println();
    }

    //------------------------------
    //6. Tamaño de la lista: size
    //------------------------------

    public void tamañoLista(){
        System.out.println("Mi lista actual: ");
        System.out.println(miLista);

        System.out.println("Tamaño de la lista: ");
        System.out.println(miLista.size());
        System.out.println();
    }
}

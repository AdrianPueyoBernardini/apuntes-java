package colecciones.Set.TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01_Basic {
    //------------------TREESET-------------------
    //*. Orden natura
    //*. NO permite elementos duplicados (es un set)
    //*. No tenemos get, pero tenemos first, last...

    TreeSet miLista = new TreeSet<>();

    public static void main(String[] args) {
        TreeSet01_Basic set = new TreeSet01_Basic();

        //Añadir elementos
        set.añadirElementos();
        //Eliminar elementos
        set.eliminarElementos();
        //Limpiar elementos
        set.limpiarElementos();
        //Contiene elemento
        set.contieneElemento();
        //Tamaño lista
        set.tamañoLista();
        //Obtener elementos
        set.obtenerLista();
    }

    //------------------------------
    //1. Añadir elementos: add
    //------------------------------

    public void añadirElementos(){
        //Con .add añadimos elementos, se permiten duplicados
        miLista.add("Pepe");
        miLista.add("marta");

        System.out.println("Hemos añadido los siguientes elementos: ");
        System.out.println(miLista);
        System.out.println();
    }

    //------------------------------
    //2. Eliminar elementos: remove
    //------------------------------

    public void eliminarElementos(){
        System.out.println("Mi lista actual: ");
        System.out.println(miLista);

        System.out.println("Eliminamos Pepe: ");
        miLista.remove("Pepe");
        System.out.println(miLista);

        System.out.println();

    }

    //------------------------------
    //3. Limpiar elementos: clear
    //------------------------------

    public void limpiarElementos(){
        System.out.println("Mi lista actual: ");
        miLista.add("test");
        System.out.println(miLista);

        System.out.println("Limpiamos el array: ");
        miLista.clear();
        System.out.println(miLista);
        System.out.println();
    }

    //------------------------------
    //4. ¿Contiene?: Contains
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
    //5. Tamaño de la lista: size
    //------------------------------

    public void tamañoLista(){
        System.out.println("Mi lista actual: ");
        System.out.println(miLista);

        System.out.println("Tamaño de la lista: ");
        System.out.println(miLista.size());
        System.out.println();
    }

    //------------------------------
    //6. Obtener first, last: first, last
    //------------------------------

    public void obtenerLista(){
        System.out.println("Primer elemento: ");
        System.out.println(miLista.first());

        System.out.println("Último elemento: ");
        System.out.println(miLista.last());

    }

}

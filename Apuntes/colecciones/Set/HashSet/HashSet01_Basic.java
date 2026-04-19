package colecciones.Set.HashSet;

import java.util.HashSet;

public class HashSet01_Basic {

    //------------------HASHSET-------------------
    //*. Orden impredecible
    //*. NO permite elementos duplicados
    //*. Búsqueda muy rápida con contains
    //*. No existe método get
    //*. Útil cuando no queremos duplicados y necesitamos una búsqueda con contains rápida

    HashSet miLista = new HashSet<>();

    public static void main(String[] args) {

        HashSet01_Basic set = new HashSet01_Basic();

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

}

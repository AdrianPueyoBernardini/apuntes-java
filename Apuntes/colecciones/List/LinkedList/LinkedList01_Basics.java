package colecciones.List.LinkedList;

import java.util.LinkedList;

public class LinkedList01_Basics {
    //------------------LINKEDLIST-------------------
    //*. Mantiene el orden de los elementos conforme su inserción
    //*. Permite elementos duplicados
    //*. Acceso lento, diferencia principal de ArrayList
    //*. Rápido a la hora de insertar elementos intermedios otra diferencia principal de ArrayList

    LinkedList<String> miLista = new LinkedList<>();
    public static void main(String[] args) {

        LinkedList01_Basics li = new LinkedList01_Basics();

        //Añadir elementos
        li.añadirElementos();
        //Obtener elementos
        li.obtenerElementos();
        //Eliminar elementos
        li.eliminarElementos();
        //Limpiar elementos
        li.limpiarElementos();
        //Contiene elemento
        li.contieneElemento();
        //Tamaño lista
        li.tamañoLista();

    }

    //------------------------------
    //1. Añadir elementos: add, addFirst, addLast
    //------------------------------

    public void añadirElementos(){
        //Con .add añadimos elementos, se permiten duplicados
        miLista.add("Pepe");
        miLista.add("Pepe");


        System.out.println("Hemos añadido los siguientes elementos: ");
        System.out.println(miLista);
        System.out.println("Podemos añadir al principio con LinkedList: ");
        miLista.addFirst("Primero");
        System.out.println(miLista);
        System.out.println("Podemos añadir al final con LinkedList: ");
        miLista.addLast("Último");
        System.out.println(miLista);
        System.out.println();
    }

    //------------------------------
    //2. Obtener elementos: get, getFirst, getLast
    //------------------------------

    public void obtenerElementos(){
        //Con lista.get(i) obtenemos el elemento de la lista
        System.out.println("Obtenemos el elemento 1: ");
        System.out.println(miLista.get(1));
        System.out.println("Obtenemos el primer elemento: ");
        System.out.println(miLista.getFirst());
        System.out.println("Obtenemos el último elemento: ");
        System.out.println(miLista.getLast());
        System.out.println();
    }

    //------------------------------
    //3. Eliminar elementos: remove, removeFirst, removeLast
    //------------------------------

    public void eliminarElementos(){
        System.out.println("Mi lista actual: ");
        System.out.println(miLista);

        System.out.println("Eliminamos el primer Pepe: ");
        miLista.remove("Pepe");
        System.out.println(miLista);

        System.out.println("Eliminamos el index 1: ");
        miLista.remove(1);
        System.out.println(miLista);

        System.out.println("Eliminamos el primer elemento: ");
        miLista.removeFirst();
        System.out.println(miLista);

        System.out.println("Eliminamos el último elemento: ");
        miLista.removeLast();
        System.out.println(miLista);


        System.out.println();

    }

    //------------------------------
    //4. Limpiar elementos: clear
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

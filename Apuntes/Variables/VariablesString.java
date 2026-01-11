package Variables;

public class VariablesString {
    public static void main(String[] args) {
        OperacionesString nuevaOperacion = new OperacionesString();
        nuevaOperacion.formatosText();
    }


}
class OperacionesString{

    String miCadena = "hola que tal";

    //-----------------------------------------------------------------
    //Cadena multilinea """
    String miCadena2 = """
            hola
            esto
            una
            multilinea
            """;


    //-----------------------------------------------------------------
    //Fomatos especiales para cadenas
    // \t --> Tabulación
    // \s --> Espacio
    void formatosText(){
        String nombre = "Adri";
        Integer edad = 26;
        String micadena3 = """
            \s-----------------USUARIO-----------------
            \t Nombre: %s
            \t Edad: %d
            \s----------------------------------
            """.formatted(nombre, edad);

        System.out.println(micadena3);
    }


    //-----------------------------------------------------------------
    //.length -> Obtener longitud de una cadena
    void mostrarLongitud() {
        System.out.println(miCadena.length());
    }
    void mostrarLongitudPersonalizado(String cadena) {
        System.out.println(cadena.length());
    }


    //-----------------------------------------------------------------
    //.CharAt -> Obtener el caracter con un índice
    void mostrarPrimerCaracter(String palabra) {
        System.out.println(palabra.charAt(0));
    }


    //-----------------------------------------------------------------
    //.substring, desde donde empieza me da la cadena
    void mostrarSubcadena(String miCadena)
    {
        System.out.println(miCadena.substring(miCadena.length()-2));
    }
    void mostrarSubcadena2(String miCadena2) {
        System.out.println(miCadena2.substring(1,2)); //nos dará todo lo que esté entre la posición 1 y 2
    }


    //-----------------------------------------------------------------
    //Conversión a mayúscula // minúscula
    void convertirMinusculas(String miCadena3) {
        System.out.println(miCadena3.toLowerCase());
    }
    void convertirMayusculas(String miCadena4) {
        System.out.println(miCadena4.toUpperCase());
    }


    //-----------------------------------------------------------------
    //.contains, ¿contiene la palabra?
    void containsText(String texto) {
        System.out.println(texto.contains("hola"));
    }


    //-----------------------------------------------------------------
    //.equals, una cadena es igual a otra?
    void compararCadenas(String str) {
        System.out.println(str.equals("hola"));
    }

    //-----------------------------------------------------------------
    //.replace, reemplazar caracteres
    void replaceString(String str){
        System.out.println(str.replace("a", "$"));
    }

    //-----------------------------------------------------------------
    //.trim eliminar espacios al inicio y final
    void eliminaEspacio(String str){
        System.out.println(str.trim());
    }

    //-----------------------------------------------------------------
    //.indexOf, obtener el PRIMER indice de una subcadena buscada
    // Si no encuentra resultados devuelve -1
    void buscarIndice(String str){
        System.out.println(str.indexOf("hola"));
    }

    //-----------------------------------------------------------------
    //.lastIndexOf, obtener el ÚLTIMO indice de una subcadena buscada
    void buscarUltimoIndice(String str){
        System.out.println(str.lastIndexOf("hola"));
    }

    //-----------------------------------------------------------------
    //contactenaciones de cadenas #1
    void concatenarOpc1(String str1,String str2){
        System.out.println(str1 + " " + str2);
    }

    //-----------------------------------------------------------------
    //.concat, contactenaciones de cadenas #2
    void concatenarOpc2(String str1,String str2){
        System.out.println(str1.concat(str2));
    }

    //-----------------------------------------------------------------
    //.join, contactenaciones de cadenas #3
    void concatenarOpc3(String str1,String str2){
        System.out.println(String.join("*", str1, str2));
    }

    //-----------------------------------------------------------------
    //String.format
    //El %s reemplaza a un elemento tipo string, el %d a un elemento tipo enterio y el %f a un flotante
    void darFormato(String nombre,Integer edad, Double salario ){
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        System.out.println(mensaje);
    }
}

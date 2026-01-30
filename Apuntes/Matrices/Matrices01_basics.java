package Matrices;

public class Matrices01_basics {
    public static void main(String[] args){
        //Las matrices son arreglos de dos dimensiones
        //Puede tener x columnas y x filas por lo que para acceder a cada apartado
        //Tendremos que seleccionar ambas opciones(columna y fila)
        //!!!-> [fila] [columna]
        int[][] myMatrix = new int[5][2];


        //Al igual que con los arrays, también podemos definirlo así:
        var myMatrix2 = new int[5][2];

        //Para simplificar la asignación también podemos hacerlo así:
        var myMatrix3 = new int[][]{
                {100,3,50},  //Las filas
                {10,32,77}  //Las columnas
        };

        //Para asignar valores, igual que en los arrays
        myMatrix[0][0] = 5;
        myMatrix[4][2] = 3;




    }
}

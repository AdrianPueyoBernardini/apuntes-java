package Arrays;

public class Arrays01_Basics {
    public static void main(String[] args) {
        //1. Declaración de array de enteros
        int[] myIntegerArray;

        //2. Asignamos espacio en memoria
        myIntegerArray = new int[5];

        //3. Le damos valores a los indices que queremos
        myIntegerArray[0] = 10;
        myIntegerArray[1] = 7;
        myIntegerArray[2] = 42;
        myIntegerArray[3] = 24;
        myIntegerArray[4] = 100;

        //4. Recorremos array
        for(int i=0; i<=myIntegerArray.length-1; i++){
            System.out.println(myIntegerArray[i]);
        }
    }
}



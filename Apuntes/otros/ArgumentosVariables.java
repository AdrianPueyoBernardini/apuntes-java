package otros;

public class ArgumentosVariables {
    public static void main(String[] args) {
        //Los argumentos variables nos permiten introducir tantos valores como necesitemos
        imprimeNumero(1,2,3,4,5,2,3,2);
    }
    public static void imprimeNumero(int... num) {
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

    }
}

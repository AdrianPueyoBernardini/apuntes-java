package operadores;

public class OperadoresDeAsignacion {
    public static void main(String[] args) {
        OperadoresDeAsig newOperador = new OperadoresDeAsig();
        newOperador.asignacionResultado();
    }
}

class OperadoresDeAsig{

    int a = 1;
    int b = 4;

    void asignacionResultado(){
        System.out.println("El resultado de a+=5 es: ");
        System.out.println(a += 5);
        System.out.println("El resultado de b-=2 es: ");
        System.out.println(b -= 2);
    }
}

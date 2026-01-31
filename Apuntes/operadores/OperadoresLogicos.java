package operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

    }
}

class OperadoresLog{
    boolean a = true;
    boolean b = false;

    //AND --> SOLO ES TRUE SI HAY DOS TRUE
    void mostrarOperadorLogico1(){
        System.out.println("El resultado del operador (AND) true && true es: ");
        System.out.println(a && a);
    }
    void mostrarOperadorLogico2(){
        System.out.println("El resultado del operador (AND) false && false es: ");
        System.out.println(b && b);
    }
    void mostrarOperadorLogico3(){
        System.out.println("El resultado del operador (AND) true && false es: ");
        System.out.println(a && b);
    }
    void mostrarOperadorLogico4(){
        System.out.println("El resultado del operador (AND) false && true es: ");
        System.out.println(b && a);
    }

    //OR --> SI HAY UN TRUE ES TRUE
    void mostrarOperadorLogico5(){
        System.out.println("El resultado del operador (OR) true || true es: ");
        System.out.println(a || a);
    }
    void mostrarOperadorLogico6(){
        System.out.println("El resultado del operador (OR) false || false es: ");
        System.out.println(b || b);
    }
    void mostrarOperadorLogico7(){
        System.out.println("El resultado del operador (OR) true || false es: ");
        System.out.println(a || b);
    }
    void mostrarOperadorLogico8(){
        System.out.println("El resultado del operador (OR) false || true es: ");
        System.out.println(b || a);
    }

    //NOT --> LO CONTRARIO
    void mostrarOperadorLogico9(){
        System.out.println("El resultado del operador (NOT) !true es: ");
        System.out.println(!a);
    }
}

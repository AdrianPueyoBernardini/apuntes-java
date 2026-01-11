package Condicionales;

public class Condicionales01_Basics {
    public static void main(String[] args){
        OpereacionesCondicionales op = new OpereacionesCondicionales();
        op.estructuraBasica2(19);
    }
}

class OpereacionesCondicionales{

    void estructuraBasica(Integer edad){
        if(edad>=18){
            System.out.println("Eres mayor de edad, puedes pasar");
        }else{
            System.out.println("Eres menor...");
        }
    }

    void estructuraBasica2(Integer edad){
        if(edad>=13 && edad<=18){
            System.out.println("Eres adolescente...");
        }else if(edad>18){
            System.out.println("Eres adulto!!");
        }else{
            System.out.println("Eres enano...");
        }
    }
}
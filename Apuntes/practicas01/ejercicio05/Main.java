package practicas01.ejercicio05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int totalAlumnos=3;
        Alumno[] listaAlumnos = new Alumno[totalAlumnos];
        Scanner sc = new Scanner(System.in);
        double totalNotas=0;

        for(int i=0;i<=totalAlumnos-1;i++){

            System.out.println("Indícame el nombre del alumno " + (i+1));
            var nombreAlumno= sc.nextLine();

            System.out.println("Indícame la nota del alumno " + (i+1));
            var notaAlumno = Float.parseFloat(sc.nextLine());

            System.out.println("Indícame la edad del alumno " + (i+1));
            var edadAlumno = Integer.parseInt(sc.nextLine());

            Alumno alumno = new Alumno(nombreAlumno, edadAlumno);
            alumno.setNota(notaAlumno);

            totalNotas +=notaAlumno;

            listaAlumnos[i] = alumno;



        }



        //SACAR MEDIAS
        var media = totalNotas/totalAlumnos;
        System.out.println(media);

        //IMPRIMIR ALUMNOS
        for(int i=0; i<listaAlumnos.length;i++){
            System.out.println(listaAlumnos[i].toString());

            if(listaAlumnos[i].getNota()>media){
                System.out.println("¡" + listaAlumnos[i].getNombre() + " está por encima de la media!");
            }
        }

        //PEOR ALUMNO
        Alumno peorAlumno = listaAlumnos[0];

        for(int i=0; i<listaAlumnos.length;i++){
            if(listaAlumnos[i].getNota()<peorAlumno.getNota()){
                peorAlumno = listaAlumnos[i];
            }
        }
        System.out.println("El peor alumno essss: \n" + peorAlumno.toString());

    }
}

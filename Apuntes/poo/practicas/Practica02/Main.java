package poo.practicas.Practica02;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] misVehiculos = {
                new Coche(true,4,"Ferrari","Blanco", "alicia",2025,"ADASDA241", "automatica","Gasolina",200),
                new Coche(true,4, "BMW","Verde","adrian",2026, "JFUSJFJ332", "manual","Gasolina",120),
                new Bicicleta(true,2, "Luan", "Rojo","pedro", 2020, true, 3, 5),
                new Motocicleta(true,2, "Honda","Azul","lucia",2006, "FJFKF000", "Gasolina", 100),
                new Vehiculo(true,4,"Audi","Negro","juan",2026)
        };

        for(int i=0; i<misVehiculos.length;i++){
            System.out.println(misVehiculos[i].toString());
        }
    }
}

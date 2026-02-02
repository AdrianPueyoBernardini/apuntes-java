package practicas01.ejercicio03;
import java.util.Scanner;

public class CuentaCorriente {
    private int numCuenta;
    private double saldo;

    public CuentaCorriente(int numCuenta, double saldo){
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    //Establezco los get y set, por buenas praxis
    public int getNumCuenta(){
        return numCuenta;
    }
    public void setNumCuenta(int numCuenta){
        this.numCuenta = numCuenta;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //Métodos:
    public void ingresaEfectivo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuanto efectivo deseas introducir?: ");
        saldo += Integer.parseInt(sc.nextLine());

        System.out.println("Ahora mismo tienes: " + saldo);

    }
    //He creado un metodo extra, por si no solo queremos agregarlo vía teclado.
    public void ingresaEfectivo2(double cantidad){
        saldo +=cantidad;
        System.out.println("Ahora mismo tienes: " + saldo);

    }
    public boolean retiraEfectivo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuanto efectivo deseas retirar?: ");
        var dineroRetirado = Double.parseDouble(sc.nextLine());
        if(saldo<dineroRetirado){
            System.out.println("¡Ey! No tienes tanto dinero en la cuenta");
            return false;
        }else{
            saldo -=dineroRetirado;
            System.out.println("Dinero retirado! Ahora tienes: " + saldo);
            return true;
        }
    }

    public void visualiza(){
        var mensaje = String.format("""
                ----------BIENVENIDO AL PERFIL DE TU CUENTA----------
                \t Numero de cuenta: %d
                \t Saldo: %.2f
                ---------------------------------------------------------
                """,numCuenta, saldo);

        System.out.println(mensaje);
    }


}

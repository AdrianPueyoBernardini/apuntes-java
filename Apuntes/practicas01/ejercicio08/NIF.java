package practicas01.ejercicio08;

public class NIF {
    private String parteNumerica;
    private int num;
    private char letraFinal, letraInicial;

    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public NIF(String cadena) {
        cadena = cadena.toUpperCase();

        letraInicial = '#';
        letraFinal = '0';
        parteNumerica = "00000000";
        num = 0;

        if (cadena.length() == 0) return;

        int inicioNumeros = 0;

        // LETRA INICIAL??
        if (Character.isLetter(cadena.charAt(0))) {
            letraInicial = cadena.charAt(0);
            inicioNumeros = 1;
        }

        // ULTIMO CARACTER ES LETRA??
        char ultimo = cadena.charAt(cadena.length() - 1);
        if (Character.isLetter(ultimo)) {
            letraFinal = ultimo;
            cadena = cadena.substring(0, cadena.length() - 1);
        }


        String numeros = cadena.substring(inicioNumeros);


        if (!numeros.matches("\\d+")) {
            resetear();
            return;
        }

        // Conversión
        if (letraInicial == 'X') numeros = "0" + numeros;
        else if (letraInicial == 'Y') numeros = "1" + numeros;
        else if (letraInicial == 'Z') numeros = "2" + numeros;
        else if (letraInicial != '#') {
            resetear();
            return;
        }

        num = Integer.parseInt(numeros);
        parteNumerica = String.format("%08d", num);

        // Si no hay letra final, se calcula
        if (letraFinal == '0') {
            letraFinal = LETRAS.charAt(num % 23);
        }
    }


    public NIF(int num) {
        this.num = num;
        this.letraInicial = '#';
        this.parteNumerica = String.format("%08d", num);
        this.letraFinal = LETRAS.charAt(num % 23);
    }

    private void resetear() {
        letraInicial = '#';
        letraFinal = '0';
        parteNumerica = "00000000";
        num = 0;
    }


    public boolean dniCorrecto() {
        char calculada = LETRAS.charAt(num % 23);
        return calculada == letraFinal;
    }

    @Override
    public String toString() {
        if (letraInicial == '#') {
            return "DNI " + parteNumerica + "-" + letraFinal;
        } else {
            return "NIE " + letraInicial + parteNumerica.substring(1) + "-" + letraFinal;
        }
    }
}


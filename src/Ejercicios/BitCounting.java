package Ejercicios;


public class BitCounting {

    public static int countBits(int n) {


        int cociente = 0;
        int bits = 0;

        // Corverción de suma a binario.
        do {
            if (cociente == 0) {

                /* El proposito de sumar el residuo de la división es como
                el binario solo consta de 0 o 1 si sumamos el residuo
                solo nos debera de dar el número de bits
                que contenga el número entero. */

                bits += n % 2;
                cociente = n / 2;
            } else {
                bits += cociente % 2;
                cociente /= 2;
            }
        } while (cociente != 0);

        return bits;
    }

}

package Ejercicios;

/* Descripción:

Escriba una función que tome un entero como entrada, y devuelve el número de bits que son iguales
a uno en la representación binaria de ese número. Puede garantizar que la entrada no es negativa.

Ejemplo: La representación binaria de 1234 Es 10011010010,
por lo que la función debe volver 5 En este caso
 */

public class BitCounting {

    public static int countBits(int n) {

        // Evitar que ingresen un numero entero negativo
        if(n<0){
            throw new IllegalArgumentException("El método countBits solo acepta números enteros no negativos (n >= 0). Valor ingresado: " + n);
        }

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

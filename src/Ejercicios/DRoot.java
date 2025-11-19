package Ejercicios;

/* La raíz digital es la suma recursiva de todos los dígitos en un número.

Dado n, tomar la suma de los dígitos de n. Si ese valor tiene más de un dígito,
continúe reduciendo de esta manera hasta que se produzca un número de un solo dígito.
La entrada será un número entero no negativo.

16  -->  1 + 6 = 7
942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

*/

import java.util.Arrays;

public class DRoot {

    public static int digital_root(int n) {

        // 1. Caso Base Mayor: Si el número ya es un solo dígito (0-9), retornarlo.
        // Esto detiene el proceso principal.
        if (n < 10) {
            return n;
        }

        // 2. Paso Recursivo 1 (Suma de Dígitos):
        // El dígito actual (n % 10) + la raíz digital del resto del número (n / 10).
        int sumaDeDigitos = n % 10 + digital_root(n / 10);

        // 3. Paso Recursivo 2 (Proceso Repetitivo):
        // Si la suma de dígitos es mayor a 9, se vuelve a calcular su raíz digital.
        return digital_root(sumaDeDigitos);
    }

}

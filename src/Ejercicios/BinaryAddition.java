package Ejercicios;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/* Implementar una función que agrega dos números y devuelve su suma en binario.
La conversión se puede hacer antes o después de la adición.

El número binario devuelto debe ser una cadena.*/

/* output:

1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)

*/
public class BinaryAddition {
    public static String binaryAddition(int a, int b){

        int suma = a+b;


        int cociente = 0;

        // Creación de lista para guardar el residuo de la división.
        List<String> binary = new ArrayList<>();

        // Corverción de suma a binario.
        do {
            if(cociente == 0){
                binary.add(String.valueOf(suma%2));
                cociente = suma/2;
            }else{
                binary.add(String.valueOf(cociente%2));
                cociente /= 2;
            }
        }while(cociente != 0);

        // invertimos los elementos de la lista.
        Collections.reverse(binary);

        /* Utiliza String.join(delimitador, elementos) para unir todos los elementos del
        iterable (array/lista) en una sola cadena. El delimitador se inserta automáticamente
        entre cada elemento. */

        return String.join("",binary);
    }
}

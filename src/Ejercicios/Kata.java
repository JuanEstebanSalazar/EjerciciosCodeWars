package Ejercicios;

public class Kata {

    /* Devuelve una matriz, donde el primer elemento es el recuento de
    números positivos y el segundo elemento es una suma de números negativos.
    0 no es ni positivo ni negativo.

    Si la entrada es una matriz vacía o es nula, devuelve una matriz vacía.

    Ejemplo:

    Para la entrada [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15]

    Deberías volver [10, -65]. */

    public static int[] countPositivesSumNegatives(int[] input)
    {

        // Asignamos un caso de uso cuando el array sea nulo.
        if (input == null || input.length == 0){
            return new int[0];
        }

        // Creamos una array de dos posiciones para guardar los resultados.
        int [] array = new int[2];

        // Iteramos cada uno de los elementos y calculamos los resultados.
        for(int inputs:input){

            if(inputs>0){
              array[0] += 1;
            }else if(inputs != 0){
                array[1] += inputs;
            }
        }

        return array;
    }
}

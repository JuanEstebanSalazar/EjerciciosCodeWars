package Ejercicios;

/* Simple, dada una cadena de palabras, devuelve la longitud de la(s) palabra(s) más corta(s).

La cadena nunca estará vacía y no es necesario tener en cuenta los diferentes tipos de datos. */

public class FindShort {

    public static int findShort(String s) {

        // Obtenemos cad una de las palabras de la oración por medio del delimitador (" ").
        String [] ArrayWord = s.split(" ");

        // Inicializamos la variable con la longitud de la primera palabra.
        int minWord = ArrayWord[0].length();

        for (String ArrayWords: ArrayWord){

            // Verificamos cuál es la longitud de la palabra con menos caracteres.
            if(minWord > ArrayWords.length()){
                minWord = ArrayWords.length();
            }

        }

        return minWord;
    }

}

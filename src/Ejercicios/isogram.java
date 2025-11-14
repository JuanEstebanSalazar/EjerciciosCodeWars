package Ejercicios;

import java.util.Arrays;

/* Un isograma es una palabra que no tiene letras repetidas, consecutivas o no
consecutivas. Implementar una función que determina si una cadena que contiene solo
letras es un isograma. Supongamos que la cadena vacía es un isograma.
Ignore el caso de la carta. */

public class isogram {
    public static boolean  isIsogram(String str) {

        // Verificamos que el String contenga por lo menos 2 caracteres.
        if(str.length() <= 1){
            return true;
        }

       // almacenamos el String en un array y volvemos las letras minusculas.
       char [] newText = str.toLowerCase().toCharArray();

       // Organizamos las letras alfabeticamente.
       Arrays.sort(newText);

       // iteramos el Array de caracteres.
       for(int i = 0; i < newText.length ; i++){

           /* Itera a través de los elementos del array, comparando cada elemento actual con el
           siguiente para detectar duplicados adyacentes. */
           for(int j = i+1; j< newText.length; j++){

               // Verificamos si hay una letra repetida.
               if(newText[i] == newText[j]){
                   return false;
               }
           }
       }

       return true;

    }
}

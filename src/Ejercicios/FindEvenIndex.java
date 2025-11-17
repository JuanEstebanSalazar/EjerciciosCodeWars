package Ejercicios;

/* Se le dará una variedad de números enteros. Su trabajo es tomar esa matriz y
encontrar un índice N donde la suma de los números enteros a la izquierda de N es igual a
la suma de los enteros a la derecha de N.

Si no hay ningún índice que haga que esto suceda, ¡retorno -1.

Por ejemplo:

Digamos que se te da la matriz {1,2,3,4,3,2,1}:

Su función devolverá el índice 3, porque la suma del lado izquierdo del índice ({1,2,3}) y
la suma del lado derecho del índice ({3,2,1}) ambos iguales 6.

Miremos a otro.

Se le da la matriz {1,100,50,-51,1,1}:
Su función devolverá el índice 1, porque la suma del lado izquierdo del índice ({1})
y la suma del lado derecho del índice ({50,-51,1,1}) ambos iguales 1.

El último:
Se le da la matriz {20,10,-80,10,10,15,35}
En el índice 0 el lado izquierdo es {}
El lado derecho es {10,-80,10,10,15,35}
Ambos son iguales a 0Cuando se añade. (Las matrices vacías son iguales a 0 en este problema)
Índice 0 es el lugar donde el lado izquierdo y el lado derecho son iguales.

Nota: Recuerde que en la mayoría de los idiomas el índice de una matriz comienza en 0.
Ingresos

Una matriz entera de longitud 0 < arr < 1000. Los números en la matriz pueden ser cualquier
número entero positivo o negativo.

Salida

El índice más bajo NDonde el lado a la izquierda de NEs igual al lado del derecho de N.
Si no encuentra un índice que se ajuste a estas reglas, volverá -1.

Nota

Si se le da una matriz con múltiples respuestas, devuelva el índice correcto más bajo. */

import java.util.Arrays;

public class FindEvenIndex {

    public static int findEvenIndex(int[] arr) {

        for (int i = 0; i< arr.length ; i++){

            int sumArrayleft = 0;
            int sumArrayright = 0;

            // obtenemos el subArray izquierdo y derecho para hacer la suma.
            int [] arrayleft = Arrays.copyOfRange(arr,(i+1),(arr.length));
            int [] arrayRight = Arrays.copyOfRange(arr,(0),i);

            // Hacemos la suma de los elementos de la izquierda.
            for (int newArrayleft: arrayleft){
                sumArrayleft += newArrayleft;
            }

            // Hacemos la suma de los elementos de la derecha.
            for (int newArrayRight: arrayRight){
                sumArrayright += newArrayRight;
            }

            //Comparamos
            if(sumArrayright == sumArrayleft){
                return i;
            }

        }

        // si no se encuentra considencias entre las sumas se retorna -1.
        return -1;
    }

}

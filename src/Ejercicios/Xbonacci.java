package Ejercicios;

/* Bueno, se reunió con el hermano mayor de Fibonacci, también conocido como Tribonacci.

Como el nombre ya puede revelar, funciona básicamente como un Fibonacci, pero sumando los últimos 3
(en lugar de 2) números de la secuencia para generar el siguiente. Y, lo que es peor,
lamentablemente no podré escuchar a hablantes no nativos de italiano tratando de pronunciarlo :(

Entonces, si vamos a comenzar nuestra secuencia de Tribonacci con [1, 1, 1]Como entrada inicial
(también conocida como firma), tenemos esta secuencia:

Output:

[0, 0, 1, 1, 2, 4, 7, 13, 24, ...]

Bueno, es posible que ya lo haya adivinado, pero para ser claros: necesita crear una función de
fibonacci que, dada una matriz / lista de firmas, devuelve los primeros n elementos: la firma
incluida de la secuencia así sembrada.

La firma siempre contendrá 3 números; n siempre será un número no negativo; si n == 0,
a continuación, devolver una matriz vacía (excepto en C return NULL) y estar listo para
cualquier otra cosa que no esté claramente especificada ;)

*/


public class Xbonacci {

    public double [] tribonacci(double[] s, int n) {

        // Obtenemos la longitud del Array.
        double [] newArray = new double[n];

        for(int i = 0; i<n ;i++){

            // Primer caso de uso de almacenamiento de los primeros tres elementos.
            if(i<3){
                newArray[i] = s[i];
            }else{
                // Suma de los ultimos tres elementos.
                newArray[i] = (newArray[i-1] + newArray[i-2] + newArray[i-3]);
            }
        }

       return newArray;
    }
}

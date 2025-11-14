package Ejercicios;

/* ¡Los trolls están atacando tu sección de comentarios!

Una forma común de lidiar con esta situación es eliminar todas las vocales de los comentarios de los trolls,
neutralizando la amenaza.

Su tarea es escribir una función que toma una cadena y devolver una nueva cadena con todas las vocales
eliminadas.

Por ejemplo, la cadena "This website is for losers LOL!" Se convertiría en
"Ths wbst s fr lsrs LL!".

Nota: para este kata y No se considera una vocal.

*/

public class Troll {

    public static String disemvowel(String str) {

        /* Se remplaza las vocales por espacios en blanco sin importar
         mayusculas o minusculas esto lo hacemos mediente expresiones Regulares (Regex) */

        return str.replaceAll("(?i)[aeiou]","");
    }

}

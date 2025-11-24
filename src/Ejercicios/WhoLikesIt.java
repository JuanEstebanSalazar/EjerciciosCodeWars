package Ejercicios;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/* Probablemente, conozcas el sistema de "me gusta" de Facebook y otras páginas.
A la gente le pueden "gustar" publicaciones de blog, fotos u otros artículos.
Queremos crear el texto que debe mostrarse junto a dicho elemento.

Implemente la función que toma una matriz que contiene los nombres de personas que les gusta un elemento.
Debe devolver el texto de visualización como se muestra en los ejemplos:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

Nota: Para 4 o más nombres, el número en "and 2 others"Simplemente aumenta. */

public class WhoLikesIt {

    public static String whoLikesIt(String... names) {

        int cantNames  = names.length;

        /* Convertimos los argumentos en una estructura de datos Stream para
        después poder utilizar sus operaciones. */
        Stream<String> flujoDeNombres = Arrays.stream(names);

        // En caso que no halla ningún argumento devolverá el String.
        String Text = "no one likes this";

        /* Se utiliza operaciones del Stream y se limita la cantidad de los nombres según el caso
        y se van separando por comas. */
        if(cantNames >=4){
            Text =  (flujoDeNombres.limit(2).collect(Collectors.joining(", ")) +" and "+ (cantNames-2) + " others like this");
        }else if(cantNames > 0){

            if (cantNames == 1) {
                Text = (String.join(", ", names) + " likes this");
            }else{
                long limite = cantNames == 2?1:2;

                /* en este caso como se llama dos veces la misma estructura se debe de crear un nuevo
                Arrays.stream(names), ya que flujoDeNombres cuando se utiliza un Collectors
                inmediatamente se cierra la estructura de datos y no se puede volver a utilizar */
                Text = (flujoDeNombres.limit(limite).collect(Collectors.joining(", "))+" and "
                        +Arrays.stream(names).skip((cantNames -1)).collect(Collectors.joining(" ,"))
                        +" like this");
            }
        }

        return Text;
    }
}

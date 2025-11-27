package Ejercicios;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/* La idea principal es contar todos los caracteres que se producen en una cadena.
Si tienes una cuerda como aba, entonces el resultado debe ser {'a': 2, 'b': 1}.

¿Y si la cadena está vacía? Entonces el resultado debe ser objeto vacío literal, {}. */

public class CountCharacters {
    public static Map<Character, Integer> count(String str) {

        /* 1) Convertimos las letras del String a Unicode.
           2) Covertimos los valores Unicode a caracteres mediante el MapToObj.
           3) Hacemos una colección de datos los agrupamos con el Collectors.groupingBy
           4) Con el collectingAndThenm convertimos el dato Long que arroja
           Collectors.counting() a Integer.
           5) El Function.identity() nos sirvio como criterio de agrupación que en este caso
           es si por medio del caracter (si hay un caracter repetido agrúpalo).
         */

        return str.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(),Collectors.
                        collectingAndThen(Collectors.counting(),Long::intValue)));

    }
}

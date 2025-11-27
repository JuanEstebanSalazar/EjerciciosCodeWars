package Ejercicios;

/* Escribir una función con nombre first_non_repeating_letter† que toma una entrada de cadena y
devuelve el primer carácter que no se repite en ninguna parte de la cadena.

Por ejemplo, si se da la entrada 'stress', la función debe volver 't', puesto que la
letra t solo se produce una vez en la cadena, y se produce primero en la cadena.

Como desafío adicional, las letras mayúsculas y minúsculas se consideran el mismo carácter,
pero la función debería devolver el caso correcto para la letra inicial. Por ejemplo, la entrada
'sTreSS'Debería regresar 'T'.

Si una cadena contiene todos los caracteres repetidos, debería devolver una cadena vacía ("");

† Nota: la función se llama firstNonRepeatingLetterPor razones históricas, pero su función debe
manejar cualquier carácter Unicode. */



public class FirstNonRepeatingLetter {
    public static String firstNonRepeatingLetter(String s){

        //  Verificando que no halla un String vació para evitar errores.
        if(s.isEmpty()){
            return "";
        }

        // Desglosamos el String en un Array de caracteres.
        char [] caracteres = s.toCharArray();
        String letra = String.valueOf(caracteres[0]);

        // Asignamos una variable bandera para saber que letra no se repite
        boolean unico = false;

        // Iteramos cada letra
        for (int i = 0; i< caracteres.length;i++){

                for (int j = 0; j<caracteres.length;j++){

                    // Hacemos la verificación de duplicidad
                    if(letra.equalsIgnoreCase(String.valueOf(caracteres[j])) && j != i){

                        /* si la letra está duplicada asignamos la siguiente y
                        /tenemos en cuenta el tamaño del Array. */
                        letra = String.valueOf(caracteres[(caracteres.length > i+1?i+1:i)]);
                        unico = false;

                        // Paramos el Array para que no siga iterando.
                        break;
                    }
                    unico = true;
                }

                // Si la variable bandera es verdadera significa que hay una letra que no se repite.
                if(unico){
                    return letra;
                }

        }

        // Si no se encuentra ninguna letra que no esté duplicada se retorna vació.
        return "" ;
    }
}

package Ejercicios;

/* Por lo general, cuando compra algo, se le pregunta si su número de tarjeta de crédito,
número de teléfono o respuesta a su pregunta más secreta sigue siendo correcto.

Sin embargo, como alguien podría mirar por encima de tu hombro, no quieres que se muestre en
tu pantalla. En cambio, lo enmascaramos.

Su tarea es escribir una función maskify, que cambia todos excepto
los últimos cuatro caracteres en '#'. */

public class Maskify {

    public static String maskify(String str) {


        if(str.length()<4){
            return str;
        }else {
            /* Obtenemos la longitud del String y reducimos la
            cantidad de cuatro, ya que es la información que vamos a visualizar en pantalla. */
            int longitudTexto = (str.length()) - 4;

            /* Utilizamos el metodo repeat para obtener la cantidad de
            "#" restantes para completar la logitud del String. */
            String newStr = "#".repeat(longitudTexto);

            // obtenemos los ultimos 4 digitos y lo concatenamos con el resto del String.
            return newStr.concat(str.substring(longitudTexto));
        }
    }
}

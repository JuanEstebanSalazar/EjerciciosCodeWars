package Ejercicios;
import java.util.Arrays;
import java.util.Map;

/*
Nombre: Pete, the baker.

A Pete le gusta hornear unos pasteles. Tiene algunas recetas e ingredientes. Desafortunadamente,
no es bueno en matemáticas. ¿Puedes ayudarle a averiguar, cuántos pasteles podría hornear
teniendo en cuenta sus recetas?

Escribir una función cakes(), que toma la receta (objeto) y los ingredientes disponibles (también un objeto)
y devuelve el número máximo de pasteles que Pete puede hornear (enterero). Por simplicidad,
no hay unidades para las cantidades (por ejemplo, 1 lb de harina o 200 g de azúcar son simplemente 1 o 200).
Los ingredientes que no están presentes en los objetos, pueden considerarse como 0.

Ejemplos:

must return 2
cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200});

must return 0
cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000});
*/

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {

        int [] capacidadPorInsumo = new int[recipe.size()];
        int iterador = 0;

        // Recorremos el mapa de ingredientes.
        for(Map.Entry<String, Integer> entrada : recipe.entrySet()){

            // Verificamos si todos los ingredientes se encuentran respecto a la receta.
            if(available.containsKey(entrada.getKey())){
                    // Calcula la cantidad de pasteles posibles según el stock de este ingrediente y lo almacena en el array.
                    capacidadPorInsumo[iterador] = available.get(entrada.getKey()) /entrada.getValue();
                    iterador++;
            }else{
                // Si algún ingrediente no lo tenemos retornamos 0.
                return 0;
            }
        }
        // Retornamos el elemento menor de array, si el array esta vació retorna 0.
        return Arrays.stream(capacidadPorInsumo).min().orElse(0);
    }
}

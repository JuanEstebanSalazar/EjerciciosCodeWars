package Ejercicios;

/* Escriba una función, que toma un entero no negativo (segundos) como entrada y devuelve el tiempo en
un formato legible por humanos (HH:MM:SS)

    HH= horas, acolchado a 2 dígitos, rango: 00 - 99
    MM= minutos, acolchado a 2 dígitos, rango: 00 - 59
    SS= segundos, acolchado a 2 dígitos, rango: 00 - 59

El tiempo máximo nunca supera los 359999 (99:59:59)

Puede encontrar algunos ejemplos en los accesorios de prueba. */



public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        // Converción de Segundos a (Horas/Minutos/Segundos)
        if(seconds > 0){
            segundos = seconds%60;
            minutos = (seconds/60)%60;
            horas = seconds/60/60;
        }

        /* Hacemos un padding de ceros por medio de un formato %02d
        (% = Variable, 0 = es el número de relleno, 2 = el número de digitos, d = indica que debe recibir un entero decimal)  */
        return String.format("%02d", horas)+":"+String.format("%02d", minutos)+":"+String.format("%02d", segundos);
    }
}

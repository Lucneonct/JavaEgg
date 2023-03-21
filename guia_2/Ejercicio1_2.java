package guia_2;

/**
 * Crear un proyecto de Java y definir al menos 6 variables
 * en tu IDE de distintos tipos de datos.
 */

/**
 * ¿Recuerdas las variables que creaste en el ejercicio anterior? Ahora deberás
 * asignarles un valor.
 */

public class Ejercicio1_2 {
  public static void main(String[] args) {
    byte max127 = 127;
    short max32767 = 32767;
    int entero = 2147483647;
    long max9223372036854775807 = 9223372036854775807l; // Finaliza con l
    char caracter = 'a'; // Usa comillas simples
    String texto = "¡Hola Mundo!"; // Usa comillas dobles
    double real = 3.1415;
    float coma = 3.1415f; // Finaliza con f
    boolean logico = true;

    /**
     * Mostrar en consola los resultados
     */
    System.out.println(max127);
    System.out.println(max32767);
    System.out.println(entero);
    System.out.println(max9223372036854775807);
    System.out.println(caracter);
    System.out.println(texto);
    System.out.println(real);
    System.out.println(coma);
    System.out.println(logico);
  }
}

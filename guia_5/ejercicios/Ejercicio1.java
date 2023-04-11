package guia_5.ejercicios;

/**
 * Realizar un algoritmo que llene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    int[] numeros = new int[100];

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = i;
    }

    for (int i = numeros.length - 1; i >= 0; i--) {
      System.out.println(numeros[i]);
    }
  }
}

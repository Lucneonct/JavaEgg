package guia_5.ejercicios;

import java.util.Scanner;

import comunes.Comunes;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.print("Ingrese el número de vectores: ");
    int longitud = leer.nextInt();

    int[] vector = new int[longitud];
    Comunes.rellenarVectorAleatorio(vector, 99999);

    int[] contador = {0, 0, 0, 0, 0};

    for (int i = 0; i < longitud; i++) {
      for (int j = 0; j < contador.length; j++) {
        if ((vector[i] / Math.pow(10, j)) < 10) {
          contador[j]++;
          break;
        }
      }
    }

    System.out.println("Recuénto de números:");
    for (int i = 0; i < contador.length; i++) {
      System.out.println((i + 1) + " cifras: " + contador[i]);
    }

    leer.close();
  }
}

package guia_3;

import java.util.Scanner;

/**
 * Escriba un programa que valide si una nota está entre 0 y 10,
 * sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */

public class Ejercicio8 {
  public static void main(String[] args) {
    int nota;
    Scanner leer = new Scanner(System.in);

    System.out.println("Ingresa una nota del el 1 al 10");
    do {
      nota = leer.nextInt();
      if(nota > 10 || nota < 1) {
        System.out.print("Error, número fuera de rango: ");
      }
    } while(nota > 10 || nota < 1);

    leer.close();
  }
}

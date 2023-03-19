package guia_3;

import java.util.Scanner;

/**
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
 * el número ingresado seguido de tantos asteriscos como indique su valor. Por
 * ejemplo:
 * 5 *****
 * 3 ***
 * 11 ***********
 * 2 **
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    int numero;

    Scanner leer = new Scanner(System.in);

    for (int i = 0; i < 4; i++) {
      System.out.print("\nIngrese un número entre 1 y 20: ");
      numero = leer.nextInt();

      if(numero >= 1 && numero <= 20) {
        System.out.print(numero + " ");
        
        for (int j = 0; j < numero; j++) {
          System.out.print("*");
        }
      }
    }

    leer.close();
  }
}

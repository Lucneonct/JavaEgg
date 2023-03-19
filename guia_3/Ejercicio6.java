package guia_3;

import java.util.Scanner;

/**
 * Implementar un programa que le pida dos números enteros al usuario y
 * determine si ambos o alguno de ellos es mayor a 25.
 */

public class Ejercicio6 {
  public static void main(String[] args) {
    int num1, num2;

    Scanner input = new Scanner(System.in);

    System.out.println("Primer numero:");
    num1 = input.nextInt();

    System.out.println("Segundo numero:");
    num2 = input.nextInt();

    /**
     * Muestra el resultado de 4 posibles maneras:
     * 
     * 1. Si ambos son mayores a 25
     * 2. Si solo el primero es mayor a 25
     * 3. Si solo el segundo es mayor a 25
     * 4. Si ninguno es mayor a 25
     */
    if (num1 > 25 && num2 > 25) {
      System.out.println("Ambos son mayores a 25");
    } else if (num1 > 25) {
      System.out.println("El numero " + num1 + " es mayor a 25");
    } else if (num2 > 25) {
      System.out.println("El numero " + num2 + " es mayor a 25");
    } else {
      System.out.println("Ninguno es mayor a 25");
    }

    input.close();
  }
}

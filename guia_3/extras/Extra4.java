package guia_3.extras;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
 * muestre su equivalente en romano.
 */

public class Extra4 {
  public static void main(String[] args) {
    int numero;
    String romano;

    Scanner leer = new Scanner(System.in);

    System.out.print("Ingrese un número del 1 al 10: ");
    numero = leer.nextInt();

    if (numero <= 10 && numero >= 1) {
      switch (numero) {
        case 1:
          romano = "I";
          break;
        case 2:
          romano = "II";
          break;
        case 3:
          romano = "III";
          break;
        case 4:
          romano = "IV";
          break;
        case 5:
          romano = "V";
          break;
        case 6:
          romano = "VI";
          break;
        case 7:
          romano = "VII";
          break;
        case 8:
          romano = "VIII";
          break;
        case 9:
          romano = "IX";
          break;
        default:
          romano = "X";
          break;
      }

      System.out.println("El número " + numero + " en romano es: \"" + romano + "\"");
    } else {
      System.out.println("Fuera de rango");
    }

    leer.close();
  }
}

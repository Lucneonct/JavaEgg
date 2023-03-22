package guia_4.ejercicios;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void).
 * 
 * El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 € 
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    String opcion;
    double euros;

    Scanner leer = new Scanner(System.in);

    System.out.print("Cantidad de euros a convertir: $");
    euros = leer.nextDouble();

    System.out.println("\nConvertir a:");
    System.out.println("a. Libra");
    System.out.println("b. Dólares");
    System.out.println("c. Yenes");

    System.out.print("Opción: ");
    opcion = leer.next();
    
    System.out.println(euros + " euros equivalen a " + convertir(euros, opcion));;

    leer.close();
  }

  public static String convertir(double euros, String opcion) {
    String conversion;

    switch (opcion.toLowerCase()) {
      case "a": // Libras = 0.86
        conversion = (euros * 0.86) + " libras";
        break;
      case "b": // Dolares = 1.28611
        conversion = (euros * 1.28611) + " dólares";
        break;
      case "c": // Yenes = 129.852
        conversion = (euros * 129.852) + " yenes";
        break;
      default:
        System.out.println("¡Error! Opción no válida, conversión sin cambios.");
        conversion = (euros) + " euros";
        break;
    }

    return conversion;
  }
}

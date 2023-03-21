package guia_3.extras;

import java.util.Scanner;

/**
 * Una obra social tiene tres clases de socios:
 * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento
 * en todos los tipos de tratamientos.
 * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
 * para los mismos tratamientos que los socios del tipo A.
 * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
 * dichos tratamientos.
 * Solicite una letra (carácter) que representa la clase de un socio, y luego un
 * valor real que represente el costo del tratamiento (previo al descuento) y
 * determine el importe en efectivo a pagar por dicho socio.
 */

public class Extra5 {
  public static void main(String[] args) {
    String tipoSocio;
    double total = 0, descuento;

    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese tipo de socio: (A, B o C)");
    tipoSocio = leer.nextLine().toUpperCase();

    if (tipoSocio.equals("A") || tipoSocio.equals("B") || tipoSocio.equals("C")) {
      System.out.print("Ingrese monto total: $");
      total = leer.nextInt();

      System.out.println("Total a pagar sin descuento: $" + total);
    }

    switch (tipoSocio) {
      case "A":
        descuento = total * 0.5;
        System.out.println("Por ser socio de Nivel A, pagas: $" + descuento);
        break;
      case "B":
        descuento = total * 0.65;
        System.out.println("Por ser socio de Nivel B, pagas: $" + descuento);
        break;
      case "C":
        descuento = total;
        System.out.println("Por ser socio de Nivel C, pagas: $" + descuento);
        break;
      default:
        System.out.println("No existe este tipo de socio");
    }

    leer.close();
  }
}

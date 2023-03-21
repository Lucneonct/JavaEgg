package guia_3.extras;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
 * función equals() de la clase String.
 */

public class Extra3 {
  public static void main(String[] args) {
    String letra;

    Scanner leer = new Scanner(System.in);
    letra = leer.nextLine().toLowerCase();

    if (letra.equals("a")
        || letra.equals("e")
        || letra.equals("i")
        || letra.equals("o")
        || letra.equals("u")) {
      System.out.println("La letra es vocal");
    } else {
      System.out.println("La letra es consonante");
    }

    leer.close();
  }
}

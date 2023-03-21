package guia_3.extras;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */

public class Extra6 {
  public static void main(String[] args) {
    double altura, alturaSub160 = 0, alturaGeneral = 0;
    int cantPersonas, contadorSub160 = 0;

    Scanner leer = new Scanner(System.in);

    System.out.print("¿Cuántas personas evaluarás? ");
    cantPersonas = leer.nextInt();

    for (int i = 0; i < cantPersonas; i++) {
      System.out.println("Altura de la persona N°" + i + " en metros:");
      altura = leer.nextDouble();

      if (altura < 1.60) {
        alturaSub160 += altura;
        contadorSub160++;
      }

      alturaGeneral += altura;
    }

    System.out.println("Personas con altura menor a 1.60: (" + contadorSub160 + "/" + cantPersonas + ")");
    System.out.println("Promedio de altura de personas menores a 1.60: " + (alturaSub160 / contadorSub160) + "m.");
    System.out.println("Promedio general de personas: " + (alturaGeneral / cantPersonas) + "m.");

    leer.close();
  }
}

package guia_3.extras;

import java.util.Scanner;

/**
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
 * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
 * equivalente: 1 día, 2 horas.
 */

public class Extra1 {
  public static void main(String[] args) {
    int dias, horas, minutos, tiempoDias;

    Scanner leer = new Scanner(System.in);

    System.out.print("Cantidad de minutos: ");
    minutos = leer.nextInt();

    tiempoDias = 60 * 24;
    dias = minutos / tiempoDias;
    horas = (minutos % tiempoDias) / 60;

    System.out.println("Dias: " + dias);
    System.out.println("Horas: " + horas);

    leer.close();
  }
}

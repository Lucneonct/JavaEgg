package guia_3.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    String texto;

    Scanner input = new Scanner(System.in);
    System.out.println("Ingresa el texto \"eureka\"");
    texto = input.nextLine();

    if(texto.equals("eureka")) {
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

    input.close();
  }
}

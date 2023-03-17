package guia_3.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    String texto;

    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa un texto de 8 de largo");
    texto = input.nextLine();

    if(texto.length() == 8) {
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

    input.close();
  }
}

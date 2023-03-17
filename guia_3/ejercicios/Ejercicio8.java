package guia_3.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    int tamano;

    Scanner input = new Scanner(System.in);

    System.out.print("Dime el tamaño del cuadrado que quieras: ");
    tamano = input.nextInt();

    for (int i = 0; i < tamano; i++) {
      for (int j = 0; j < tamano; j++) {
        if(i == 0 || i == (tamano - 1) || j == 0 || j == (tamano - 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }

    input.close();
    // ****
    // *  *
    // *  *
    // ****
  }
}

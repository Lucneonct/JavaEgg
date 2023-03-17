package guia_3.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    int numero;

    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa un numero par o un impar");
    numero = input.nextInt();

    if(numero % 2 == 0) {
      System.out.println("El número es par");
    } else {
      System.out.println("El numero es impar");
    }

    input.close();
  }
}

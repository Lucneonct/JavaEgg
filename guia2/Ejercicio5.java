package guia2;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    int numero;

    Scanner input = new Scanner(System.in);

    System.out.println("Dime un número:");
    numero = input.nextInt();

    System.out.println("El doble es: " + numero * 2);
    System.out.println("El triple es: " + numero * 3);
    System.out.println("La raiz cuadrada es: " + Math.sqrt(numero));
    input.close();
  }
}

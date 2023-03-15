package mi_paquete_de_prueba;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    int num1, num2, sum;

    Scanner input = new Scanner(System.in);
    System.out.println("Ingresa el número 1:");
    num1 = input.nextInt();
    System.out.println("Ingresa el número 2:");
    num2 = input.nextInt();
    sum = num1 + num2;
    System.out.println("La suma de " + num1 + " + " + num2 + " = " + sum);
    input.close();
  }
}

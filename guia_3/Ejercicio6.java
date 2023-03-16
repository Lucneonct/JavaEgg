package guia_3;

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    int num1, num2;

    Scanner input = new Scanner(System.in);

    System.out.println("Primer numero:");
    num1 = input.nextInt();

    System.out.println("Segundo numero:");
    num2 = input.nextInt();

    if(num1 > 25 && num2 > 25) {
      System.out.println("Ambos son mayores a 25");
    } else if(num1 > 25) {
      System.out.println("El numero " + num1 + " es mayor a 25");
    } else if(num2 > 25) {
      System.out.println("El numero " + num2 + " es mayor a 25");      
    } else {
      System.out.println("Ninguno es mayor a 25");
    }

    input.close();
  }
}

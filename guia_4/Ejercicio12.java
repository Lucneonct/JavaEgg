package guia_4;

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    int num1, num2;
    Scanner leer = new Scanner(System.in);

    System.out.println("Escribe 2 números a evaluar");
    num1 = leer.nextInt();
    num2 = leer.nextInt();

    if (esMultiplo(num1, num2)) {
      System.out.println("Los números son multiplos");
    } else {
      System.out.println("Los números no son múltiplos");
    }

    leer.close();
  }

  public static boolean esMultiplo(int dato1, int dato2) {
    return dato2 % dato1 == 0;
  }
}

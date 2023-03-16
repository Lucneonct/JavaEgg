package guia_3;

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    int tipoMotor;

    Scanner input = new Scanner(System.in);

    System.out.println("Elige el tipo de bomba:");
    System.out.println("");
    System.out.println("1. Bomba de agua");
    System.out.println("2. Bomba de gasolina");
    System.out.println("3. Bomba de hormigón");
    System.out.println("4. Bomba de pasta alimenticia");
    System.out.println("");

    tipoMotor = input.nextInt();

    switch (tipoMotor) {
      case 1:
        System.out.println("La bomba es una bomba de agua");
        break;
      case 2:
        System.out.println("La bomba es una bomba de gasolina");
        break;
      case 3:
        System.out.println("La bomba es una bomba de hormigón");
        break;
      case 4:
        System.out.println("La bomba de pasta alimenticia");
        break;
      default:
        System.out.println("No existe un valor válido para tipo de bomba");
    }
  }
}

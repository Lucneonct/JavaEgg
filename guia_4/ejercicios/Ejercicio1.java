package guia_4.ejercicios;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    int num1, num2, opcion;
    String letra;
    double resultado = 0;
    boolean activo = true;

    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese el primer número: ");
    num1 = input.nextInt();

    System.out.print("Ingrese el segundo número: ");
    num2 = input.nextInt();

    do {
      System.out.println("---------------");
      System.out.println("1. Sumar");
      System.out.println("2. Restar");
      System.out.println("3. Multiplicar");
      System.out.println("4. Dividir");
      System.out.println("5. Salir");
      System.out.println("---------------");
      System.out.print("Elige una opción: ");

      opcion = input.nextInt();

      switch (opcion) {
        case 1:
          resultado = sumar(num1, num2);
          break;
        case 2:
          resultado = restar(num1, num2);
          break;
        case 3:
          resultado = multiplicar(num1, num2);
          break;
        case 4:
          resultado = dividir(num1, num2);
          break;
        case 5:
          System.out.println("¿Salir del menú? (s/N)");

          letra = input.next().toLowerCase();
          // Si pone "s" apaga el menú
          if (letra.equals("s")) {
            activo = false;
          }
          break;
        default:
          System.out.println("Opción incorrecta.");
          break;
      }

      if (opcion <= 4 && opcion >= 1) {
        System.out.println("El resultado es: " + resultado);
      }
    } while (activo);
    input.close();
  }

  public static int sumar(int num1, int num2) {
    return num1 + num2;
  }

  public static int restar(int num1, int num2) {
    return num1 - num2;
  }
  
  public static int multiplicar(int num1, int num2) {
    return num1 * num2;
  }
  
  public static double dividir(int num1, int num2) {
    return (double) num1 / (double) num2;
  }
}

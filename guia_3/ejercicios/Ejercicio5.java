package guia_3.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    int maximo, suma = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese el número máximo: ");
    maximo = input.nextInt();

    while (suma <= maximo) {
      System.out.print("Ingresa un número: ");
      suma += input.nextInt();
      System.out.println(suma + "/" + maximo);
    }

    System.out.println("Número máximo superado.");

    input.close();
  }
}

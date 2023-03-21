package guia_4.ejercicios;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    int edad;
    String nombre, opcion = "si";

    Scanner leer = new Scanner(System.in);

    do {
      System.out.print("Dime tu nombre: ");
      nombre = leer.next();

      System.out.print("Dime tu edad: ");
      edad = leer.nextInt();

      if (esMayorDeEdad(edad)) {
        System.out.println(nombre + " es mayor de edad.");
      } else {
        System.out.println(nombre + " es menor de edad.");
      }

      System.out.print("¿Desea continuar? (SI/no) ");
      opcion = leer.next();
    } while (!opcion.equalsIgnoreCase("no"));

    leer.close();
  }

  public static boolean esMayorDeEdad(int edad) {
    return edad >= 18;
  }
}

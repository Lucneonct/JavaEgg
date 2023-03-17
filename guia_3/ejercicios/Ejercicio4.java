package guia_3.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    String nombre;

    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa una letra que empiece por a");
    nombre = input.nextLine();

    if(nombre.substring(0, 1).toUpperCase().equals("A")) {
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

    input.close();
  }
}

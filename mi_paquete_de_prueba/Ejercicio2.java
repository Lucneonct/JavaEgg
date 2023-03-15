package mi_paquete_de_prueba;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    String nombre;

    System.out.println("Tu nombre:");
    Scanner input = new Scanner(System.in);

    nombre = input.nextLine();
    input.close();

    System.out.println("Hola " + nombre);
  }
}
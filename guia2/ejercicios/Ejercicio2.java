package guia2.ejercicios; // Define el nombre del paquete donde se encuentra la clase

import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

/**
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */

public class Ejercicio2 {
  // Define el método principal que se ejecuta al iniciar el programa
  public static void main(String[] args) {
    // Declara una variable de tipo String para almacenar el nombre
    String nombre;

    // Imprime un mensaje en la pantalla solicitando el nombre
    System.out.println("Tu nombre:");
    // Crea un objeto de tipo Scanner para leer datos desde el teclado
    Scanner input = new Scanner(System.in);

    // Lee una línea de texto desde el teclado y la asigna a la variable nombre
    nombre = input.nextLine();
    // Cierra el objeto Scanner para liberar recursos
    input.close();

    // Imprime un mensaje en la pantalla saludando al usuario con su nombre
    System.out.println("Hola " + nombre);
  }
}
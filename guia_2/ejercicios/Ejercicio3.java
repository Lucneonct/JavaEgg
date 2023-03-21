package guia_2.ejercicios; // Define el nombre del paquete donde se encuentra la clase

import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
 * después toda en minúsculas. 
 * 
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

public class Ejercicio3 {
  // Define el método principal que se ejecuta al iniciar el programa
  public static void main(String[] args) {
    // Crea un objeto de tipo Scanner para leer datos desde el teclado
    Scanner input = new Scanner(System.in);

    // Imprime un mensaje en la pantalla solicitando un texto
    System.out.println("Ingresa un texto:");
    // Lee una línea de texto desde el teclado y la asigna a la variable texto
    String texto = input.nextLine();
    // Convierte el texto a mayúsculas y lo asigna a la misma variable
    texto = texto.toUpperCase();
    // Imprime el texto en mayúsculas en la pantalla
    System.out.println(texto);

    // Convierte el texto a minúsculas y lo asigna a la misma variable
    texto = texto.toLowerCase();
    // Imprime el texto en minúsculas en la pantalla
    System.out.println(texto);
    // Cierra el objeto Scanner para liberar recursos
    input.close();
  }
}
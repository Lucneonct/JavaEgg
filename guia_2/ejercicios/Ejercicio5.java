package guia_2.ejercicios; // Define el nombre del paquete donde se encuentra la clase

import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. 
 * 
 * Nota: investigar la función Math.sqrt().
 */

public class Ejercicio5 {
  // Define el método principal que se ejecuta al iniciar el programa
  public static void main(String[] args) {
    // Declara una variable entera para almacenar el número
    int numero; 

    // Crea un objeto de tipo Scanner para leer datos desde el teclado
    Scanner input = new Scanner(System.in);

    // Imprime un mensaje en la pantalla solicitando un número
    System.out.println("Dime un número:");
    // Lee un número entero desde el teclado y lo asigna a la variable numero
    numero = input.nextInt();

    // Imprime un mensaje en la pantalla mostrando el doble del número
    System.out.println("El doble es: " + numero * 2);
    // Imprime un mensaje en la pantalla mostrando el triple del número
    System.out.println("El triple es: " + numero * 3);
    // Imprime un mensaje en la pantalla mostrando la raíz cuadrada del número usando la clase Math
    System.out.println("La raiz cuadrada es: " + Math.sqrt(numero));
    // Cierra el objeto Scanner para liberar recursos
    input.close();
  }
}
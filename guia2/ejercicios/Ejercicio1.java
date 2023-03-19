package guia2.ejercicios; // Define el nombre del paquete donde se encuentra la clase

import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la 
 * suma de los dos. El programa deberá después mostrar el resultado de la suma 
 */

public class Ejercicio1 {
  // Define el método principal que se ejecuta al iniciar el programa
  public static void main(String[] args) {
    // Declara tres variables enteras para almacenar los números y la suma
    int num1, num2, sum;

    // Crea un objeto de tipo Scanner para leer datos desde el teclado
    Scanner input = new Scanner(System.in);
    // Imprime un mensaje en la pantalla solicitando el primer número
    System.out.println("Ingresa el número 1:");
    // Lee el primer número desde el teclado y lo asigna a la variable num1
    num1 = input.nextInt();
    // Imprime un mensaje en la pantalla solicitando el segundo número
    System.out.println("Ingresa el número 2:");
    // Lee el segundo número desde el teclado y lo asigna a la variable num2
    num2 = input.nextInt();
    // Calcula la suma de los dos números y la asigna a la variable sum
    sum = num1 + num2;
    // Imprime un mensaje en la pantalla mostrando el resultado de la suma
    System.out.println("La suma de " + num1 + " + " + num2 + " = " + sum);
    // Cierra el objeto Scanner para liberar recursos
    input.close();
  }
}
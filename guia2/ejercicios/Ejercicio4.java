package guia2.ejercicios; // Define el nombre del paquete donde se encuentra la clase

import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente
 * en grados Fahrenheit. 
 * 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

public class Ejercicio4 {
  // Define el método principal que se ejecuta al iniciar el programa
  public static void main(String[] args) {
    // Declara una variable entera para almacenar los grados Celsius
    int grados; 
    // Declara una variable de tipo double para almacenar el resultado en grados Fahrenheit
    double resultado; 

    // Crea un objeto de tipo Scanner para leer datos desde el teclado
    Scanner input = new Scanner(System.in);
    // Lee un número entero desde el teclado y lo asigna a la variable grados
    grados = input.nextInt();

    // Aplica la fórmula de conversión de Celsius a Fahrenheit y asigna el resultado a la variable resultado
    resultado = 32 + (9 * grados / 5);

    // Imprime un mensaje en la pantalla mostrando la equivalencia entre los grados Celsius y Fahrenheit
    System.out.println(grados + "° equivale a " + resultado + "°F");
    // Cierra el objeto Scanner para liberar recursos
    input.close();
  }
}
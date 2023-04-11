package guia_5.ejercicios;

import java.util.Scanner;

/**
 * Make an algorithm that fills a vector of size N with random values
 * and prompt the user for a number to search for in the vector. The program
 * will show
 * where is the number and if it is repeated
 */
public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el tamaño de la vector: ");
    int n = sc.nextInt();
    int[] vector = new int[n];
    for (int i = 0; i < n; i++) {
      vector[i] = (int) (Math.random() * 100);
    }
    System.out.println("Vector: ");
    for (int i = 0; i < n; i++) {
      System.out.print(vector[i] + " ");
    }
    System.out.println();
    System.out.print("Ingrese el numero a buscar: ");
    int num = sc.nextInt();
    int pos = 0;
    for (int i = 0; i < n; i++) {
      if (vector[i] == num) {
        pos = i;
        break;
      }
  
      if (i == n - 1) {
        System.out.println("No se encuentra el numero");
      }
  
      System.out.print(vector[i] + " ");
  
      if (i == n - 1) {
        System.out.println();
      }
  
      System.out.println();
  
      System.out.print("Ingrese el numero a buscar: ");
      num = sc.nextInt();
    }
    System.out.println();
    System.out.println("El numero se encuentra en la posicion " + pos);
    sc.close();
  }
}

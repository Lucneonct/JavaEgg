package guia_3;

import java.util.Scanner;

/**
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se
 * debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
 * programa deberá calcular y mostrar el resultado de la suma de los números
 * leídos, pero si el número es negativo no debe sumarse.
 * 
 * Nota: recordar el uso de la sentencia break.
 */

public class Ejercicio9 {
  public static void main(String[] args) {
    int numero, contador = 0, suma = 0;

    Scanner leer = new Scanner(System.in);

    do {
      System.out.print("Ingresa un número diferente a 0: ");

      numero = leer.nextInt();
      suma += numero;
      contador++;

      if(numero == 0) {
        System.out.println("Se capturó el número cero");
        break;
      }
    } while(contador < 20);

    System.out.println("La suma dió un total de: " + suma);

    leer.close();
  }
}

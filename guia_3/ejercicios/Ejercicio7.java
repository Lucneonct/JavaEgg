package guia_3.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    String codigo;
    int correctas = 0, incorrectas = 0;
    
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese códigos con el formato: X---O");
    System.out.println("Ingrese el código &&&&& para detener la ejecución");
    System.out.println("");
    do {
      codigo = input.nextLine();

      if(codigo.equals("&&&&&")) {
        continue;
      }

      if(
        codigo.length() != 5 
        || !codigo.substring(0, 1).toUpperCase().equals("X")
        || !codigo.substring(4, 5).toUpperCase().equals("O")
      ) {
        incorrectas++;
      } else {
        correctas++;
      }
    } while(!codigo.equals("&&&&&"));

    System.out.println("Correctas: " + correctas);
    System.out.println("Incorrectas: " + incorrectas);
    input.close();
  }
}

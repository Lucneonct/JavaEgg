package guia_3;

import java.util.Scanner;

public class Prueba {
  public static void main(String[] args) {
    int numero;
    String puntuacion;
    Scanner input = new Scanner(System.in);

    System.out.println("Dime 5 o 10:");
    numero = input.nextInt();

    switch (numero) {
      case 1:
        puntuacion = "Muy mala";
        break;
      case 2:
      case 3:
      case 4:
        puntuacion = "Regular";
        break;
      case 5:
        puntuacion = "Excelente";
        break;
      default:
        puntuacion = "Desconocido";
    }

    System.out.println(puntuacion);

    ////////////
    input.close();
  }
}

package mi_paquete_de_prueba;
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa un texto:");
    String texto = input.nextLine();

    texto = texto.toUpperCase();
    System.out.println(texto);

    texto = texto.toLowerCase();
    System.out.println(texto);
  }
}

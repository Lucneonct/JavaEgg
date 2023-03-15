package mi_paquete_de_prueba;
import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    int grados;
    double resultado;

    Scanner input = new Scanner(System.in);
    grados = input.nextInt();

    resultado = 32 + (9 * grados / 5);

    System.out.println(grados + "° equivale a " + resultado + "°F");
    input.close();
  }
}

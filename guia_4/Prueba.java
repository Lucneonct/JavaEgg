package guia_4;

public class Prueba {
  public static int sumar(int num1, int num2) {
    int suma = num1 + num2;

    return suma;
  }

  public static void main(String[] args) {
    int suma1 = sumar(15, 20); // => 35
    int suma2 = sumar(10, suma1); // => 45

    System.out.println(suma2);
  } 
}

package guia_4;

public class Prueba {
  public static boolean esPar(int dato) {
    return dato % 2 == 0;
  }

  public static void main(String[] args) {
    int num = 6;
    
    if(esPar(num)) {
      System.out.println("El número es par");
    } else {
      System.out.println("El número es impar");
    }
  } 
}

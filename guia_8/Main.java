package guia_8;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String nombre1 = "Lucas";
    String nombre2 = input.nextLine();

    System.out.println(nombre1 == nombre2);
    
    System.out.println();
    
    System.out.println(nombre1.hashCode());
    System.out.println(nombre2.hashCode());
    
    String nombre3 = nombre1;
    System.out.println(nombre1 == nombre3);
    
    System.out.println();
    
    System.out.println(nombre1.hashCode());
    System.out.println(nombre3.hashCode());
  }  
}

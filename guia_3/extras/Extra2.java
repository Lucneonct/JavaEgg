package guia_3.extras;

/**
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
 * diferente a cada una. A continuación, realizar las instrucciones necesarias
 * para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y
 * D tome el valor de B. Mostrar los valores iniciales y los valores finales de
 * cada variable. Utilizar sólo una variable auxiliar.
 */

public class Extra2 {
  public static void main(String[] args) {
    int A, B, C, D, aux;

    A = 5; // 8
    B = 6; // 7
    C = 7; // 5
    D = 8; // 6

    aux = B;
    B = C; 
    C = A;
    A = D;
    D = aux;

    System.out.println(A);
    System.out.println(B);
    System.out.println(C);
    System.out.println(D);
  }
}

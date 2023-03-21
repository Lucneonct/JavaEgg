package guia_4;

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    String texto;
    Scanner leer = new Scanner(System.in);

    System.out.println("Ingresa una oración terminada en punto");
    texto = leer.nextLine();

    System.out.println(convertir(texto));;

    leer.close();
  }

  public static String convertir(String texto) {
    String textoTransformado = "";

    for (int i = 0; i < texto.length(); i++) {
      String letra = texto.substring(i, i + 1);

      switch(letra) {
        case "a":
          textoTransformado += "@";
          break;
        case "e":
          textoTransformado += "#";
          break;
        case "i":
          textoTransformado += "$";
          break;
        case "o":
          textoTransformado += "%";
          break;
        case "u":
          textoTransformado += "*";
          break;
        default:
          textoTransformado += letra;
      }
    }

    return textoTransformado;
  }

}

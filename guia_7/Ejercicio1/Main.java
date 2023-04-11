package guia_7.Ejercicio1;

public class Main {
  public static void main(String[] args) {
    System.out.println("");
    Libro libro = new Libro(123456789, "El señor de los anillos", "Donald Trump", 412);

    System.out.println("");
    System.out.println(libro.toString());
    System.out.println("Título: " + libro.getTitulo());
    System.out.println("Autor: " + libro.getAutor());
    System.out.println("ISBN: " + libro.getISBN());
    System.out.println("Páginas: " + libro.getPaginas());
    System.out.println("");
    
    Libro libro2 = new Libro();
    libro2.setLibro(987654321, "Juego de Tronos", "Leonardo Dicaprio", 123);
    System.out.println(libro2.toString());
  }
}

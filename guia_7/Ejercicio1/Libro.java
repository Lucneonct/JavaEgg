package guia_7.Ejercicio1;

public class Libro {
  int ISBN;
  String titulo;
  String autor;
  int paginas;

  public Libro(int ISBN, String titulo, String autor, int paginas) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
  }

  public Libro() {}

  public int getISBN() {
    return ISBN;
  }
  public String getTitulo() {
    return titulo;
  }
  public String getAutor() {
    return autor;
  }
  public int getPaginas() {
    return paginas;
  }

  public void setLibro(int ISBN, String titulo, String autor, int p) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = p;
  }

  @Override
  public String toString() {
    return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
  }
}

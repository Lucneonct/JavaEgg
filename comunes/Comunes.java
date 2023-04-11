package comunes;

public class Comunes {
  public static void rellenarVectorAleatorio(int[] vector, int hasta) {
    for (int i = 0; i < vector.length; i++) {
      vector[i] = aleatorio(0, hasta);
    }
  }
  
  public static void rellenarVectorAleatorio(int[] vector) {
    rellenarVectorAleatorio(vector, 10);
  }

  public static int aleatorio(int desde, int hasta) {
    return Math.round((int) ((Math.random() * (desde + hasta)) - desde));
  }

  public static int aleatorio(int hasta) {
    return aleatorio(0, hasta);
  }
}

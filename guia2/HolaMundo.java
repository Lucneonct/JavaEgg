package guia2;

public class HolaMundo {
	public static void main(String[] args) {
		int numero = 48;
		double decimales = 3.55;
		boolean bandera = false;

		// Consola
		System.out.println(numero);

		// Añadir 1 a la variable
		numero++;
		System.out.println(numero);

		// Añadir 10 a la variable
		numero += 10;
		System.out.println(decimales);

		// Comparación
		bandera = numero == 59;
		System.out.println(bandera);
	}
}
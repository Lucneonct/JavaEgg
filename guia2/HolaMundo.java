package guia2;

import java.util.Scanner;

public class HolaMundo {
	public static void main(String[] args) {
		/*******************
		 * DEFINIR VARIABLES
		 * 
		 * Como se definen variables en java, comparandose
		 * a como lo hacíamos anteriormente en PSeInt
		 */

		// Definir curso, letra Como Caracter
		String curso = "Java";
		char letra = 'a'; // A tener en cuenta que "char" es unicamente 1 letra, no más, y usa comillas simples. 
		
		// Definir numero Como Entero
		int numero = 48;
		
		// Definir decimales Como Real
		double decimales = 3.55;

		// Definir bandera Como Logico
		boolean bandera = false;

		/**************************
		 * MOSTRAR DATOS EN CONSOLA
		 * 
		 * Como se utiliza el System.out.println(x) o más conocido
		 * como "sout" ya que es una abreviación para el autocompletado
		 */

		// Escribir numero
		System.out.println(numero); // => 48

		// Escribir Sin Saltar numero
		System.out.print(numero);

		// Añadir 1 a la variable
		numero++;
		System.out.println(numero); // => 49

		// Añadir 10 a la variable
		numero += 10;
		System.out.println(decimales); // => 59

		// Comparación
		bandera = numero == 59;
		System.out.println(bandera); // => true
		System.out.println(curso); // => "Java"
		System.out.println(letra); // => 'a'

		/***********************
		 * LEER DATOS DE TECLADO
		 * 
		 * Como leer datos ingresados en consola como hacíamos en PSeInt
		 * utilizando un nuevo modelo y tipo, que es el "Scanner"
		 * 
		 * ACLARACIÓN:
		 * Antes de continuar acordarse que antes de usar el Scanner hay
		 * que importarlo como se ve en la linea 3, caso contrario
		 * no funcionará
		 */

		 // Primero creamos nuestra variable donde se va a guardar nuestro scanner
		 Scanner leer = new Scanner(System.in);
		 // Se usa System.in dentro del scanner ya que eso lee lo que se ingrese desde el sistema
		 // Ya que el Scanner funciona también para archivos, y otros tipos de datos

		 // Después guardamos lo que leemos en nuestra variables
		 curso = leer.nextLine(); // Leer textos ("String" no "char")
		 numero = leer.nextInt(); // Leer números enteros
		 decimales = leer.nextDouble(); // Leer números con comas
		 bandera = leer.nextBoolean(); // Leer un true o un false
		 
		 /**
			* IGNORAR:
			* 
			* En caso que uses algun otro IDE que no sea NetBeans probablemente
			* te salga una advertencia amarilla que diga que "leer" no está cerrado
			* Para eso simplemente agregamos este código, caso contrario ignorar
		  */
			leer.close();
	}
}
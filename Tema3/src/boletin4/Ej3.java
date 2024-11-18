package boletin4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {

	// Funcion para crear la tabla
	public static int[] rellenaPares(int longitud, int fin) {
		// Variables
		Random rand = new Random();
		int tabla[] = new int[longitud];
		int random;

		// Bucle para rellenar la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Bucle para asegurarnos de que el numero aleatorio generado es par
			do {
				random = rand.nextInt(2, fin + 1);
			} while (random % 2 != 0);
			tabla[i] = random;
		}
		// Devuelve la tabla resultante rellenada
		return tabla;
	}

	public static void main(String[] args) {
		// Variables
		int longitud;
		int fin;

		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Pide y guarda numeros
		System.out.println("Indica la longitud: ");
		longitud = scanner.nextInt();

		System.out.println("Indica el fin: ");
		fin = scanner.nextInt();

		// Imprime la tabla resultante de la funcion
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));

		// Cerramos el scanner
		scanner.close();

	}

}

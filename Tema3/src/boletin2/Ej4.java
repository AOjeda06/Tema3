package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int num;
		int lista[] = new int[8];

		// Bucle for para guardar en un array los 20 numeros
		for (int i = 0; i < lista.length; i++) {

			// Pide el numero
			System.out.println("Escribe tu puntuacion: ");

			// Lee el numero
			num = scanner.nextInt();

			// Asigna el numero a la posicion actual de la tabla
			lista[i] = num;

		}

		// Ordenamos el array
		Arrays.sort(lista);

		// Escribe de mayor a menor las puntuaciones
		for (int j = lista.length; j > 0; j--) {
			System.out.println(j);
		}

		// Cerramos el scanner
		scanner.close();
	}

}

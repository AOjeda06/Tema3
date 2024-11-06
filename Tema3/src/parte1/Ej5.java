package parte1;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int lista[] = new int[10];
		int num;
		int total = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		// Bucle
		for (int i = 0; i < lista.length; i++) {

			// Pide el numero
			System.out.println("Escribe un numero: ");

			// Lee el numero
			num = scanner.nextInt();

			// Asigna el numero a la posicion actual de la tabla
			lista[i] = num;

		}

		// Recorre todos los numeros de la tabla de la posicion 0 a la ultima
		for (int valor : lista) {

			// Suma todos los valores
			total += valor;

			// Comprueba si es el maximo introducido
			if (valor > max) {
				max = valor;
			}

			// Comprueba si es el minimo introducido
			if (valor < min) {
				min = valor;
			}

		}

		// Respuestas
		System.out.println("Total: " + total);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

		// Cerramos el scanner
		scanner.close();
	}

}

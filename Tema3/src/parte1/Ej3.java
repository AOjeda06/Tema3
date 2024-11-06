package parte1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		double lista[] = new double[10];
		double num;

		// Bucle
		for (int i = 0; i < lista.length; i++) {

			// Pide el numero
			System.out.println("Escribe un numero decimal: ");

			// Lee el numero
			num = scanner.nextDouble();

			// Asigna el numero a la posicion actual de la tabla
			lista[i] = num;
		}

		// Escribe todos los numeros de la tabla de la posicion final a la 0
		for (int i = lista.length - 1; i >= 0; i--) {
			System.out.print(lista[i] + " ");
		}

		// Cerramos el scanner
		scanner.close();
	}

}

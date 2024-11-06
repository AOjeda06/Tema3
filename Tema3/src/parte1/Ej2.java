package parte1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		double lista[] = new double[5];
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

		// Escribe todos los numeros de la tabla de la posicion 0 a la 4
		for (double valor : lista) {
			System.out.print(valor + " ");
		}

		// Cerramos el scanner
		scanner.close();
	}

}

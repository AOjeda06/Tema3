package parte1;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int lista[] = new int[12];
		int num;

		// Bucle
		for (int i = 0; i < lista.length; i++) {

			// Pide el numero
			System.out.println("Escribe la temperatura del mes " + (i + 1) + ": ");

			// Lee el numero
			num = scanner.nextInt();

			// Asigna el numero a la posicion actual de la tabla
			lista[i] = num;
		}

		System.out.println("Gráfico:");

		// Recorre todos los numeros de la tabla de la posicion 0 a la ultima
		for (int valor : lista) {

			// Indica el mes y imprime # para representar la temperatura
			System.out.print("Mes " + valor + ": ");
			for (int j = 1; j <= valor; j++) {
				System.out.print("#");
			}

			// Salta una linea para el siguiente mes
			System.out.println();
		}

		// Cerramos el scanner
		scanner.close();
	}

}

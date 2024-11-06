package parte1;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int lista[] = new int[8];
		int num;

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

			// Comprueba si es par o impar
			if (valor % 2 == 0) {
				System.out.println(valor + " par");
			} else {
				System.out.println(valor + " impar");
			}
		}

		// Cerramos el scanner
		scanner.close();
	}

}

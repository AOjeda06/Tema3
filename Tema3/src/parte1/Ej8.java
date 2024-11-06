package parte1;

import java.util.Random;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Creamos el random
		Random rand = new Random();

		// Variables
		int lista[] = new int[100];
		int random;
		int num;

		// Crea un numero aleatorio y se lo asigna a una posicion dentro de la tabla
		for (int i = 0; i < lista.length; i++) {
			random = rand.nextInt(1, 11);
			lista[i] = random;
		}

		// Pide el numero que vamos a buscar
		System.out.println("Escribe un numero");
		num = scanner.nextInt();

		// Recorre la tabla con un for
		for (int j = 0; j < lista.length; j++) {

			// Comprueba el valor del numero en la posición J
			if (lista[j] == num) {
				// Indica que ese número se haya en la posición J de la tabla
				System.out.println("Hay un " + num + " en la posición " + j);
			}
		}

		// Cerramos el scanner
		scanner.close();
	}

}

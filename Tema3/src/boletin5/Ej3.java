package boletin5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {

	// Función que desordena el array
	public static int[][] desordena(int[][] t) {
		Random rand = new Random();
		int temp;
		int random;

		// Algoritmo de Fisher-Yates para barajar el array
		for (int[] fila : t) {
			for (int i = fila.length - 1; i > 0; i--) {
				random = rand.nextInt(0, i + 1);

				temp = fila[i];
				fila[i] = fila[random];
				fila[random] = temp;
			}
		}
		return t;
	}

	// Método main para probar la función
	public static void main(String[] args) {
		// Variables
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int rand1;
		int[][] t = new int[2][3];

		// Rellena el array con numeros aleatorios
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				rand1 = rand.nextInt(0, 501);
				t[i][j] = rand1;
			}
		}

		// Imprime el array original
		System.out.println("Array original:");
		System.out.println(Arrays.deepToString(t));

		// Imprime el array barajado
		System.out.println("Array desordenado:");
		System.out.println(Arrays.deepToString(desordena(t)));

		// Cierra el scanner
		scanner.close();
	}

}

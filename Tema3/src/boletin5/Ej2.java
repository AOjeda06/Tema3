package boletin5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej2 {

	// Función que desordena el array
	public static int[] desordena(int[] t) {
		Random rand = new Random();
		int temp;

		// Algoritmo de Fisher-Yates para barajar el array
		for (int i = t.length - 1; i > 0; i--) {
			int j = rand.nextInt(0, i + 1);

			// Intercambiar t[i] con t[j]
			temp = t[i];
			t[i] = t[j];
			t[j] = temp;
		}
		return t;
	}

	// Método main para probar la función
	public static void main(String[] args) {
		// Variables
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int rand1;
		int[] t = new int[6];

		// Rellena el array con números aleatorios
		for (int i = 0; i < t.length; i++) {
			rand1 = rand.nextInt(0, 100);
			t[i] = rand1;
		}

		System.out.println("Array original:");
		System.out.println(Arrays.toString(t));

		System.out.println("Array desordenado:");
		System.out.println(Arrays.toString(desordena(t)));

		// Cierra el scanner
		scanner.close();
	}
}

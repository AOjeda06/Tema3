package boletin4;

import java.util.Arrays;
import java.util.Random;

public class Ej9 {

	// Función que verifica si la matriz es simétrica
	public static boolean simetrica(int[][] t) {
		// Recorremos las filas
		for (int i = 0; i < t.length; i++) {
			// Recorremos las columnas
			for (int j = 0; j < t[i].length; j++) {
				// Comparar elementos simétricos
				if (t[i][j] != t[j][i]) {
					return false; // No es simétrica
				}
			}
		}
		return true; // Es simétrica
	}

	public static void main(String[] args) {
		// Variables
		Random rand = new Random();
		int rand1;
		int[][] t = new int[4][4];

		// Rellena el array con números aleatorios
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				rand1 = rand.nextInt(20);
				t[i][j] = rand1;
			}
		}

		// Imprime la matriz original
		System.out.println("Matriz original:");
		for (int[] fila : t) {
			System.out.println(Arrays.toString(fila));
		}

		// Verifica si la matriz es simétrica
		System.out.println("¿La tabla es simétrica?: " + simetrica(t));
	}
}

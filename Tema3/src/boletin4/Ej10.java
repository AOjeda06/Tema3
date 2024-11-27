package boletin4;

import java.util.Arrays;
import java.util.Random;

public class Ej10 {

	// Función que verifica si la matriz es mágica
	public static boolean esMagica(int[][] t) {
		int sumaFila, sumaCol;
		boolean magica = true;

		// Calcular la suma de la primera fila para comparar
		int sumaReferencia = 0;
		for (int j = 0; j < t.length; j++) {
			sumaReferencia += t[0][j];
		}

		// Verificar la suma de todas las filas
		for (int i = 1; i < t.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < t.length; j++) {
				sumaFila += t[i][j];
			}
			if (sumaFila != sumaReferencia) {
				magica = false;
			}
		}

		// Verificar la suma de todas las columnas
		for (int j = 0; j < t.length; j++) {
			sumaCol = 0;
			for (int i = 0; i < t.length; i++) {
				sumaCol += t[i][j];
			}
			if (sumaCol != sumaReferencia) {
				magica = false;
			}
		}

		return magica; // Es mágica
	}

	public static void main(String[] args) {
		// Variables
		Random rand = new Random();
		int[][] t = new int[3][3];

		// Rellena el array con números aleatorios entre 1 y 9
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = rand.nextInt(1, 10);
			}
		}

		// Imprime la matriz original
		System.out.println("Matriz original:");
		for (int[] fila : t) {
			System.out.println(Arrays.toString(fila));
		}

		// Verifica si la matriz es mágica
		System.out.println("¿La tabla es mágica?: " + esMagica(t));
	}
}

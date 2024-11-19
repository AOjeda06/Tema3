package boletin4;

import java.util.Arrays;
import java.util.Random;

public class Ej8 {

	public static int[][] transposicion(int[][] t) {
		// Variable para almacenar los valores temporalmente durante el intercambio
		int temp;

		// Recorremos las filas
		for (int i = 0; i < t.length; i++) {
			// Recorremos las columnas desde i+1 para evitar retransponer los elementos
			for (int j = i + 1; j < t[i].length; j++) {
				// Guarda el valor de donde estamos en temp
				temp = t[i][j];
				// Copia su opuesto en donde estamos
				t[i][j] = t[j][i];
				// Pegamos en el opuesto el valor que teniamos aqui antes
				t[j][i] = temp;
			}
		}
		// Devuelve la matriz transpuesta
		return t;
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

		// Transpone la matriz
		transposicion(t);

		// Imprime la matriz transpuesta
		System.out.println("\nMatriz transpuesta:");
		for (int[] fila : t) {
			System.out.println(Arrays.toString(fila));
		}
	}
}

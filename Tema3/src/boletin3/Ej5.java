package boletin3;

import java.util.Arrays;
import java.util.Random;

public class Ej5 {

	public static void main(String[] args) {
		// Creamos el random
		Random rand = new Random();

		// Variables
		int tabla[][] = new int[5][6];
		int random;
		int sumaCol;
		int sumaFila;
		int total = 0;

		// Recorre las filas
		for (int fila = 0; fila < tabla.length; fila++) {
			// Recorre las columnas y asigna valor
			for (int col = 0; col < tabla[fila].length; col++) {
				if (fila == 4 && col == 5) {
					total = 0;
					// Sumar todos los números en el interior de la tabla
					for (int i = 0; i < tabla.length - 1; i++) {
						for (int j = 0; j < tabla[i].length - 1; j++) {
							total += tabla[i][j];
						}
					}
					tabla[fila][col] = total;
					// Calcula el sumatorio de las columnas
				} else if (col == 5) {
					sumaFila = 0;
					for (int k = 0; k < tabla[fila].length - 1; k++) {
						sumaFila += tabla[fila][k];
					}
					tabla[fila][col] = sumaFila;
					// Calcula el sumatorio de las filas
				} else if (fila == 4) {
					sumaCol = 0;
					for (int k = 0; k < tabla.length - 1; k++) {
						sumaCol += tabla[k][col];
					}
					tabla[fila][col] = sumaCol;
					// Rellena los numeros del interior de la tabla
				} else {
					random = rand.nextInt(100, 1000);
					tabla[fila][col] = random;
				}
			}
		}

		// Imprime la tabla
		for (int[] fila : tabla) {
			System.out.println(Arrays.toString(fila));
		}

	}
}

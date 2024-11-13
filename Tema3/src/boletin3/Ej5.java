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
					total = tabla[0][5] + tabla[1][5] + tabla[2][5] + tabla[3][5] + tabla[4][0] + tabla[4][1]
							+ tabla[4][2] + tabla[4][3] + tabla[4][4];
					tabla[fila][col] = total;
				} else if (col == 5) {
					sumaFila = 0;
					for (int k = 0; k < tabla[fila].length - 1; k++) {
						sumaFila += tabla[fila][k];
					}
					tabla[fila][col] = sumaFila;
				} else if (fila == 4) {
					sumaCol = 0;
					for (int k = 0; k < tabla.length - 1; k++) {
						sumaCol += tabla[k][col];
					}
					tabla[fila][col] = sumaCol;
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

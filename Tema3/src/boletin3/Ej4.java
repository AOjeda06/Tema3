package boletin3;

import java.util.Arrays;

public class Ej4 {

	public static void main(String[] args) {
		// Variables
		int tabla[][] = new int[10][10];

		// Recorre las filas
		for (int fila = 0; fila < tabla.length; fila++) {
			// Recorre las columnas y asigna valor
			for (int col = 0; col < tabla[fila].length; col++) {

				tabla[fila][col] = (fila + 1) * (col + 1);
			}
		}
		// Imprime la tabla
		System.out.println(Arrays.deepToString(tabla));
	}

}

package boletin3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int i;
		int j;
		int tabla[][];

		// Pide los valores
		System.out.println("Introduce el valor de i: ");
		i = scanner.nextInt();

		System.out.println("Introduce el valor de j: ");
		j = scanner.nextInt();

		// Asigna las dimensiones
		tabla = new int[i][j];

		// Recorre las filas
		for (int fila = 0; fila < tabla.length; fila++) {
			// Recorre las columnas y asigna valor
			for (int col = 0; col < tabla[fila].length; col++) {
				tabla[fila][col] = 10 * fila + col;
			}
		}

		// Imprime la tabla
		System.out.println(Arrays.deepToString(tabla));

		// Cerramos el scanner
		scanner.close();
	}

}

package boletin4;

import java.util.Arrays;

public class Ej11 {

	// Función que gira una matriz 4x4 90 grados
	public static int[][] gira90(int[][] t) {
		int[][] temp = new int[t.length][t.length];

		// Recorremos las filas y columnas
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				// Usamos la fórmula para rotar 90 grados: temp[j][t.length - 1 - i] es la nueva
				// ubicación para t[i][j] en la matriz rotada, es decir vamos recolocando en la
				// matriz temporal los elementos en su nueva posicion
				temp[j][t.length - 1 - i] = t[i][j];
			}
		}

		return temp;
	}

	public static void main(String[] args) {
		// Variables
		int[][] t = new int[4][4];
		int a = 1;
		int[][] t2;

		// Rellena el array con números del 1 al 16
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = a;
				a++;
			}
		}

		// Imprime la matriz original
		System.out.println("Matriz original:");
		for (int[] fila : t) {
			System.out.println(Arrays.toString(fila));
		}

		// Llama a la funcion y guarda la nueva tabla que devuelve en un array que
		// habiamos declarado vacio
		t2 = gira90(t);

		// Imprime la matriz girada
		System.out.println("\nMatriz girada 90 grados:");
		for (int[] fila : t2) {
			System.out.println(Arrays.toString(fila));
		}
	}
}

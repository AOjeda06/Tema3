package boletin4;

import java.util.Random;

public class Ej2 {

	//
	public static int intMaximo(int[][] matriz) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > max) {
					max = matriz[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// Crear una matriz de ejemplo
		int[][] matrizEjemplo = new int[5][5];
		Random rand = new Random();
		int intMaximo;

		// Llenar la matriz con valores aleatorios entre 1 y 10
		for (int i = 0; i < matrizEjemplo.length; i++) {
			for (int j = 0; j < matrizEjemplo[i].length; j++) {
				matrizEjemplo[i][j] = rand.nextInt(1, 100);
			}
		}

		// Imprimir la matriz
		System.out.println("Matriz:");
		for (int[] fila : matrizEjemplo) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

		intMaximo = intMaximo(matrizEjemplo);

		System.out.println("El mayor numero de la matriz: " + intMaximo);
	}

}

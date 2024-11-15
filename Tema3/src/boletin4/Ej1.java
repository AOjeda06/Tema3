package boletin4;

import java.util.Random;

public class Ej1 {

	// Función para sumar todos los valores de una matriz de enteros
	public static int sumarMatriz(int[][] matriz) {
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma += matriz[i][j];
			}
		}
		return suma;
	}

	// Método main para probar la funcionalidad
	public static void main(String[] args) {
		// Crear una matriz de ejemplo
		int[][] matrizEjemplo = new int[5][5];
		Random rand = new Random();

		// Llenar la matriz con valores aleatorios entre 1 y 10
		for (int i = 0; i < matrizEjemplo.length; i++) {
			for (int j = 0; j < matrizEjemplo[i].length; j++) {
				matrizEjemplo[i][j] = rand.nextInt(10) + 1;
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

		// Calcular y mostrar la suma de todos los valores de la matriz
		int sumaTotal = sumarMatriz(matrizEjemplo);

		System.out.println("Suma de todos los valores en la matriz: " + sumaTotal);
	}
}

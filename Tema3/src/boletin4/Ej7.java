package boletin4;

import java.util.Arrays;
import java.util.Random;

public class Ej7 {

	public static int[] maxmin(int[][] t) {
		// Variables
		int[] resultado = new int[2];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		// Recorre el array entero comprobando
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				if (t[i][j] > max) {
					max = t[i][j];
				}
				if (t[i][j] < min) {
					min = t[i][j];
				}
			}
		}

		// Guarda los valores finales
		resultado[0] = min;
		resultado[1] = max;

		// Devuelve el resultado
		return resultado;
	}

	// Método main para probar la función
	public static void main(String[] args) {
		// Variables
		Random rand = new Random();
		int rand1;
		int[][] t = new int[6][10];

		// Rellena el array con numeros aleatorios
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				rand1 = rand.nextInt(0, 1001);
				t[i][j] = rand1;
			}
		}

		// Imprime la solucion final con el resultado de la funcion
		System.out.println(Arrays.toString(maxmin(t)));

	}

}

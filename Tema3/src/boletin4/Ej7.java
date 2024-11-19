package boletin4;

import java.util.Arrays;
import java.util.Random;

public class Ej7 {

	// Función que suma numElementos consecutivos en el array t
	public static int[] maxmin(int[][] t) {
		// La longitud del resultado es (t.length - numElementos + 1)
		int[] resultado = new int[2];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

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

		resultado[0] = min;
		resultado[1] = max;

		return resultado;
	}

	// Método main para probar la función
	public static void main(String[] args) {
		// Variables
		Random rand = new Random();
		int rand1;

		int[][] t = new int[6][10];

		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				rand1 = rand.nextInt(0, 1001);
				t[i][j] = rand1;
			}
		}

		System.out.println(Arrays.toString(maxmin(t)));

	}

}

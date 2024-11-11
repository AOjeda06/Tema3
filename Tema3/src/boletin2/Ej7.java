package boletin2;

import java.util.Arrays;

public class Ej7 {

	public static void main(String[] args) {
		// Variables
		int length = 0;
		int index = 0;
		int[] array;

		// Calcular la longitud del array
		for (int i = 1; i <= 10; i++) {
			length += i;
		}
		// Crear el array
		array = new int[length];
		// Rellenar el array con la secuencia de valores
		for (int i = 1; i <= 10; i++) {
			Arrays.fill(array, index, index + i, i);
			index += i;
		}
		// Mostrar el array por pantalla
		System.out.println(Arrays.toString(array));
	}

}

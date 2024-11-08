package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ej3 {

	public static void main(String[] args) {
		// Creamos el random
		Random rand = new Random();

		// Variables
		int lista[] = new int[30];
		int random;

		// Crea un numero aleatorio y se lo asigna a una posicion dentro de la tabla
		for (int i = 0; i < lista.length; i++) {
			random = rand.nextInt(0, 10);
			lista[i] = random;
		}

		// Ordena la lista
		Arrays.sort(lista);

		// Imprime la lista
		System.out.println(Arrays.toString(lista));

	}

}

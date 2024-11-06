package parte1;

import java.util.Random;

public class Ej1 {

	public static void main(String[] args) {

		// Creamos el random
		Random rand = new Random();

		// Variables
		int lista[] = new int[10];
		int random;

		// Crea un numero aleatorio y se lo asigna a una posicion dentro de la tabla
		for (int i = 0; i < lista.length; i++) {
			random = rand.nextInt(1, 101);
			lista[i] = random;
		}

		// Imprime la tabla
		for (int valor : lista) {
			System.out.print(valor + " ");
		}
	}

}

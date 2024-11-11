package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ej6 {

	public static void main(String[] args) {
		// Creamos el random
		Random rand = new Random();
		// Variables
		int apuesta[] = new int[6];
		int random;
		int ganador[] = { 1, 2, 3, 4, 5, 6 };
		int aciertos = 0;
		// Rellenar el array de apuesta con números aleatorios entre 1 y 49
		for (int i = 0; i < apuesta.length; i++) {
			random = rand.nextInt(49) + 1;
			// Generar número aleatorio entre 1 y 49
			apuesta[i] = random;
		}
		// Ordenar el array de ganador
		Arrays.sort(ganador);
		// Comparar los números de apuesta con los del array ganador
		for (int j = 0; j < apuesta.length; j++) {
			for (int k = 0; k < ganador.length; k++) {
				if (apuesta[j] == ganador[k]) {
					aciertos++;
					break;
					// Salir del bucle interno una vez que se encuentra una coincidencia
				}
			}
		}
		// Imprimir los arrays y el número de aciertos
		System.out.println("Números ganadores: " + Arrays.toString(ganador));
		System.out.println("Tu apuesta: " + Arrays.toString(apuesta));
		System.out.println("Número de aciertos: " + aciertos);
	}
}

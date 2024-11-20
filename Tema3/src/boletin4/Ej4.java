package boletin4;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {

	// Función para crear la tabla
	public static int buscar(int t[], int search) {
		int indice = 0;
		int resultado = -1; // Valor predeterminado en caso de no encontrar el valor

		// Bucle while para recorrer la tabla
		while (indice < t.length) {
			if (t[indice] == search) {
				resultado = indice;
				indice = t.length; // Establecer el índice fuera del rango para salir del bucle
			} else {
				indice++;
			}
		}

		return resultado; // Devuelve la posición encontrada o -1 si no se encontró
	}

	public static void main(String[] args) {
		// Variables
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int rand1 = rand.nextInt(1, 100);
		int rand2;
		int search;

		int t[] = new int[rand1];

		for (int i = 0; i < t.length; i++) {
			rand2 = rand.nextInt(1, 100);
			t[i] = rand2;
		}

		System.out.println("¿Qué número quieres buscar?");
		search = scanner.nextInt();

		System.out.println("El número está en la posición: " + buscar(t, search));

		scanner.close();
	}
}

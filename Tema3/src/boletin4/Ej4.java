package boletin4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej4 {

	// Funcion para crear la tabla
	public static int buscar(int t[], int search) {

		for (int i = 0; i < t.length; i++) {
			if (t[i] == search) {
				return i;
			}
		}

		return -1;
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

		System.out.println("¿Qué numero quieres buscar?");
		search = scanner.nextInt();

		System.out.println("El numero está en la posicion: " + buscar(t, search));

		scanner.close();

	}

}

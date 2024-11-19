package boletin4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej6 {

	// Función que suma numElementos consecutivos en el array t
	public static int[] suma(int[] t, int numElementos) {
		// La longitud del resultado es (t.length - numElementos + 1)
		int[] resultado = new int[t.length - numElementos + 1];

		// Calcular las sumas de los grupos de numElementos consecutivos
		for (int i = 0; i <= t.length - numElementos; i++) {
			int temp = 0;
			for (int j = 0; j < numElementos; j++) {
				temp += t[i + j];
			}
			resultado[i] = temp;
		}

		return resultado;
	}

	// Método main para probar la función
	public static void main(String[] args) {
		// Variables
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int rand1 = rand.nextInt(1, 10);
		int rand2;
		int cantidad;

		int[] t = new int[rand1];

		for (int i = 0; i < t.length; i++) {
			rand2 = rand.nextInt(1, 10);
			t[i] = rand2;
		}

		System.out.println("¿En qué cantidad quieres agrupar los números del array?");
		cantidad = scanner.nextInt();

		// Verificar que la cantidad es válida
		if (cantidad <= 0 || cantidad > t.length) {
			System.out.println("La cantidad debe estar entre 1 y " + t.length);
		} else {
			System.out.println(Arrays.toString(suma(t, cantidad)));
		}

		// Para comprobar que ha funcionado correctamente
		System.out.println(Arrays.toString(t));

		// Cerramos el scanner
		scanner.close();
	}
}

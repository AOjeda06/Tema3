package boletin5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej1 {

	// Función que busca el valor en el array
	public static boolean buscar(int[][] t, int valor) {
		// Variables
		boolean existe = false;

		// Recorre el array buscando el numero
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < t[i].length; j++) {
					if (valor == t[i][j]) {
						existe = true;
					}
				}
			}
		// Devuelve el valor del booleano
		return existe;
	}

	// Método main para probar la función
	public static void main(String[] args) {
		// Variables
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int rand1;
		int[][] t = new int[10][10];
		int busca;

		// Rellena el array con numeros aleatorios
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				rand1 = rand.nextInt(0, 1001);
				t[i][j] = rand1;
			}
		}
		
		// Para comprobar el funcionamiento imprime el array
		System.out.println(Arrays.deepToString(t));

		// Pide y guarda el numero a buscar
		System.out.println("Indica el numero a buscar en el array: ");
		busca = scanner.nextInt();

		// Llama a la funcion y imprime el valor del booleano a devolver
		System.out.println(buscar(t, busca));

		// Cerramos el scanner
		scanner.close();
	}

}

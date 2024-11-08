package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int num;
		int lista[] = new int[20];
		int lista1[];
		int lista2[];

		// Bucle for para guardar en un array los 20 numeros
		for (int i = 0; i < lista.length; i++) {

			// Pide el numero
			System.out.println("Escribe un numero: ");

			// Lee el numero
			num = scanner.nextInt();

			// Asigna el numero a la posicion actual de la tabla
			lista[i] = num;

		}

		// Copia a lista 1 los 10 primeros digitos de lista
		lista1 = Arrays.copyOfRange(lista, 0, 10);

		// Copia a lista 2 los 10 ultimos digitos de lista
		lista2 = Arrays.copyOfRange(lista, 10, 20);

		// Compara e imprime el resultado
		System.out.println(Arrays.equals(lista1, lista2));

		// Cerramos el scanner
		scanner.close();
	}

}

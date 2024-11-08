package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int tamaño;
		int valor;
		int tabla[];

		// Pide y guarda el tamaño
		System.out.println("Indica un tamaño: ");
		tamaño = scanner.nextInt();

		// Pide y guarda el valor para rellenar
		System.out.println("Indica un valor: ");
		valor = scanner.nextInt();

		// Crea el array con el tamaño indicado y lo rellena con el valor
		tabla = new int[tamaño];
		Arrays.fill(tabla, valor);

		// Imprime en forma de String el contenido del array
		System.out.println(Arrays.toString(tabla));

		// Cerramos el scanner
		scanner.close();
	}

}

package boletin2;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// Creamos el random
		Random rand = new Random();

		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int lista[] = new int[1000];
		int random;
		int num;
		int pos = 0;
		int contador = 0;

		// Crea un numero aleatorio y se lo asigna a una posicion dentro de la tabla
		for (int i = 0; i < lista.length; i++) {
			random = rand.nextInt(0, 100);
			lista[i] = random;
		}

		// Pide el numero a buscar
		System.out.println("Escribe un numero entre 0 y 99: ");
		num = scanner.nextInt();

		// Hace una busqueda secuencial donde va escribiendo las posiciones en las que
		// se encuentra
		for (int j = 0; j < lista.length; j++) {
			if (num == lista[j]) {
				System.out.println(pos);
				contador++;
			}
			pos++;
		}

		// Dice si se encuentra o no y cuantas veces
		if (contador > 0) {
			System.out.println("El numero ha sido encontrado " + contador + " veces");
		} else {
			System.out.println("El numero no existe dentro de la tabla");
		}

		scanner.close();

	}

}

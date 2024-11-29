package boletin6;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		char t[][] = new char[3][3];
		int fila;
		int col;
		boolean win = false;
		int cont = 0;
		char ficha = 0;

		// Inicializamos el tablero
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = '-';
			}
		}

		// Bucle principal del juego
		while (!win) {
			// Determinar la ficha (X o O) según el contador
			if (cont % 2 == 0) {
				ficha = 'X';
			} else {
				ficha = 'O';
			}

			// Imprimir el tablero
			for (char fil[] : t) {
				for (char colu : fil) {
					System.out.print(colu + " ");
				}
				System.out.println();
			}

			System.out.println();

			// Pedir la posición al usuario
			System.out.println("En qué fila vas a colocar tu ficha?");
			fila = scanner.nextInt();

			System.out.println("En qué columna vas a colocar tu ficha?");
			col = scanner.nextInt();

			// Colocar la ficha en la posición indicada
			if (t[fila][col] == '-') {
				t[fila][col] = ficha;
			} else {
				System.out.println("Posición ocupada, elige otra.");
				continue;
			}

			// Verificar si hay un ganador
			win = gana(t);

			// Incrementar el contador
			cont++;
		}

		System.out.println("¡Ganador: " + ficha + "!");

		// Cerramos el scanner
		scanner.close();

		// Imprimir el tablero
		for (char fil[] : t) {
			for (char colu : fil) {
				System.out.print(colu + " ");
			}
			System.out.println();
		}
	}

	public static boolean gana(char t[][]) {
		// Variable
		boolean fin = false;

		// Comprobar filas
		for (int i = 0; i < 3; i++) {
			if (t[i][0] == t[i][1] && t[i][1] == t[i][2] && t[i][0] != '-') {
				fin = true;
			}
		}

		// Comprobar columnas
		for (int i = 0; i < 3; i++) {
			if (t[0][i] == t[1][i] && t[1][i] == t[2][i] && t[0][i] != '-') {
				fin = true;
			}
		}

		// Comprobar diagonales
		if (t[0][0] == t[1][1] && t[1][1] == t[2][2] && t[0][0] != '-') {
			fin = true;
		}
		if (t[0][2] == t[1][1] && t[1][1] == t[2][0] && t[0][2] != '-') {
			fin = true;
		}

		// Si no hay ganador
		return fin;
	}
}

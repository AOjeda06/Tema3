package boletin5;

import java.util.Scanner;

public class Ej4 {

	public static char[][] dama(int posFila, int posCol, char t[][]) {
		// Utilza la función de relleno de la torre
		for (int i = 0; i < t.length; i++) {
			t[posFila][i] = 'X';
			t[i][posCol] = 'X';
		}

		// Utiliza la funcion de relleno del alfil
		for (int i = 0; i < t.length; i++) {
			if (posFila - i >= 0 && posCol - i >= 0) {
				t[posFila - i][posCol - i] = 'X'; // Diagonal superior izquierda
			}
			if (posFila + i < t.length && posCol - i >= 0) {
				t[posFila + i][posCol - i] = 'X'; // Diagonal inferior izquierda
			}
			if (posFila + i < t.length && posCol + i < t[0].length) {
				t[posFila + i][posCol + i] = 'X'; // Diagonal inferior derecha
			}
			if (posFila - i >= 0 && posCol + i < t[0].length) {
				t[posFila - i][posCol + i] = 'X'; // Diagonal superior derecha
			}
		}

		// Coloca la pieza en el tablero
		t[posFila][posCol] = 'D';

		// Devuelve el array con la ficha y las 'X' colocadas
		return t;
	}

	public static char[][] caballo(int posFila, int posCol, char t[][]) {

		// Comprueba la viabilidad de rellenar la casilla y la rellena si es posible
		if (posFila - 1 >= 0 && posCol - 2 >= 0) {
			t[posFila - 1][posCol - 2] = 'X';
		}
		if (posFila - 2 >= 0 && posCol - 1 >= 0) {
			t[posFila - 2][posCol - 1] = 'X';
		}
		if (posFila + 1 < t.length && posCol - 2 >= 0) {
			t[posFila + 1][posCol - 2] = 'X';
		}
		if (posFila + 2 < t.length && posCol - 1 >= 0) {
			t[posFila + 2][posCol - 1] = 'X';
		}
		if (posFila - 2 >= 0 && posCol + 1 < t.length) {
			t[posFila - 2][posCol + 1] = 'X';
		}
		if (posFila - 1 >= 0 && posCol + 2 < t.length) {
			t[posFila - 1][posCol + 2] = 'X';
		}
		if (posFila + 1 < t.length && posCol + 2 < t.length) {
			t[posFila + 1][posCol + 2] = 'X';
		}
		if (posFila + 2 < t.length && posCol + 1 < t.length) {
			t[posFila + 2][posCol + 1] = 'X';
		}

		// Coloca la pieza en el tablero
		t[posFila][posCol] = 'C';

		// Devuelve el array con la ficha y las 'X' colocadas
		return t;
	}

	public static char[][] alfil(int posFila, int posCol, char t[][]) {

		// Recorre el array rellenando las casillas cuando sea posible
		for (int i = 0; i < t.length; i++) {
			if (posFila - i >= 0 && posCol - i >= 0) {
				t[posFila - i][posCol - i] = 'X'; // Diagonal superior izquierda
			}
			if (posFila + i < t.length && posCol - i >= 0) {
				t[posFila + i][posCol - i] = 'X'; // Diagonal inferior izquierda
			}
			if (posFila + i < t.length && posCol + i < t[0].length) {
				t[posFila + i][posCol + i] = 'X'; // Diagonal inferior derecha
			}
			if (posFila - i >= 0 && posCol + i < t[0].length) {
				t[posFila - i][posCol + i] = 'X'; // Diagonal superior derecha
			}
		}

		// Coloca la pieza en el tablero
		t[posFila][posCol] = 'A';

		// Devuelve el array con la ficha y las 'X' colocadas
		return t;
	}

	public static char[][] torre(int posFila, int posCol, char t[][]) {

		// Recorre el array rellenando la columna y la fila de la ficha enteras
		for (int i = 0; i < t.length; i++) {
			t[posFila][i] = 'X';
			t[i][posCol] = 'X';
		}

		// Coloca la pieza en el tablero
		t[posFila][posCol] = 'T';

		// Devuelve el array con la ficha y las 'X' colocadas
		return t;
	}

	// Método main para probar la función
	public static void main(String[] args) {
		// Variables
		Scanner scanner = new Scanner(System.in);
		char pieza;
		int posFila;
		int posCol;
		char tablero[][] = new char[8][8];

		// Rellena el array con '#'
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '#';
			}
		}

		// Pide el tipo de pieza
		System.out.println("Indique el tipo de pieza: ");
		pieza = scanner.next().charAt(0);

		// Pide la posicion de la ficha
		System.out.println("Indica la columna en la que se encuentra (0-7): ");
		posCol = scanner.nextInt();

		System.out.println("Indica la fila en la que se encuentra (0-7): ");
		posFila = scanner.nextInt();

		// Llama a la funcion correspondiente a cada ficha
		switch (pieza) {
		case 'A' -> {
			tablero = alfil(posFila, posCol, tablero);
		}
		case 'T' -> {
			tablero = torre(posFila, posCol, tablero);

		}
		case 'C' -> {
			tablero = caballo(posFila, posCol, tablero);

		}
		case 'D' -> {
			tablero = dama(posFila, posCol, tablero);

		}
		}

		// Imprime el array
		for (char fila[] : tablero) {
			for (char col : fila) {
				System.out.print(col + " ");

			}
			System.out.println();
		}

		// Cierra el scanner
		scanner.close();
	}

}

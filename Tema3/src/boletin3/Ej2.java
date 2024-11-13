package boletin3;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		double tabla[][] = new double[4][5];
		double num;
		double min;
		double max;
		double med;

		// Recorre las filas
		for (int fila = 0; fila < tabla.length; fila++) {
			// Pide las notas del alumno
			System.out.println("Introduzca las notas del Alumno " + (fila + 1));
			// Recorre las columnas
			for (int col = 0; col < tabla[fila].length; col++) {
				// Lee, guarda y asigna valores
				System.out.println("Nota para la asignatura " + (col + 1));
				num = scanner.nextDouble();
				tabla[fila][col] = num;
			}
		}

		// Mostrar encabezados de columnas
		System.out.print("\t \t");
		for (int col = 0; col < tabla[0].length; col++) {
			System.out.print("Nota " + (col + 1) + "\t");
		}
		System.out.println();

		// Mostrar la tabla completa
		for (int fila = 0; fila < tabla.length; fila++) {
			System.out.print("Alumno " + (fila + 1) + "\t");
			for (int col = 0; col < tabla[fila].length; col++) {
				System.out.print(tabla[fila][col] + "\t");
			}
			System.out.println();
		}

		// Recorre de nuevo las filas para calcular medias, mínimos y máximos
		for (int i = 0; i < tabla.length; i++) {
			// Fija los valores al inicio de cada iteracion
			med = 0;
			min = Double.MAX_VALUE;
			max = Double.MIN_VALUE;

			// Recorre las columnas calculando y sumando
			for (double valor : tabla[i]) {
				med += valor;
				if (valor > max) {
					max = valor;
				}
				if (valor < min) {
					min = valor;
				}
			}
			// Calcular la media
			med /= tabla[i].length;

			// Imprime el resultado
			System.out.println("La nota media del Alumno " + (i + 1) + " es: " + med);
			System.out.println("La nota mínima del Alumno " + (i + 1) + " es: " + min);
			System.out.println("La nota máxima del Alumno " + (i + 1) + " es: " + max);
		}

		// Cerramos el scanner
		scanner.close();
	}

}

package aceptaelreto;

import java.util.Scanner;

public class BarJavier {

	public static void main(String[] args) {
		// Declaramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		String[] cat = { "Desayunos", "Comidas", "Meriendas", "Cenas", "Copas" };
		String codIn;
		double ventas;
		double[] beneficio = new double[5];
		double max = Double.NEGATIVE_INFINITY;
		double min = Double.POSITIVE_INFINITY;
		double media;
		int maxIndex = 0;
		int minIndex = 0;
		int contador = 0;
		boolean empate = false;

		// Enunciado inicial
		System.out.println("Introduzca código e importe: ");

		// Bucle principal para recoger los valores de beneficios del dia
		do {

			// Guarda los valores de la letra del codigo y de su beneficio correspondiente
			codIn = scanner.next();
			ventas = scanner.nextDouble();

			// Guarda el beneficio en su categoria correspondiente
			switch (codIn) {
			case "D" -> {
				beneficio[0] += ventas;
			}
			case "A" -> {
				beneficio[1] += ventas;
			}
			case "M" -> {
				beneficio[2] += ventas;
			}
			case "I" -> {
				beneficio[3] += ventas;
			}
			case "C" -> {
				beneficio[4] += ventas;
			}
			}

			// Cuando introduzca "N 0" se finaliza el bucle y procede al recuento
		} while (!codIn.equals("N") || ventas != 0);

		// Recorremos el array de los beneficios para definir qué comidas han tenido los
		// maximos/minimos beneficios y en qué cantidad
		for (int i = 0; i < beneficio.length; i++) {
			if (beneficio[i] > max) {
				max = beneficio[i];
				maxIndex = i;
			}
			if (beneficio[i] < min) {
				min = beneficio[i];
				minIndex = i;
			}
		}

		// Calcula la media
		media = (beneficio[0] + beneficio[1] + beneficio[2] + beneficio[3] + beneficio[4]) / 5;

		// Verifica si hay más de una categoría con 0 beneficios para el empate
		for (int i = 0; i < beneficio.length; i++) {
			if (beneficio[i] == min) {
				contador++;
				if (contador > 1) {
					empate = true;
				}
			}
		}

		// Imprime el resultado
		System.out.print(cat[maxIndex] + "#");
		System.out.print(empate ? "Empate#" : cat[minIndex] + "#");
		System.out.print(beneficio[1] > media ? "Si" : "No");

		// Cerramos el scanner
		scanner.close();
	}
}

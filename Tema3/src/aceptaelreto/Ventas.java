package aceptaelreto;

import java.util.Scanner;

public class Ventas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Día de la semana
		String[] dias = { "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" };

		while (true) {
			double[] ventas = new double[6]; // Array para las ventas de martes a domingo

			// Leer ventas de la semana
			for (int i = 0; i < ventas.length; i++) {
				ventas[i] = scanner.nextDouble();
				if (i == 0 && ventas[i] == -1) { // Si el primer día es -1, terminar el programa
					scanner.close();
					return;
				}
			}

			// Determinar el día de mayor y menor venta
			double maxVentas = ventas[0];
			double minVentas = ventas[0];
			String diaMax = dias[0];
			String diaMin = dias[0];
			boolean empateMax = false;
			boolean empateMin = false;

			for (int i = 1; i < ventas.length; i++) {
				if (ventas[i] > maxVentas) {
					maxVentas = ventas[i];
					diaMax = dias[i];
					empateMax = false;
				} else if (ventas[i] == maxVentas) {
					empateMax = true;
				}

				if (ventas[i] < minVentas) {
					minVentas = ventas[i];
					diaMin = dias[i];
					empateMin = false;
				} else if (ventas[i] == minVentas) {
					empateMin = true;
				}
			}

			// Calcula la media semanal
			int sumaVentas = 0;
			for (int i = 0; i < ventas.length; i++) {
				sumaVentas += ventas[i];
			}
			double media = sumaVentas / 6.0;

			// Verificar si las ventas del domingo superan la media
			String superaMedia = (ventas[5] > media) ? "SI" : "NO";

			// Mostrar resultados
			if (empateMax) {
				diaMax = "EMPATE";
			}
			if (empateMin) {
				diaMin = "EMPATE";
			}

			System.out.println(diaMax + " " + diaMin + " " + superaMedia);
		}
	}
}

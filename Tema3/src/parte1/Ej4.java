package parte1;

public class Ej4 {

	public static void main(String[] args) {
		// Variables
		int num[] = new int[12];

		// Asignacion de valores
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// Escribe todos los numeros de la tabla de la posicion 0 a la 12
		for (int valor : num) {
			System.out.print(valor + " ");
		}
	}

}

package english;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Scanner creation
		Scanner scanner = new Scanner(System.in);

		// Variables declaration
		String opt = null;
		int array[] = new int[10];
		int v;
		int p;

		do {
			// Shows menu options
			System.out.println("a. Show values");
			System.out.println("b. Introduce a value");
			System.out.println("c. Exit");

			// Reads selected option
			opt = scanner.nextLine();

			// Estethic
			System.out.println();

			// Case b
			if (opt.equalsIgnoreCase("b")) {
				// Ask for v
				System.out.println("Whats the value?");
				v = scanner.nextInt();

				// Ask for p
				System.out.println("Whats the position (0-9)?");
				p = scanner.nextInt();

				// Set the value v in p position
				array[p] = v;

				// Esthetic
				System.out.println();
				System.out.println();

				// Cleans buffer
				scanner.nextLine();
			}

			// Case a
			if (opt.equalsIgnoreCase("a")) {
				// For-each with syso
				for (int valor : array) {
					System.out.print(valor + " ");
				}

				// Estethic
				System.out.println();
				System.out.println();
			}

			// If option c is selected, program is terminated
		} while (opt.equalsIgnoreCase("a") || opt.equalsIgnoreCase("b"));

		// Final message
		System.out.println("Program terminated");

		// Scanner close
		scanner.close();
	}

}

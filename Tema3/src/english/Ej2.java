package english;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);

		// Variable declaration
		int v;
		int i;
		int length;
		int sequence[];

		// Ask for initial value
		System.out.print("Introduce intial value (V): ");
		v = scanner.nextInt();

		// Ask for the difference between each number
		System.out.print("Introduce the sum (I): ");
		i = scanner.nextInt();

		// Ask for the length of the array
		System.out.print("Introduce the leght of the array: ");
		length = scanner.nextInt();

		// Define array's length
		sequence = new int[length];

		// Fill the array
		for (int j = 0; j < length; j++) {
			sequence[j] = v + (i * j);
		}

		// Show array
		System.out.println("Result:");
		for (int value : sequence) {
			System.out.print(value + " ");
		}

		// Close scanner
		scanner.close();
	}
}

//5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class five {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		while (true) {
			System.out.print("Enter a number (or 'x' to exit): ");
			String input = sc.nextLine();

			if (input.equals("x") || input.equals("X")) {
				break;
			}

			try {
				int number = Integer.parseInt(input);
				sum += number;
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter a valid number or 'x' to exit.");
			}
		}

		System.out.println("Sum of all numbers is: " + sum);

		sc.close();
	}
}
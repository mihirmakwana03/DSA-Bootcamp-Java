//25. Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class L25_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, max = Integer.MIN_VALUE; 

		while (true) {
			System.out.print("Enter a number: ");
			n = sc.nextInt();

			if (n == 0) {
				break; 
			}

			if (n > max) {
				max = n; 
			}
		}

		if (max == Integer.MIN_VALUE) {
			System.out.println("No valid numbers were entered.");
		} else {
			System.out.println("The largest number is: " + max);
		}

		sc.close();
	}
}

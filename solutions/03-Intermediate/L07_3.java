//7. Power In Java

import java.util.Scanner;
public class L07_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base number: ");
		int b = sc.nextInt();
		System.out.print("Enter the power number: ");
		int up = sc.nextInt();

		int result = 1;
		for (int i = 0; i < up; i++) {
			result *= b;
		}

		System.out.println("The result is: " + result);
	}
}

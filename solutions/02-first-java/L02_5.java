//5. Take 2 numbers as input and print the largest number.

import java.util.*;

public class L02_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.println(a > b ? a : b);
	}
}

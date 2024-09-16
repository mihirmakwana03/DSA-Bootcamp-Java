//4. [Write a program to print the sum of two numbers entered by user by defining your own method.]

import java.util.*;

public class L04_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.println(sum(a, b));
	}

	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}

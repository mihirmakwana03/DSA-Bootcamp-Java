//4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.*;

public class L02_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter an Operator(+,-,*,/): ");
		char o = sc.next().charAt(0);

		if (o == '+') {
			System.out.println("Result: " + (a + b));
		} else if (o == '-') {
			System.out.println("Result: " + (a - b));
		} else if (o == '*') {
			System.out.println("Result: " + (a * b));
		} else if (o == '/') {
			System.out.println("Result: " + (a / b));
		} else {
			System.out.println("Invalid operator");
		}
	}
}
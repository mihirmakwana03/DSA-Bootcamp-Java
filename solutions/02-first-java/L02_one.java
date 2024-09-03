//1. Write a program to print whether a number is even or odd, also take input from the user.

import java.util.*;
public class L02_one {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		String result = (n % 2 == 0) ? "Even" : "Odd";
		System.out.println("The number is " + result);

		sc.close();
	}
}

//14. [Write a function that returns the sum of first n natural numbers.]

import java.util.*;

public class L14_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		int sum = natural(n);
		System.out.println("Sum of first " + n + " natural numbers is: " + sum);

		sc.close();
	}

	static int natural(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;

	}
}
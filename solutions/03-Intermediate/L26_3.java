//26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;
public class L26_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sumNeg = 0, sumPosEven = 0, sumPosOdd = 0;
		while (true) {
			System.out.print("Enter a number: ");
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			if (n < 0) {
				sumNeg += n;
			} else if (n % 2 == 0) {
				sumPosEven += n;
			} else {
				sumPosOdd += n;
			}
		}
		System.out.println("Sum of negative numbers: " + sumNeg);
		System.out.println("Sum of positive even numbers: " + sumPosEven);
		System.out.println("Sum of positive odd numbers: " + sumPosOdd);
		sc.close();
	}
}

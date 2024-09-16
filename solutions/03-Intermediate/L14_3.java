//14. Armstrong Number In Java

import java.util.*;
public class L14_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;

		while (temp > 0) {
			int rem = temp % 10;
			sum += rem * rem * rem;
			temp /= 10;
		}

		if (sum == n) {
			System.out.println(n + " is an Armstrong number.");
		} else {
			System.out.println(n + " is not an Armstrong number.");
		}

		sc.close();
	}
}

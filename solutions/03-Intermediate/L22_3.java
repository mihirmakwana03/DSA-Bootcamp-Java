//22. Perfect Number In Java

import java.util.Scanner;
public class L22_3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			System.out.println(n + " is a perfect number.");
		} else {
			System.out.println(n + " is not a perfect number.");
		}
}	
}

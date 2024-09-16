//9. To find Armstrong Number between two given number.

import java.util.Scanner;

public class L02_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Get the range from the user
		System.out.print("Enter the start of the range: ");
		int start = sc.nextInt();
		System.out.print("Enter the end of the range: ");
		int end = sc.nextInt();

		System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

		// Iterate through the range and check for Armstrong numbers
		for (int i = start; i <= end; i++) {
			if (isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}

	// Method to check if a number is an Armstrong number
	public static boolean isArmstrong(int num) {
		int originalNum = num;
		int sum = 0;
		int digits = String.valueOf(num).length();

		while (num != 0) {
			int rem = num % 10;
			sum += Math.pow(rem, digits);
			num /= 10;
		}

		return sum == originalNum;
	}
}

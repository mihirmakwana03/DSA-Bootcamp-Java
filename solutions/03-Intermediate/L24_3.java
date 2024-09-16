//24. Sum Of A Digits Of Number

import java.util.Scanner;
public class L24_3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;

		while (temp != 0) {
			int digit = temp % 10;
			sum += digit;
			temp /= 10;
		}

		System.out.println("Sum of digits of " + n + " is " + sum);

		sc.close();
	}
}

//17. Find if a number is palindrome or not 

import java.util.*;

public class L17_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;

		for (int i = 0; i < n; i++) {
			int reversed = 0;
			while (temp != 0) {
				int digit = temp % 10;
				reversed = reversed * 10 + digit;
				temp /= 10;
			}
			if (reversed == n) {
				System.out.println(n + " is a palindrome number.");
				break;
			} else {
				System.out.println(n + " is not a palindrome number.");
				break;
			}
		}

		sc.close();
	}
}
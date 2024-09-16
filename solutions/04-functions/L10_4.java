//10. [Write a function to find if a number is a palindrome or not. Take number as parameter.]

import java.util.*;
public class L10_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		sc.close(); // Close the scanner to prevent resource leak

		if (isPalindrome(n)) {
			System.out.println(n + " is a palindrome number.");
		} else {
			System.out.println(n + " is not a palindrome number.");
		}
	}

	static boolean isPalindrome(int n){
		int original = n;
		int reversed = 0;
		while (n != 0) {
			int rem = n % 10;
			reversed = reversed * 10 + rem;
			n = n / 10;
		}
		return original == reversed;
	}
}

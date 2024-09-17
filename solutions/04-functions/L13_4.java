//13. [Write a function that returns all prime numbers between two given numbers.]

import java.util.*;

public class L13_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter starting of series: ");
		int a = sc.nextInt();
		System.out.print("Enter ending of series: ");
		int b = sc.nextInt();

		isPalindrome(a, b);
		sc.close(); 
	}

	static void isPalindrome(int a, int b) { 
		for (int i = a; i <= b; i++) {
			int original = i; 
			int reversed = 0;

			int temp = i; 
			while(temp != 0){ 
				int rem = temp % 10;
				reversed = reversed * 10 + rem;
				temp /= 10;
			}

			if (original == reversed) { 
				System.out.println(original + " is a palindrome.");
			}
		}
	}
}

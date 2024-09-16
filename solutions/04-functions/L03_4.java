//3. [A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.]

import java.util.*;

public class L03_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int n = sc.nextInt();

		ageCheck(n);
	}

	static void ageCheck(int n) {
		if (n >= 18) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not Eligible");
		}
	}
}

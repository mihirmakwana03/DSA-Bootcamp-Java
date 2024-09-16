//12. [Write a function to check if a given triplet is a Pythagorean triplet or not.]

import java.util.*;
public class L12_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (isPythagoreanTriplet(a, b, c)) {
			System.out.println("The given triplet is a Pythagorean triplet.");
		} else {
			System.out.println("The given triplet is not a Pythagorean triplet.");
		}
	}

	static boolean isPythagoreanTriplet(int a, int b, int c){
		if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
			return true;
		}
		return false;
	}
}

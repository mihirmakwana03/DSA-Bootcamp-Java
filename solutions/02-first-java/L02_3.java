//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class L02_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float p, t, r;

		System.out.print("Enter Principal Amount: ");
		p = sc.nextFloat();
		System.out.print("Enter Time Duration (in years): ");
		t = sc.nextFloat();
		System.out.print("Enter Rate of Interest (per annum): ");
		r = sc.nextFloat();

		float SI = (p * t * r) / 100;
		System.out.println("Simple Interest is: " + SI);

		sc.close();
	}
}

//4. Take 2 numbers as inputs and find their HCF and LCM.

import java.util.*;

public class four {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter fisrt number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		int originalA = a;
		int originalB = b;

		// HCF
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		int hcf = a;
		System.out.println("HCF is " + hcf);

		// LCM
		int lcm = (originalA * originalB) / hcf;
		System.out.println("LCM is " + lcm);

		sc.close();
	}
}

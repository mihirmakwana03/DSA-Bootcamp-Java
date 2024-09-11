//25. Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.*;
import java.util.Scanner;

public class L25_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, x, m;
		System.out.println("Enter a number: ");
		while (true) {
			n = sc.nextInt();
			x = n;
			if (n > x) {
				m = n;
			}
			if (n == 0) {
				break;
			}
		}
		System.out.println("Max is: " + m);
	}
}

//21. Fibonacci Series In Java Programs

import java.util.*;

public class L21_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int x = sc.nextInt();

		int f = 0, s = 1, fib = 0;
		System.out.print(f + " " + s);
		for (int i = 1; i <= x-2; i++) {
			fib = f + s;
			System.out.print(" " + fib);
			f = s;
			s = fib;
		}
	}
}

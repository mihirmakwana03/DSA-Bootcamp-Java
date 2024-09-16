//7. To calculate Fibonacci Series up to n numbers.

import java.util.*;

public class L02_7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = sc.nextInt();

		int a = 0, b = 1, f = 0; 

		if (x >= 2) {
			System.out.print(a + ", " + b + ", ");
			for (int i = 1; i <= x; i++) {
				System.out.print(f + ", ");
				a = b;
				b = f;
				f = a + b;
			}
		}

		sc.close();
	}
}
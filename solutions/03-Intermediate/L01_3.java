//1. Factorial Program In Java

import java.util.*;

public class L01_3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int x=1;
		for (int i = 1; i <= n; i++) {
			x *= i;
		}
		System.out.println(x);
	}
}

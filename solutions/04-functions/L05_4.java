//5. [Define a method that returns the product of two numbers entered by user.]

import java.util.*;
public class L05_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first no: ");
		int a = sc.nextInt();
		System.out.print("Enter second no: ");
		int b = sc.nextInt();

		System.out.println(product(a,b));
	}

	static int product(int a, int b){
		return a*b;
	}
}

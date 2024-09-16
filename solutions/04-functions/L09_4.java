/*
9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.]

Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.- 
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1

*/

import java.util.*;

public class L09_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();


		Factorial(n);
	}

	static void Factorial(int n){
		
		int fact = 1;
		if(n!=0){
			for (int i = 1; i <=n; i++) {
				fact*=i;
			}
			System.out.println(fact);
		}
	}
}

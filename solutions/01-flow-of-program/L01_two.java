// 2. Take two numbers and print the sum of both.

import java.util.Scanner;
class two{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.println("Sum = "+(a+b));
	}
}
//2. [Define a program to find out whether a given number is even or odd.]

import java.util.*;
public class L02_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		isEvenOdd(n);
	}

	static int isEvenOdd(int n){
		if(n%2==0){
			System.out.print("Even");
		}
		else{
			System.out.print("Odd");
		}
	}
}

//24. Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.*;

class L24_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n, sum= 0;
		while (true) {
			n = sc.nextInt();
			sum+= n;
			if(n==0){
				break;
			}
		}
		System.out.println("Sum of all numbers is: "+sum);
	}
}
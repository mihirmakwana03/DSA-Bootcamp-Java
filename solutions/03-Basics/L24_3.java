//24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.*;

public class L24_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n,sum=0;

		while (true) {
			System.out.print("Enter a number: ");
			n = sc.nextInt();
			sum+=n;

			if(n==0){
				break;
			}
			
		}
		System.out.println(sum);

		sc.close();
	}
}

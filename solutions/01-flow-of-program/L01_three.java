//3. Take a number as input and print the multiplication table for it.

import java.util.*;
public class three {
	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);

		System.out.print("Enter a number: ");
		int a  = sc.nextInt();

		for(int i = 1; i<=10;i++){
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}

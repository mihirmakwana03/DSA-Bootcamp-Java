//1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.]

import java.util.*;
public class L01_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		maxMin(a, b, c);
		sc.close();

	}

	static void maxMin(int a, int b, int c){
		int max = a;
		if(b>max){
			max = b;
		}
		if(c>max){
			max = c;
		}
		System.out.println("Maximum number is: " + max);
		int min = a;	
		if(b<min){
			min = b;
		}
		if(c<min){
			min = c;
		}
		System.out.println("Minimum number is: " + min);
	}
}
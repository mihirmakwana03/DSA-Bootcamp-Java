//7. [Define a method to find out if a number is prime or not.]

import java.util.*;
public class L07_4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		isPrime(n);
	}

	static void isPrime(int n){
		int flag = 0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag = 1;
				break;
			}
		}

		if(flag==0){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
		
	}
}

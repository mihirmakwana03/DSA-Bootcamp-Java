//2. Take name as input and print a greeting message for that particular name.

import java.util.*;

public class L02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.println("Welcome, " + name);
	}
}

//2. Area Of Triangle

import java.util.*;
public class L02_3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter height of the triangle: ");
		float h = sc.nextFloat();
		System.out.print("Enter base of the triangle: ");
		float b = sc.nextFloat();

		System.out.println("Area of triangle is: "+(0.5*b*h));
	}
}

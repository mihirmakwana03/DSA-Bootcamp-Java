//6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.]

import java.util.*;

public class L06_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Radius of the Circle: ");
		double r = sc.nextDouble();

		circle(r);
	}

	static void circle(double r) {
		double area = Math.PI * r * r;
		double circumference = 2 * Math.PI * r;

		System.out.println("Circumference is " + circumference);
		System.out.println("Area is " + area);
	}
}

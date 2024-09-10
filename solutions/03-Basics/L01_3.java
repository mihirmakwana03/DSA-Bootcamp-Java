//1. Area Of Circle Java Program

import java.util.*;
class L01_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of the circle(in cm): ");
		float r = sc.nextFloat();

		float pi = 3.14f;

		System.out.println("Area of circle is: "+(pi*r*r)+"cm");
		
		sc.close();
	}
}
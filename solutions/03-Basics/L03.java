//3. Area Of Rectangle Program 

import java.util.Scanner;


import java.util.*;
public class L03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length of the rectangle: ");
		float l = sc.nextFloat();
	
		System.out.print("Enter width of the rectangle: ");
		float w = sc.nextFloat();

		System.out.println("Area of rectangle is: "+(l*w));
	}
}

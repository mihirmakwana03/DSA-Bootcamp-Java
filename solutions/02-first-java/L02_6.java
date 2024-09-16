//6. Input currency in rupees and output in USD.

import java.util.*;

public class L02_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Rupees: ");
		float inr = sc.nextFloat();
		System.out.println("USD: "+(inr/80)+"$");
	}
}

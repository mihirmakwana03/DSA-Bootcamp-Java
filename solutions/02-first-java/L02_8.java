//8. To find out whether the given String is Palindrome or not.

import java.util.*;

public class L02_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String x = sc.next();
		String y = "";

		for (int i = x.length() - 1; i >= 0; --i) {
			y += x.charAt(i);
		}
		System.out.println(x.equals(y) ? true : false);

		sc.close();
	}
}

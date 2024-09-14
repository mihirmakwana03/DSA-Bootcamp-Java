//3. Calculate Average Of N Numbers

import java.util.*;

public class L03_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers you want to average: ");
		int numbers = sc.nextInt(), n, sum = 0;

		for (int i = 1; i <= numbers; i++) {
			System.out.print("Enter number " + i + ": ");
			n = sc.nextInt();
			sum += n;
		}
		System.out.println(sum/numbers);

		sc.close();
	}
}

//25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

// import java.util.Scanner;
public class L25_3 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter the number of days in the month of August: ");
		int n = 31;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println("Kunal can go out on " + count + " days in the month of August.");
		// sc.close();
	}
}

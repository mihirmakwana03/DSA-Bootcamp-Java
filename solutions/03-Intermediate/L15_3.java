//15. Find Ncr & Npr

public class L15_3 {
	public static void main(String[] args) {
		int n = 5;
		int r = 2;

		int ncr = factorial(n) / (factorial(r) * factorial(n - r));
		int npr = factorial(n) / factorial(n - r);

		System.out.println("nCr: " + ncr);
		System.out.println("nPr: " + npr);
		
	}

	public static int factorial(int num) {
		if (num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}
}

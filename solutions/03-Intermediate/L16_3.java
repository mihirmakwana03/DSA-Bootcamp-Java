//16. Reverse A String In Java

public class L16_3 {
	public static void main(String[] args) {
		String str = "Hello World";
		String reversed = reverseString(str);
		System.out.println(reversed);
	}	

	public static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

}

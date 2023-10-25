package iprogrammer;

public class ShowStringReverse_7 {

	public static void main(String[] args) {
		System.out.println(reverseString("mystring"));
	}

	private static String reverseString(String string) {
		return new StringBuilder(string).reverse().toString();
	}

}

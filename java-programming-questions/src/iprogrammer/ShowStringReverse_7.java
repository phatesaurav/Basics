package iprogrammer;

public class ShowStringReverse_7 {

	public static void main(String[] args) {
		System.out.println(reverseString("mystring"));
	}

	private static String reverseString(String string) {
		StringBuilder stringBuilder = new StringBuilder(string);
		return stringBuilder.reverse().toString();
	}

}

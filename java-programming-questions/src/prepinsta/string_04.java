package prepinsta;

// Length of the string without using strlen() function
public class string_04 {
	public static void main(String[] args) {
		int length = 0;

		String s = "prepinsta";
		for (char c1 : s.toCharArray())
			length++;
		System.out.println("Length of String is : " + length);

	}
}

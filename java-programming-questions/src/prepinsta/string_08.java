package prepinsta;

// Check if the given string is Palindrome or not
public class string_08 {
	public static void main(String[] args) {

		String s = "arora";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--)
			rev = rev + s.charAt(i);
		if (s.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");

	}
}

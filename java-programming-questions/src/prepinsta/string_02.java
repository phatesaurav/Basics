package prepinsta;

// Check whether a character is a alphabet or not
public class string_02 {
	public static void main(String[] args) {
		char ch;

		ch = '9';

		// condition for checking characters
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("The inserted character " + ch + " is an Alphabet");
		else
			System.out.println("The inserted character " + ch + " is not an Alphabet");

	} // end of the main method
}

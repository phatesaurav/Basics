package prepinsta;

// Check whether a character is a vowel or consonant
public class string_01 {
	public static void main(String[] args) {
		char c = 'f';

		if (isVowel(c))
			System.out.println(c + " is a vowel ");

		else
			System.out.println(c + " is a consonant ");

	}

	// single function for both uppercase and lowercase
	static boolean isVowel(char c) {
		// converts to uppercase if it wasn't already
		c = Character.toUpperCase(c);

		// returns true if char matches any of below
		return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
	}
}

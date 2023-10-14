package gfg;

public class Palindrome_19 {

	public static void main(String[] args) {
		System.out.println(is_palindrome(555));
	}
	
	public static String is_palindrome(int n) {
		String word = Integer.toString(n);
		StringBuilder reverseWord = new StringBuilder(word).reverse();
		if (word.equals(reverseWord.toString()))
			return "Yes";
		return "No";
	}
}

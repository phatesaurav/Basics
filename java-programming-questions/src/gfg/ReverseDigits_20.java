package gfg;

public class ReverseDigits_20 {

	public static void main(String[] args) {
		System.out.println(reverse_digit(1227));
	}

	public static long reverse_digit(long n) {
		String word = Long.toString(n);
		StringBuilder reverseWord = new StringBuilder(word).reverse();
		return Long.parseLong(reverseWord.toString());
	}
}

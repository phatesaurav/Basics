package gfg;

public class SumOfDigitIsPalindromeOrNot_23 {

	public static void main(String[] args) {
		SumOfDigitIsPalindromeOrNot_23 obj = new SumOfDigitIsPalindromeOrNot_23();
		System.out.println(obj.isDigitSumPalindrome(56));
	}

	int isDigitSumPalindrome(int N) {
		int sum = 0;
		while (N != 0) {
			int remainder = N % 10;
			sum = sum + remainder;
			N = N / 10;
		}

		String word = Integer.toString(sum);
		StringBuilder reverseWord = new StringBuilder(word).reverse();
		if (word.equals(reverseWord.toString())) {
			return 1;
		}
		return 0;
	}
}

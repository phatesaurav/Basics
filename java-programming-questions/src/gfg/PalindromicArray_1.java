package gfg;

public class PalindromicArray_1 {
	public static void main(String[] args) {
		int[] array = {111, 222, 333, 444, 555};
		palinArray(array, 5);
	}

	public static int palinArray(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			String numberAsString = Integer.toString(a[i]);
			StringBuilder reverseWord = new StringBuilder(numberAsString).reverse();

			if (!numberAsString.equals(reverseWord.toString())) {
				return 0; // Return 0 as soon as a non-palindrome is found
			}
		}
		return 1; // Return 1 if all elements are palindromes
	}
}

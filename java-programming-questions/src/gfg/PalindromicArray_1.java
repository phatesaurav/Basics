package gfg;

// Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. 
// Which will return true if all the elements of the Array are palindrome otherwise it will return false.
public class PalindromicArray_1 {
	public static void main(String[] args) {
		int[] array = { 111, 222, 333, 444, 555 };
		System.out.println(palinArray(array, 5));
	}

	public static boolean palinArray(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			String numberAsString = Integer.toString(a[i]);
			StringBuilder reverseWord = new StringBuilder(numberAsString).reverse();

			if (!numberAsString.equals(reverseWord.toString())) {
				return false; // Return false as soon as a non-palindrome element is found
			}
		}
		return true; // Return true if all elements are palindromes
	}
}

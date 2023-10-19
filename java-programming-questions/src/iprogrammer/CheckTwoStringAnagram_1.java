package iprogrammer;

import java.util.Arrays;

public class CheckTwoStringAnagram_1 {

	public static void main(String[] args) {
		System.out.println(checkAnangram("listen", "silent"));
	}

	public static boolean checkAnangram(String s1, String s2) {
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}

}

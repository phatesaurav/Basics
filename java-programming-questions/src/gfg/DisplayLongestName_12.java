package gfg;

public class DisplayLongestName_12 {

	public static void main(String[] args) {
		String names[] = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
		System.out.println(longest(names, 5));
	}

	public static String longest(String names[], int n) {
		int wordLength = 0;
		String longestWord = null;
		for (int i = 0; i < n; i++) {
			if (names[i].length() > wordLength) {
				wordLength = names[i].length();
				longestWord = names[i];
			}
		}
		return longestWord;
	}
}

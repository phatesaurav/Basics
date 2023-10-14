package gfg;

public class UpperCaseConversion_26 {

	public static void main(String[] args) {
		System.out.print(transform("i love programming"));
	}

	public static String transform(String s) {
		String[] words = s.split(" ");
		StringBuilder resultString = new StringBuilder();
		for (String word : words) {
			String upperCasedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
			resultString.append(upperCasedWord + " ");
		}
		return resultString.toString().trim();
	}
}

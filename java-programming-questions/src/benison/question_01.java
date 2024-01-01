package benison;

// remove any given character from string
public class question_01 {
	public static void main(String[] args) {
		String myString = "hello world!";
		char charToRemove = 'o';
		System.out.println(removeCharacter(myString, charToRemove));
	}

	public static String removeCharacter(String myString, char charToRemove) {
		char[] charArray = myString.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != charToRemove) {
				stringBuilder.append(charArray[i]);
			}
		}
		return stringBuilder.toString();
	}
}

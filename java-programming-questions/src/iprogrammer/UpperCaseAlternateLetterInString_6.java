package iprogrammer;

public class UpperCaseAlternateLetterInString_6 {

	public static void main(String[] args) {
		System.out.println(changeCase("mystring"));
		System.out.println(alternateWay("mystring"));
	}

	private static String changeCase(String s) {
		String[] stringArray = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			stringArray[i] = String.valueOf(s.charAt(i));
			if (i % 2 == 0) {
				stringArray[i] = stringArray[i].toUpperCase();
			}
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (String item : stringArray) {
			stringBuilder.append(item);
		}
		return stringBuilder.toString();
	}
	
	private static String alternateWay(String s) {
        StringBuilder result = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

}



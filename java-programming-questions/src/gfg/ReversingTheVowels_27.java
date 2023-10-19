package gfg;

import java.util.ArrayList;
import java.util.List;

public class ReversingTheVowels_27 {

	public static void main(String[] args) {
		System.out.println(modify("meayl"));
	}

	public static String modify(String s) {
		List<Integer> positionList = new ArrayList<>();
		char[] charArray = s.toLowerCase().toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				positionList.add(i);
			}
		}

		if (positionList.size() % 2 == 0) {
			for (int i = 0; i < positionList.size() / 2; i++) {
				char temp = charArray[positionList.get(i)];
				charArray[positionList.get(i)] = charArray[positionList.get(positionList.size() - i - 1)];
				charArray[positionList.get(positionList.size() - i - 1)] = temp;
			}
		} else {
			for (int i = 0; i < positionList.size() / 2 + 1; i++) {
				char temp = charArray[positionList.get(i)];
				charArray[positionList.get(i)] = charArray[positionList.get(positionList.size() - i - 1)];
				charArray[positionList.get(positionList.size() - i - 1)] = temp;
			}
		}

		return new String(charArray);
	}
}

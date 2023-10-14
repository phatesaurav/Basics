package gfg;

public class ReplaceAll0With5_25 {
	public static void main(String[] args) {
		System.out.println(convertFive(1004));
	}

	public static int convertFive(int n) {
		String word = Integer.toString(n);
		String returnWord = word.replace("0", "5");
		return Integer.parseInt(returnWord);
	}
}

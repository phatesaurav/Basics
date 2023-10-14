package gfg;

public class CheckForBinary_18 {

	public static void main(String[] args) {
		System.out.print(isBinary("101"));
	}

	public static boolean isBinary(String str) {
		if (str.contains("0") || str.contains("1")) {
			if (!str.contains("2") && !str.contains("3") && !str.contains("4") && !str.contains("5")
					&& !str.contains("6") && !str.contains("7") && !str.contains("8") && !str.contains("9"))
				return true;
			return false;
		}
		return false;
	}
}

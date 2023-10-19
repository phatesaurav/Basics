package iprogrammer;

public class CheckStrong_5 {

	public static void main(String[] args) {
		System.out.println("Is strong? " + checkStrong(145));
	}

	private static boolean checkStrong(int num) {
		int original = num;
		int sum = 0;
		while (num != 0) {
			int remainder = num % 10;
			sum = sum + factorial(remainder);
			num = num / 10;
		}
		if (sum == original)
			return true;
		return false;
	}

	private static int factorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}

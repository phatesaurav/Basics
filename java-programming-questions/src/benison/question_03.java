package benison;

// print prime number upto given number
public class question_03 {
	public static void main(String[] args) {
		printPrime(83);
	}

	public static void printPrime(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}

	private static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0)
				return false;
		}
		return true;
	}
}

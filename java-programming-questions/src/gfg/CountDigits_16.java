package gfg;

public class CountDigits_16 {

	public static void main(String[] args) {
		System.out.println(evenlyDivides(22074));
	}

	public static int evenlyDivides(int N) {
		int originalNumber = N;
		int count = 0;
		while (N != 0) {
			int remainder = N % 10;
//			System.out.println("remainder : " + remainder);
			N = N / 10;
//			System.out.println("N : " + N);
			if (remainder != 0 && originalNumber % remainder == 0) {
				count++;
//				System.out.println("count : " + count);
			}
		}
		return count;
	}
}

package gfg;

public class ArmstrongNumbers_17 {

	public static void main(String[] args) {
		System.out.print(armstrongNumber(153));
	}

	public static String armstrongNumber(int n) {
		int originalNumber = n;
		int sum = 0;
		while (n != 0) {
			int remainder = n % 10;
			sum = sum + remainder * remainder * remainder;
			// System.out.println("remainder : "+ remainder);
			// System.out.println("sum : "+ sum);
			n = n / 10;
		}
		if (sum == originalNumber)
			return "Yes";
		return "No";
	}
}

package patternprinting;

public class c3it {
	public static void main(String[] args) {
		c3itPattern();
	}

	public static void c3itPattern() {
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 4 - row; col++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int col = 1; col <= row - 1; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row - 1; col++) {
				if (row - col == 2)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			for (int col = 1; col <= 3 - row + 1; col++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 7; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int col = 1; col <= 4 - row - 1; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 3 - row; col++) {
				if (row - col == 0)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}

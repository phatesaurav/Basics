package pattern;

public class SolidPattern {

	public static void main(String[] args) {
		leftSidedTriangle_1();
		System.out.println();
		leftSidedTriangle_2();
		System.out.println();
		leftSidedTriangle_3();
		System.out.println();
		leftSidedTriangle_4();
		System.out.println();
		solidDiamond();
		System.out.println();
		leftSidedTriangle_5();
		System.out.println();
		leftSidedTriangle_6();
		System.out.println();
		leftSidedTriangle_6_test();
		System.out.println();
		leftSidedTriangle_7();
		System.out.println();
		leftSidedTriangle_7_test();
		System.out.println();
		leftSidedTriangle_8();
		System.out.println();
		leftSidedTriangle_8_test();
		System.out.println();
		hollowDiamond();
	}

	public static void leftSidedTriangle_1() {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4 - row; col++) {
				System.out.print("-");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void leftSidedTriangle_2() {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			for (int col = 1; col <= 4 - row; col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void leftSidedTriangle_3() {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row - 1; col++) {
				System.out.print("-");
			}
			for (int col = 1; col <= 4 - row + 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void leftSidedTriangle_4() {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4 - row + 1; col++) {
				System.out.print("*");
			}
			for (int col = 1; col <= row - 1; col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void solidDiamond() {
		int number = 4;
		for (int row = 1; row <= number; row++) {
			for (int col = 1; col <= number - row; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			for (int col = 1; col <= row - 1; col++) {
				System.out.print("*");
			}
			for (int col = 1; col <= number - row; col++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int row = 1; row <= number; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= number - row; col++) {
				System.out.print("*");
			}
			for (int col = 1; col <= number - row - 1; col++) {
				System.out.print("*");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void leftSidedTriangle_5() {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4 - row; col++) {
				System.out.print("-");
			}
			System.out.print("*");
			for (int col = 1; col <= row - 1; col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void leftSidedTriangle_6() {
		System.out.println("leftSidedTriangle_6");
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row - 1; col++) {
				System.out.print("-");
			}
			System.out.print("*");
			for (int col = 1; col <= 4 - row; col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void leftSidedTriangle_6_test() {
		System.out.println("leftSidedTriangle_6_test");
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row - 1; col++) {
				if (row - col == 1) {
					System.out.print("*");
				} else {
					System.out.print("+");
				}
			}
			for (int col = 1; col <= 4 - row + 1; col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void leftSidedTriangle_7() {
		System.out.println("leftSidedTriangle_7");
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row - 1; col++) {
				System.out.print("-");
			}
			System.out.print("*");
			for (int col = 1; col <= 4 - row; col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void leftSidedTriangle_7_test() {
		System.out.println("leftSidedTriangle_7_test");
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("-");
			}
			for (int col = 1; col <= 4 - row; col++) {
				if (col == 1)
					System.out.print("*");
				else
					System.out.print("+");
			}
			System.out.println();
		}
	}

	public static void leftSidedTriangle_8() {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4 - row; col++) {
				System.out.print("-");
			}
			System.out.print("*");
			for (int col = 1; col <= row - 1; col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void leftSidedTriangle_8_test() {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4 - row - 1; col++) {
				System.out.print("+");
			}
			for (int col = 1; col <= 4 - row; col++) {
				if (col == 1)
					System.out.print("*");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void hollowDiamond() {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4 - row; col++) {
				System.out.print("-");
			}
			System.out.print("*");
			for (int col = 1; col <= row - 1; col++) {
				System.out.print("-");
			}
			for (int col = 1; col <= row - 1; col++) {
				if (row - col == 1) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			for (int col = 1; col <= 4 - row + 1; col++) {
				System.out.print("-");
			}
			System.out.println();
		}

		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row - 1; col++) {
				System.out.print("-");
			}
			System.out.print("*");
			for (int col = 1; col <= 4 - row; col++) {
				System.out.print("-");
			}

			for (int col = 1; col <= 4 - row - 1; col++) {
				System.out.print("-");
			}
			for (int col = 1; col <= 4 - row; col++) {
				if (col == 1)
					System.out.print("*");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

}

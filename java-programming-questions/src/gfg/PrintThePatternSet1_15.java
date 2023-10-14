package gfg;

import java.util.Scanner;

public class PrintThePatternSet1_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printPat(3);
		sc.close();
	}

	public static void printPat(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * (n - i); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

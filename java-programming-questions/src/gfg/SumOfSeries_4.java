package gfg;

import java.util.Scanner;

public class SumOfSeries_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(seriesSum(sc.nextInt()));
		sc.close();
	}
	
	public static long seriesSum(int n) {
        long sum = (long)n * (n + 1) / 2;
        return sum;
    }
}

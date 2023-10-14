package gfg;

public class JavaArraysSet1_13 {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5 };
		System.out.print(average(A, 5));
	}

	public static String average(int A[], int N) {
		float sum = 0;
		for (int i = 0; i < N; i++) {
			sum = sum + A[i];
		}
		float average = sum / N;
		return String.format("%.2f", average);
	}
}

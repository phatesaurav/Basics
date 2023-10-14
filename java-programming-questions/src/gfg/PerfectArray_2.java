package gfg;

public class PerfectArray_2 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 2, 1 };
		boolean isPerfect = IsPerfect(array, 5);
		if(isPerfect) 
			System.out.println("PERFECT");
		else
			System.out.println("NOT PERFECT");
	}

	public static boolean IsPerfect(int a[], int n) {
		int[] reverseArray = new int[n];

		for (int i = 0; i < n; i++) {
			reverseArray[i] = a[n - i - 1];
			if (a[i] != reverseArray[i]) {
				return false;
			}
		}
		return true;
	}
}

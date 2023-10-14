package gfg;

public class SmallerAndLarger_9 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 10, 11, 12, 19 };
		int[] resultArray = getMoreAndLess(arr, 7, 0);
		for (int item : resultArray) {
			System.out.print(item + " ");
		}
	}

	public static int[] getMoreAndLess(int[] arr, int n, int x) {
		int[] returnArray = new int[2];
		int less = 0;
		int more = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] <= x) {
				less++;
				returnArray[0] = less;
			}

			if (arr[i] >= x) {
				more++;
				returnArray[1] = more;
			}
		}
		return returnArray;
	}
}

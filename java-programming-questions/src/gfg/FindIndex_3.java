package gfg;

public class FindIndex_3 {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 5 };
		int result[] = findIndex(array, 6, 5);
		for (int item : result) {
			System.out.println(item);
		}
	}

	public static int[] findIndex(int a[], int N, int key) {
		int[] returnArray = new int[2];
		for (int i = 0; i < N; i++) {
			if (a[i] == key) {
				returnArray[0] = i;
				break;
			} else
				returnArray[0] = -1;
		}

		for (int i = N - 1; i >= 0; i--) {
			if (a[i] == key) {
				returnArray[1] = i;
				break;
			} else
				returnArray[1] = -1;
		}
		return returnArray;
	}
}

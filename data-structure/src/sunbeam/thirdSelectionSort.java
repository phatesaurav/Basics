package sunbeam;

import java.util.Arrays;

public class thirdSelectionSort {

	private static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 6, 4, 2, 8, 3, 1 };
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}
}

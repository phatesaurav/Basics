package java67;

import java.util.Arrays;

public class RemoveDuplicatesFromArray_2 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10 };
		int[] uniqueArray = removeDuplicates(array);

		// Print the unique elements in the array
		for (int i = 0; i < uniqueArray.length; i++) {
			System.out.print(uniqueArray[i] + " ");
		}
	}

	public static int[] removeDuplicates(int[] array) {
		int length = array.length;
		System.out.println("length : " + length);
		int[] uniqueArray = new int[length]; // create one unique array with same length
		int uniqueCount = 0; // maintain count

		for (int i = 0; i < length; i++) { // 0 to 13
			System.out.println("array[i] : " + array[i] + ", i : " + i);
			boolean isDuplicate = false;

			for (int j = i + 1; j < length; j++) { // j = 14; j < 13; j++ -> break
				System.out.println("array[i]==array[j] : " + array[i] + "==" + array[j]);
				if (array[i] == array[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				uniqueArray[uniqueCount] = array[i];
				uniqueCount++;
				System.out.println("uniqueCount : " + uniqueCount);
			}
		}
		// Resize the uniqueArray to eliminate trailing zeros
		return Arrays.copyOf(uniqueArray, uniqueCount); // (original array, new length)
	}
}

package sunbeam;

import java.util.Arrays;

// For sorted arrays only
public class secondBinarySearch {

	private static int binarySearch(int[] array, int key) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int left = 0;
		int right = array.length;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (key == array[mid])
				return mid;
			else if (key < array[mid])
				right = mid - 1;
			else if (key > array[mid])
				left = mid + 1;
		}
		return -1;
	}

	private static int recursiveBinarySearch(int[] array, int key) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int left = 0;
		int right = array.length;

		class LocalInnerClass {
			public int recursion(int left, int right, int key) {
				int mid = (left + right) / 2;
				if (left <= right) {
					if (key == array[mid])
						return mid;
					else if (key < array[mid])
						return recursion(left, mid - 1, key);
					else
						return recursion(mid + 1, right, key);
				}
				return -1;
			}
		}

		LocalInnerClass refVar = new LocalInnerClass(); // cannot have a static method inside a non-static inner class
		return refVar.recursion(left, right, key);
	}

	public static void main(String[] args) {
		int[] array = { 88, 33, 66, 99, 44, 77, 22, 55, 11 };
		System.out.println(binarySearch(array, 11));
		System.out.println(recursiveBinarySearch(array, 40));
	}

}

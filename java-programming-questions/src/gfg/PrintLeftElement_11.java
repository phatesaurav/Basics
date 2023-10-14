package gfg;

import java.util.Collections;
import java.util.LinkedList;

public class PrintLeftElement_11 {
	
	public static void main(String[] args) {
		long[] arr = {7, 8, 3, 4, 2, 9, 5};
		System.out.println(leftElement(arr, 7));
	}

	public static long leftElement(long arr[], long n) {
		LinkedList<Long> linkedList = new LinkedList<>();
		long result = 0;

		for (int i = 0; i < n; i++) {
			linkedList.add(arr[i]);
		}

		Collections.sort(linkedList);

		if (n % 2 != 0) {
			for (int i = 0; i < (n - 1) / 2; i++) {
				linkedList.removeLast();
				linkedList.removeFirst();
			}
		} else {
			for (int i = 0; i < (n - 2) / 2; i++) {
				linkedList.removeLast();
				linkedList.removeFirst();
			}
			linkedList.removeLast();
		}

		for (Long item : linkedList) {
			result = item;
		}
		return result;
	}
}

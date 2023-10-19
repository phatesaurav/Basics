package iprogrammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfArrayContainDuplicate_4 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10 };
		System.out.println(Arrays.toString(checkDuplicates(array)));
	}

	private static int[] checkDuplicates(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					list.add(array[i]);
				}
			}
		}

		int[] resultArray = new int[list.size()];
		int i = 0;
		for (Integer item : list) {
			resultArray[i] = item;
			i++;
		}
		return resultArray;
	}

}

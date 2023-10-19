package iprogrammer;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

// find change {1,2,3} target=4 return {1,3},{2,2},{1,1,2},{1,1,1,1}
public class FindChange_8 {

	public static void main(String[] args) {
		int[] change = { 1, 2, 3 };
		int target = 4;
		int[][] result = findChange(change, target);

		for (int[] subArray : result) {
			System.out.println(Arrays.toString(subArray));
		}
	}

	private static int[][] findChange(int[] array, int target) {
		Set<int[]> listOfArrays = new LinkedHashSet<>();

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if ((array[i] + array[j]) == target) {
					int[] listArray = new int[2];
					listArray[0] = array[i];
					listArray[1] = array[j];
					listOfArrays.add(listArray);
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (target % array[i] == 0) {
				int count = target / array[i];
				int[] listArray = new int[count];
				for (int j = 0; j < count; j++) {
					listArray[j] = array[i];
				}
				listOfArrays.add(listArray);
			}
		}

		int[][] resultArray = new int[listOfArrays.size()][];
		int i = 0;
		for (int[] item : listOfArrays) {
			resultArray[i] = item;
			i++;
		}
		return resultArray;
	}

}

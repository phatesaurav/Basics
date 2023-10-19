package iprogrammer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray_3 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10 };
		System.out.println(Arrays.toString(removeDuplicates(array)));
	}

	private static int[] removeDuplicates(int[] array) {
		Integer[] integerArray = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			integerArray[i] = array[i];
		}

		Set<Integer> set = new HashSet<>(Arrays.asList(integerArray));
		
		int[] returnArray = new int[set.size()];
		int i = 0;
        for (Integer num : set) {
        	returnArray[i] = num;
            i++;
        }
		return returnArray;
	}

}

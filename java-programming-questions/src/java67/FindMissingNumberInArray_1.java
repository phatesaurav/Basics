package java67;

import java.util.Arrays;

public class FindMissingNumberInArray_1 {
	public static void main(String args[]) {
		printMissingNumber(new int[] { 1, 2, 3, 4, 6 }, 6); // one missing number
		printMissingNumber(new int[] { 1, 2, 3, 4, 6, 7, 9, 8, 10 }, 10); // two missing numbers
		printMissingNumber(new int[] { 1, 2, 3, 4, 6, 9, 8 }, 10); // three missing numbers
		printMissingNumber(new int[] { 1, 2, 3, 4, 9, 8 }, 10); // four missing numbers
	}

	private static void printMissingNumber(int[] numbers, int count) { // count = 6
		boolean[] visited = new boolean[count + 1]; // count + 1 = 7 -> 0 [ 1 2 3 4 5 6 ]
		System.out.println("visited.length : " + visited.length); // 7
		for (int numberItem : numbers) {
			visited[numberItem] = true;
		}
		
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers),count);
		for (int i = 1; i <= count; i++) {
			if (!visited[i]) {
				System.out.println(i);
			}
		}
	}

}

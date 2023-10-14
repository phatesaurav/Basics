package gfg;

import java.util.ArrayList;

public class ValueEqualToIndex_6 {

	public static void main(String[] args) {

		int Arr[] = { 15, 2, 45, 12, 7 };
		ArrayList<Integer> resultArrayList = valueEqualToIndex(Arr, 5);
		for (Integer listItem : resultArrayList) {
			System.out.println(listItem);
		}
	}

	public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
		ArrayList<Integer> returnArrayList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (arr[i] == i + 1)
				returnArrayList.add(arr[i]);
		}
		return returnArrayList;
	}
}

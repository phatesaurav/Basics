package gfg;

import java.util.ArrayList;

public class MultiplicationTable_24 {

	public static void main(String[] args) {
		ArrayList<Integer> resultArrayList = getTable(9);
		for (Integer item : resultArrayList) {
			System.out.print(item + " ");
		}
	}

	public static ArrayList<Integer> getTable(int N) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			arrayList.add(N * i);
		}
		return arrayList;
	}
}

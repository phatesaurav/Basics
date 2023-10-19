package com.javaguides.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList_9 {

	public static void main(String[] args) {

		// create list
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(40);
		list.add(20);

		Collections.sort(list); // ascending order
		System.out.println(list); // [10, 20, 30, 40, 50]

		Collections.reverse(list); // descending order
		System.out.println(list); // [50, 40, 30, 20, 10]
		
		
	}
}

package com.durgesh.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter_1 {

	public static void main(String[] args) {

		// create a list and filter all even numbers from list
		Integer[] array = { 2, 4, 50, 21, 22, 67, 89 };
		List<Integer> list = new ArrayList<>(Arrays.asList(array));
		list.add(45);
		System.out.println(list);

		// filter even numbers without stream
		List<Integer> evenList1 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				evenList1.add(list.get(i));
			}
		}
		System.out.println(evenList1);

		List<Integer> evenList2 = new ArrayList<>();
		for (Integer item : list) {
			if (item % 2 == 0) {
				evenList2.add(item);
			}
		}
		System.out.println(evenList2);

		// filter even numbers with stream
		Stream<Integer> stream = list.stream();
		List<Integer> evenList3 = stream.filter(item -> item % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList3);

		// In single line
		System.out.println(list.stream().filter(item -> item % 2 == 0).collect(Collectors.toList()));
		System.out.println(list.stream().filter(item -> item > 50).collect(Collectors.toList()));
	}

}

// stream.filter -> returns new stream // predicate is boolean valued function which perform filter operation if true
// .collect -> collect each item
// Collector.toList -> return collected item as list
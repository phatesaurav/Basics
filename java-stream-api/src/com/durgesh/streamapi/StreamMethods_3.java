package com.durgesh.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods_3 {

	public static void main(String[] args) {

		// filter(predicate) => return filtered element // predicate => boolean valued
		// function

		// map(function) => perform operation on each element

		// sorted() => sort elements
		
		// min(comparator)

		String city[] = { "Beed", "Ahmednagar", "Akola", "Amravati", "Aurangabad", "Bhandara", "Buldhana" };
		List<String> cityList = new ArrayList<>(Arrays.asList(city));
		System.out.println(cityList.stream().filter(item -> item.startsWith("A")).collect(Collectors.toList()));

		Integer num[] = { 2, 3, 5, 7, 11, 13 };
		List<Integer> numList = new ArrayList<>(Arrays.asList(num));
		System.out.println(numList.stream().map((item) -> item * item).collect(Collectors.toList()));

		cityList.stream().filter(item -> item.startsWith("A")).forEach(item -> System.out.println(item));
		numList.stream().map((item) -> item * item).forEach(item -> System.out.println(item));

		System.out.println(cityList.stream().sorted().collect(Collectors.toList()));
		cityList.stream().sorted().forEach(item -> System.out.println(item));

		Integer min = numList.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("Minimum : " + min);
	}

}

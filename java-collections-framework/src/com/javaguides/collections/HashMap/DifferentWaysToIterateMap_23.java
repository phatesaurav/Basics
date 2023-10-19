package com.javaguides.collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//simple for loop - cannot use for Map
//advanced for loop 
//loop with iterator - cannot use for Map
//iterator with while loop
//java 8 forEach + lambda example
//java 8 stream + lambda example - cannot use for Map
public class DifferentWaysToIterateMap_23 {

	public static void main(String[] args) {
		Map<Integer, String> numberMapping = new HashMap<>();
		numberMapping.put(5, "five");
		numberMapping.put(3, "three");
		numberMapping.put(1, "one");
		numberMapping.put(4, "four");
		numberMapping.put(2, "two");
		System.out.println(numberMapping); // {4=four, 1=one, 5=five, 3=three, 2=two}

		// advanced for loop
		for (Map.Entry<Integer, String> item : numberMapping.entrySet()) {
			System.out.print(item + " | ");
			System.out.println("key => " + item.getKey() + ", value => " + item.getValue());
		}

		// iterator with while loop
		Set<Map.Entry<Integer, String>> set = numberMapping.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> item = iterator.next();
			System.out.print(item + " | ");
			System.out.println("key => " + item.getKey() + ", value => " + item.getValue());
		}

		// java 8 forEach + lambda example
		numberMapping.forEach((K, V) -> System.out.println(K + ", " + V));

	}

}

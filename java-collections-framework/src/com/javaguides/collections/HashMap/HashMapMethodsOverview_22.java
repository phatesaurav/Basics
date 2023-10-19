package com.javaguides.collections.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethodsOverview_22 {

	public static void main(String[] args) {
		Map<Integer, String> numberMapping = new HashMap<>();
		numberMapping.put(5, "five");
		numberMapping.put(3, "three");
		numberMapping.put(1, "one");
		numberMapping.put(4, "four");
		numberMapping.put(2, "two");
		System.out.println(numberMapping); // {4=four, 1=one, 5=five, 3=three, 2=two}

		// Check if HashMap is empty
		System.out.println(numberMapping.isEmpty()); // false

		// Find size of HashMap
		System.out.println(numberMapping.size()); // 5

		// Check if key exists in the HashMap
		System.out.println(numberMapping.containsKey(4)); // true

		// Check if value exists in the HashMap
		System.out.println(numberMapping.containsValue("six")); // false

		// Get value by key
		System.out.println(numberMapping.get(3)); // three

		// Remove key-value pair from HashMap
		System.out.println(numberMapping.remove(1)); // one
		System.out.println(numberMapping); // {2=two, 3=three, 4=four, 5=five}

		// Get only keys from HashMap
		Set<Integer> set = numberMapping.keySet();
		System.out.println(set); // [2, 3, 4, 5]

		// Get only values from HashMap
		Collection<String> collection = numberMapping.values();
		System.out.println(collection); // [two, three, four, five]

	}

}

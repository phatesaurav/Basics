package com.javaguides.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapExample_21 {

	public static void main(String[] args) {
		nullValueDemo();
		duplicateValueDemo();
		unorderedDemo();
	}

	// HashMap can contain one null value
	private static void nullValueDemo() {
		Map<Integer, String> numberMapping = new HashMap<>();
		numberMapping.put(null, null);
		System.out.println(numberMapping);
	}

	// HashMap does not contain duplicate elements
	private static void duplicateValueDemo() {
		Map<Integer, String> numberMapping = new HashMap<>();
		numberMapping.put(2, "two");
		numberMapping.put(2, "two");
		System.out.println(numberMapping);
	}

	// HashMap is unordered collection
	private static void unorderedDemo() {
		Map<Integer, String> numberMapping = new HashMap<>();
		numberMapping.put(5, "five");
		numberMapping.put(3, "three");
		numberMapping.put(1, "one");
		numberMapping.put(4, "four");
		numberMapping.put(2, "two");
		System.out.println(numberMapping); // {4=four, 1=one, 5=five, 3=three, 2=two}
		// order maintained by LinkedHashMap => {5=five, 3=three, 1=one, 4=four, 2=two}
		// sorted by TreeMap based on key => {1=one, 2=two, 3=three, 4=four, 5=five}
	}

}

package com.javaguides.collections.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// remove() method - Remove an element from a HashSet
// removeAll() method - Remove all the elements that exist in a given collection from the HashSet
// clear() method - Clear the HashSet completely by removing all the elements
public class HashSetRemoveExample_19 {

	public static void main(String[] args) {

		// Creating HashSet
		Set<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		System.out.println(numbers); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		// Using remove() method
		boolean result = numbers.remove(1);
		System.out.println("Result => " + result);
		System.out.println(numbers);

		// Using removeAll() method
		Integer[] array = { 2, 4, 6, 8, 10 };
		Set<Integer> evenNumbers = new HashSet<>(Arrays.asList(array));
		numbers.removeAll(evenNumbers);
		System.out.println(numbers); // [3, 5, 7, 9]

		// Using clear() method
		numbers.clear();
		System.out.println(numbers); // []
	}
}

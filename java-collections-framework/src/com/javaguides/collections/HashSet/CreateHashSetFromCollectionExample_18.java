package com.javaguides.collections.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Create a HashSet from another collection using the HashSet(Collection c) constructor
// Add all the elements from a collection to the HashSet using the addAll() method
public class CreateHashSetFromCollectionExample_18 {

	public static void main(String[] args) {
		
		// first five even numbers
		Set<Integer> firstFiveEvenNumbers = new HashSet<>();
		firstFiveEvenNumbers.add(2);
		firstFiveEvenNumbers.add(4);
		firstFiveEvenNumbers.add(6);
		firstFiveEvenNumbers.add(8);
		firstFiveEvenNumbers.add(10);
		System.out.println(firstFiveEvenNumbers); // [2, 4, 6, 8, 10]
		
		// Create a HashSet from another collection using the HashSet(Collection c) constructor
		Set<Integer> tenEvenNumbers = new HashSet<>(firstFiveEvenNumbers);
		System.out.println(tenEvenNumbers); // [2, 4, 6, 8, 10]
		
		Set<Integer> nextFiveEvenNumbers = new HashSet<>();
		nextFiveEvenNumbers.add(12);
		nextFiveEvenNumbers.add(14);
		nextFiveEvenNumbers.add(16);
		nextFiveEvenNumbers.add(18);
		nextFiveEvenNumbers.add(20);
		
		// Add all the elements from a collection to the HashSet using the addAll() method
		tenEvenNumbers.addAll(nextFiveEvenNumbers);
		System.out.println(tenEvenNumbers); // [16, 2, 18, 4, 20, 6, 8, 10, 12, 14]
		
		tenEvenNumbers.addAll(new ArrayList<>(nextFiveEvenNumbers));
		System.out.println(tenEvenNumbers); // [16, 2, 18, 4, 20, 6, 8, 10, 12, 14]
	}

}

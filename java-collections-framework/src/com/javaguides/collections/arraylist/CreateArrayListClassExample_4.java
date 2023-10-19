package com.javaguides.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

// How to create an ArrayList using the ArrayList() constructor.
// Add new elements to an ArrayList using the add() method.
public class CreateArrayListClassExample_4 {

	public static void main(String[] args) {

		// created arraylist object
		List<String> fruits = new ArrayList<>(); // Constructs an empty list with an initial capacity of ten
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");

		System.out.println(fruits); // [Banana, Apple, Mango, Orange]

	}

}

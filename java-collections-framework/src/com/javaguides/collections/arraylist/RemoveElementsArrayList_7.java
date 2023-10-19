package com.javaguides.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

// remove()
// removeAll()
// clear()
public class RemoveElementsArrayList_7 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		// Adding new elements to the ArrayList
		fruits.add("Banana"); // 0
		fruits.add("Apple"); // 1
		fruits.add("Mango"); // 2
		fruits.add("Orange"); // 3
		fruits.add("Pineapple"); // 4
		fruits.add("Grapes"); // 5

		System.out.println(fruits); // [Banana, Apple, Mango, Orange, Pineapple, Grapes]

		fruits.remove(4);
		System.out.println("after removing element at index 4 => " + fruits); // [Banana, Apple, Mango, Orange, Grapes]

		fruits.remove("Mango");
		System.out.println("after removing Mango element at index 2 => " + fruits); // [Banana, Apple, Orange, Grapes]

		// Remove all the elements that exist in a given collection
		List<String> subFruitsList = new ArrayList<>();
		subFruitsList.add("Apple");
		subFruitsList.add("Banana");

		fruits.removeAll(subFruitsList);
		System.out.println(fruits);

		fruits.clear();
		System.out.println(fruits); // []

	}
}

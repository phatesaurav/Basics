package com.javaguides.collections.linkedlist;

import java.util.LinkedList;

// How to remove the first element in the LinkedList
// How to remove the last element in the LinkedList
// How to remove the first occurrence of a given element in the LinkedList
// How to clear the LinkedList completely
public class RemoveElementsFromLinkedListExample_14 {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banana"); // 0
		fruits.add("Apple"); // 1
		fruits.add("Mango"); // 2
		fruits.add("Mango"); // 3
		fruits.add("Orange"); // 4
		fruits.add("Pineapple"); // 5
		fruits.add("Grapes"); // 6

		System.out.println(fruits); // [Banana, Apple, Mango, Orange, Pineapple, Grapes]

		// Remove the first element in the LinkedList
		String firstElement = fruits.removeFirst();
		System.out.println("after removing " + firstElement + " the firstElement => " + fruits); // Banana

		// Remove the last element in the LinkedList
		String lastElement = fruits.removeLast();
		System.out.println("after removing " + lastElement + " the lastElement => " + fruits); // Grapes

		// Remove the first occurrance of a given element in the LinkedList
		System.out.println("removed first occurrence? " + fruits.removeFirstOccurrence("Mango") + " => " + fruits); // true

		// Clear the LinkedList completely
		fruits.clear();
		System.out.println(fruits); // []
	}
}

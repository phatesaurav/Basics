package com.javaguides.collections.linkedlist;

import java.util.LinkedList;

// How to get the first element in the LinkedList
// How to get the last element in the LinkedList
// How to get the element at a given index in the LinkedList
// How to get all the elements from LinkedList
public class RetrieveLinkedListElementsExample_13 {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banana"); // 0
		fruits.add("Apple"); // 1
		fruits.add("Mango"); // 2
		fruits.add("Orange"); // 3
		fruits.add("Pineapple"); // 4
		fruits.add("Grapes"); // 5

		// Getting first element in the LinkedList using getFirst() method from Dequeue interface
		String firstElement = fruits.getFirst();
		System.out.println("firstElement => " + firstElement);

		// Getting last element in the LinkedList using getLast() method from Dequeue interface
		String lastElement = fruits.getLast();
		System.out.println("lastElement => " + lastElement);

		// Getting an element at a given position in the LinkedList
		String element = fruits.get(1);
		System.out.println("element => " + element);

		for (String item : fruits) {
			System.out.println(item);
		}
		
		
	}
}

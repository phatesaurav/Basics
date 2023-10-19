package com.javaguides.collections.linkedlist;

import java.util.LinkedList;

// add()
// add(2, element)
// addFirst() method from Deque interface
// addLast() method from Deque interface
public class CreateLinkedListExample_12 {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banana"); // 0
		fruits.add("Apple"); // 1
		fruits.add("Mango"); // 2
		fruits.add("Orange"); // 3
		fruits.add("Pineapple"); // 4
		fruits.add("Grapes"); // 5

		System.out.println(fruits); // [Banana, Apple, Mango, Orange, Pineapple, Grapes]

		// Adding an element at the specified position in the LinkedList
		fruits.add(2, "Watermelon");
		System.out.println(fruits); // [Banana, Apple, Watermelon, Mango, Orange, Pineapple, Grapes]

		// Adding an element at the beginning of the LinkedList
		fruits.addFirst("Strawberry");
		System.out.println(fruits); // [Strawberry, Banana, Apple, Watermelon, Mango, Orange, Pineapple, Grapes]

		// Adding an element at the end of the LinkedList
		fruits.addLast("guava");
		System.out.println(fruits);

	}

}

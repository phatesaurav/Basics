package com.javaguides.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo_2 {

	public static void main(String[] args) {

		Collection<String> fruitCollection = new ArrayList<>();
		// Collection interface do not have direct implementation but List, Queue, Set
		// interfaces implements Collection interface so we can use their implementation
		// classes to create Collection object
		fruitCollection.add("banana");
		fruitCollection.add("apple");
		fruitCollection.add("mango");
		System.out.println(fruitCollection); // [banana, apple, mango]

		fruitCollection.remove("banana");
		System.out.println(fruitCollection); // [apple, mango]

		System.out.println(fruitCollection.contains("apple")); // true

		fruitCollection.forEach((element) -> {
			System.out.println(element);
		}); // apple mango

		fruitCollection.clear();
		System.out.println(fruitCollection); // []

	}

}

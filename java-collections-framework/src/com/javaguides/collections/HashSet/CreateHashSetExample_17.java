package com.javaguides.collections.HashSet;

import java.util.HashSet;
import java.util.Set;

// create HashSet using HashSet() constructor
// add new elements to it using add() method
public class CreateHashSetExample_17 {

	public static void main(String[] args) {
		Set<String> languages = new HashSet<>();
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("Python");
		languages.add("Scala");
		languages.add("JavaScript");
		System.out.println(languages.toString()); // [Java, C++, C, Scala, JavaScript, Python]

		// add duplicate element
		languages.add("Java");
		System.out.println(languages.toString()); // [Java, C++, C, Scala, JavaScript, Python]

	}
}

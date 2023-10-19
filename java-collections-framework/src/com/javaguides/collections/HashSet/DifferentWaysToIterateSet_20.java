package com.javaguides.collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// simple for loop - cannot use for Set
// advanced for loop
// loop with iterator
// iterator with while loop
// java 8 forEach + lambda example
// java 8 stream + lambda example
public class DifferentWaysToIterateSet_20 {

	public static void main(String[] args) {
		Set<String> languages = new HashSet<>();
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("Python");
		languages.add("Scala");
		languages.add("JavaScript");
		System.out.println(languages.toString()); // [Java, C++, C, Scala, JavaScript, Python]

		// simple for loop - cannot use for Set

		// advanced for loop
		for (String item : languages) {
			System.out.println(item); // // [Java, C++, C, Scala, JavaScript, Python]
		}

		// loop with iterator
		for (Iterator<String> iterator = languages.iterator(); iterator.hasNext();) {
			String item = (String) iterator.next();
			System.out.println(item);
		}

		// iterator with while loop
		Iterator<String> iterator = languages.iterator();
		while (iterator.hasNext()) {
			String item = (String) iterator.next();
			System.out.println(item);
		}

		// java 8 forEach + lambda example
		languages.forEach(item -> System.out.println(item));

		// java 8 stream + lambda example
		languages.stream().forEach(item -> System.out.println(item));

	}

}

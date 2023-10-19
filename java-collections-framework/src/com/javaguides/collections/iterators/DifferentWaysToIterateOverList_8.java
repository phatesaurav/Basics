package com.javaguides.collections.iterators;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// simple for loop
// advanced for loop
// loop with iterator
// iterator with while loop
// java 8 stream + lambda example
// java 8 forEach + lambda example
public class DifferentWaysToIterateOverList_8 {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "Hibernate");

		// simple for loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i)); // C C++ Java Spring Hibernate
		}

		// advanced for loop
		for (String item : courses) {
			System.out.println(item); // C C++ Java Spring Hibernate
		}

		// loop with iterator
		for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String item = (String) iterator.next();
			System.out.println(item); // C C++ Java Spring Hibernate
		}

		// iterator with while loop
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String item = (String) iterator.next();
			System.out.println(item); // C C++ Java Spring Hibernate
		}

		// java 8 stream + lambda example
		courses.stream().forEach(item -> System.out.println(item)); // C C++ Java Spring Hibernate

		// java 8 forEach + lambda example
		courses.forEach(item -> System.out.println(item)); // C C++ Java Spring Hibernate
	}

}

package com.javaguides.collections.linkedlist;
import java.util.Iterator;
import java.util.LinkedList;
public class IterateAndSearchOverLinkedList_15 {
	public static void main(String[] args) {
		LinkedList<String> languages = new LinkedList<>();
		languages.add("C"); // 0
		languages.add("C++"); // 1
		languages.add("Core Java"); // 2
		languages.add("Core Java"); // 3
		System.out.println("result => " + languages.contains("C")); // true

		// Find the index of the first occurrence of an element in the LinkedList
		System.out.println("index => " + languages.indexOf("Core Java")); // 2

		// Find the index of the last occurrence of an element in the LinkedList
		System.out.println("index => " + languages.lastIndexOf("Core Java")); // 3

		// simple for loop
		// advanced for loop
		// basic loop with iterator
		// java 8 forEach + lambda example
		// java 8 stream + lambda example
		for (int i = 0; i < languages.size(); i++) {
			System.out.println(languages.get(i)); // C C++ Core Java Core Java Java EE Spring Framework
		}

		for (String item : languages) {
			System.out.println(item); // C C++ Core Java Core Java Java EE Spring Framework
		}

		for (Iterator<String> iterator = languages.iterator(); iterator.hasNext();) {
			String item = (String) iterator.next();
			System.out.println(item); // C C++ Core Java Core Java Java EE Spring Framework
		}

		Iterator<String> iterator = languages.iterator();
		while (iterator.hasNext()) {
			String item = (String) iterator.next();
			System.out.println(item);
		}
		
		languages.forEach(item -> System.out.println(item)); // C C++ Core Java Core Java Java EE Spring Framework
		languages.stream().forEach(item -> System.out.println(item)); // C C++ Core Java Core Java Java EE Spring Framework
	}
}

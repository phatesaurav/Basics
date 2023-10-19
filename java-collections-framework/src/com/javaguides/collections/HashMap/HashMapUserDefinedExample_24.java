package com.javaguides.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample_24 {

	public static void main(String[] args) {
		Map<Integer, Student> studentMap = new HashMap<>();
		studentMap.put(1, new Student("Jon", "Doe"));
		studentMap.put(2, new Student("Alice", "Smith"));
		studentMap.put(3, new Student("Bob", "Johnson"));
		studentMap.put(4, new Student("Emily", "Williams"));
		studentMap.put(5, new Student("David", "Brown"));

		System.out.println(studentMap.toString());

		for (Map.Entry<Integer, Student> item : studentMap.entrySet()) {
			System.out.println("Student ID: " + item.getKey() + ", Student Name: " + item.getValue().getFullName());
		}
	}

}

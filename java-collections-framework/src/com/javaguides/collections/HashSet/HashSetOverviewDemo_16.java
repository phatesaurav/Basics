package com.javaguides.collections.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetOverviewDemo_16 {

	public static void main(String[] args) {
		nullValueDemo();
		duplicateValueDemo();
		unorderedDemo();
	}

	// HashSet can contain one null value
	private static void unorderedDemo() {
		Set<String> set = new HashSet<>();
		set.add(null);
		set.add(null);
		System.out.println(set.toString()); // [null]
	}

	// HashSet does not contain duplicate elements
	private static void duplicateValueDemo() {
		Set<String> set = new HashSet<>();
		set.add("element1");
		set.add("element1");
		System.out.println(set.toString()); // [element1]
	}

	// HashSet is unordered collection
	private static void nullValueDemo() {
		Set<String> set = new HashSet<>();
		set.add("ram");
		set.add("rajesh");
		set.add("rajat");
		set.add("rakesh");
		set.add("ratan");
		set.add("ramesh");
		System.out.println(set.toString()); // [ratan, rajat, rajesh, ramesh, ram, rakesh]
		// order maintained by LinkedHashSet => [ram, rajesh, rajat, rakesh, ratan, ramesh]
		// sorted by TreeSet => [rajat, rajesh, rakesh, ram, ramesh, ratan]
	}

}

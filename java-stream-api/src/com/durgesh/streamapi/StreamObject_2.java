package com.durgesh.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject_2 {

	public static void main(String[] args) {

		// Stream API - process collection/group of objects

		// 1 - blank
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(item -> System.out.println(item));

		// 2 - array, object, collection
		String name[] = { "Joe", "Peter", "Quagmire", "Clevland" };
		Stream<String> nameStream = Stream.of(name);
		nameStream.forEach(item -> System.out.println(item));

		// 3 -
		Stream<Object> builderStream = Stream.builder().build();

		// 4 -
		IntStream intStream = Arrays.stream(new int[] { 2, 4, 6, 8, 10 });
		intStream.forEach(item -> System.out.println(item));

		// 5 -
		Character[] charArray = { 'a', 'e', 'i', 'o', 'u' };
		List<Character> list = new ArrayList<>(Arrays.asList(charArray));
		list.forEach(item -> System.out.println(item));
	}

}

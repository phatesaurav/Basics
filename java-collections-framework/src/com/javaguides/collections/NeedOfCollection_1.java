package com.javaguides.collections;

public class NeedOfCollection_1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		int f = 60;
		int g = 70;
		int h = 80;
		int i = 90;
		int j = 100;

		int[] array = new int[10000];

		// limitations of an array
		// 1. Arrays are fixed in size v/s Collections are growable in nature
		// 2. Arrays can hold only homogeneous data elements

		Student[] students = new Student[10];
		students[0] = new Student();
		students[1] = new Student();
//		students[2] = new Book(); // Type mismatch: cannot convert from Book to Student

		Object[] objects = new Object[10];
		objects[0] = new Student();
		objects[1] = new Student();
		objects[2] = new Book();

		// 3. ready made APIs support for data structure  is not available in array

	}

}

class Book {

}

class Student {

}

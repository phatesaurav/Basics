package com.javaguides.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class SortStudentUsingComparableInterface_11 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(10, "Ramesh", 30));
		students.add(new Student(20, "Santosh", 29));
		students.add(new Student(30, "Tejas", 28));
		students.add(new Student(40, "Pramod", 31));

		Collections.sort(students);
		System.out.println(students);
	}
}

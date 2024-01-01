package com.javaguides.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeUsingComparatorInterface_10_3 {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10, "Ramesh", 30, 400000));
		employees.add(new Employee(20, "Santosh", 29, 350000));
		employees.add(new Employee(30, "Tejas", 28, 450000));
		employees.add(new Employee(40, "Pramod", 31, 500000));

		// provide anonymous implementation of Comparator interface
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		System.out.println(employees);

		// provide anonymous implementation of Comparator interface using lamdba expression
		Collections.sort(employees, (o1, o2) -> o1.getSalary() - o2.getSalary());
		System.out.println(employees);

		Collections.sort(employees, (o1, o2) -> o1.getName().compareTo(o2.getName())); // use compareTo to compare two Strings
		System.out.println(employees);

	}

}

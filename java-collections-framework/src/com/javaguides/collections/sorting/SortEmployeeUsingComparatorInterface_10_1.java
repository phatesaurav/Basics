package com.javaguides.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeUsingComparatorInterface_10_1 {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10, "Ramesh", 30, 400000));
		employees.add(new Employee(20, "Santosh", 29, 350000));
		employees.add(new Employee(30, "Tejas", 28, 450000));
		employees.add(new Employee(40, "Pramod", 31, 500000));

		Comparator<Employee> salarayComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}
		};

		Collections.sort(employees, salarayComparator); // pass list and Comparator object as arguments
		System.out.println(employees);

	}

}

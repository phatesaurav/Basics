package com.javaguides.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeUsingComparatorInterface_10_2 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10, "Ramesh", 30, 400000));
		employees.add(new Employee(20, "Santosh", 29, 350000));
		employees.add(new Employee(30, "Tejas", 28, 450000));
		employees.add(new Employee(40, "Pramod", 31, 500000));

		Collections.sort(employees, new SortBySalary()); // ascending order compare salaray
		System.out.println(employees);

		Collections.sort(employees, new SortByIdDescOrder()); // descending order compare id
		System.out.println(employees);

		Collections.sort(employees, new sortByName()); // ascending order compare name
		System.out.println(employees);
	}
}

class SortBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary() - o2.getSalary();
	}
}

class SortByIdDescOrder implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getId() - o1.getId();
	}
}

class sortByName implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName()); // use compareTo to compare two Strings
	}
}

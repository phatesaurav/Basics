package sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class Person {

	int id;
	String name;
	int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class fourthSortPerson {

	private static <T> void selectionSort(T[] array, Comparator<T> comparator) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (comparator.compare(array[i], array[j]) > 0) {
					T temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		Person[] people = new Person[5];
		people[0] = new Person(4, "John", 25);
		people[1] = new Person(1, "Alice", 30);
		people[2] = new Person(3, "Bob", 28);
		people[3] = new Person(5, "Eve", 22);
		people[4] = new Person(2, "Charlie", 35);

		Comparator<Person> idComparator = Comparator.comparingInt(p -> p.id);
		Comparator<Person> nameComparator = Comparator.comparing(p -> p.name);
		Comparator<Person> ageComparator = Comparator.comparingInt(p -> p.age);

		selectionSort(people, idComparator);
		System.out.println(Arrays.toString(people));
		selectionSort(people, ageComparator);
		System.out.println(Arrays.toString(people));
		selectionSort(people, nameComparator);
		System.out.println(Arrays.toString(people));
	}

}

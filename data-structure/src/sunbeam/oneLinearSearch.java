package sunbeam;

//  Find a number in a list of given numbers (random order).
public class oneLinearSearch {

	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 88, 33, 66, 99, 44, 77, 22, 55, 11 };
		System.out.println(linearSearch(array, 77));
	}

}

package benison;

// find largest & smallest number in array
public class question_02 {
	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		findMinMax(myArray);
	}

	public static void findMinMax(int[] myArray) {
		int min = myArray[0];
		int max = myArray[0];

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] < min)
				min = myArray[i];
			else if (myArray[i] > max)
				max = myArray[i];
		}
		System.out.println("min:" + min + " max:" + max);
	}
}

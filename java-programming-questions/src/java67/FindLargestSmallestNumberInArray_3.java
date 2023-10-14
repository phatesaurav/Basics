package java67;

public class FindLargestSmallestNumberInArray_3 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 1, 6};
        int smallest = findSmallestNumber(numbers);
        int largest = findLargestNumber(numbers);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    public static int findSmallestNumber(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int findLargestNumber(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}

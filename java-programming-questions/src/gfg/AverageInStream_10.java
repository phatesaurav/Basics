package gfg;

public class AverageInStream_10 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		float resultArray[] = streamAvg(arr, 5);
		for (float item : resultArray) {
			System.out.print(item + " ");
		}
	}

	public static float[] streamAvg(int[] arr, int n) {
		float[] returnArray = new float[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			float average = (float) sum / (i + 1);
			returnArray[i] = average;
		}
		return returnArray;
	}
}

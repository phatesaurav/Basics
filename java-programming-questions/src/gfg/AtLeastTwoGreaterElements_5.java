package gfg;

import java.util.Arrays;

public class AtLeastTwoGreaterElements_5 {

	public static void main(String[] args) {
		long a[] = {2, 8, 7, 1, 5};
		long resultArray[] = findElements(a, 5);
		for(long i : resultArray) {
			System.out.println(i);
		}
	}
	
	public static long[] findElements( long a[], long n)
    {
        long[] returnArray = new long[a.length-2];
        Arrays.sort(a);
        for(int i=0; i<n-2; i++){
            returnArray[i] = a[i];
        }
        return returnArray;
    }

}

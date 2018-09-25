package Programs;

import java.util.Arrays;

public class SubArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Our arr contains 8 elements
        int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
 
        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 5);
 
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
	}

}

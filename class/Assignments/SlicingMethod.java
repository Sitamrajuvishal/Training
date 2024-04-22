package Assignments;
import java.util.Arrays;

public class SlicingMethod {

	public static void main(String[] args) {
		 	int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        int startIndex = 2;
	        int endIndex = 5;
	        
	//Function Call
	        int[] slicedArray = SliceArray(array, startIndex, endIndex);
	        
	        System.out.println("Original Array: " + Arrays.toString(array));
	        System.out.println("Sliced Array: " + Arrays.toString(slicedArray));
	 }
	
    //Desired Function Implementation.
	
	 public static int[] SliceArray(int[] array, int startIndex, int endIndex) {
	// Handling the Edge Cases
	        if (startIndex < 0 || startIndex >= array.length || endIndex < 0 || endIndex >= array.length || startIndex > endIndex){
	            throw new IllegalArgumentException("Invalid start or end index");
	        }

	        int length = endIndex - startIndex + 1;
	        int[] slicedArray = new int[length];

	        for (int i = 0; i < length; i++) {
	            slicedArray[i] = array[startIndex + i];
	        }

	        return slicedArray;
	    }
	}
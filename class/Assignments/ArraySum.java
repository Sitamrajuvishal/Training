package Assignments;

public class ArraySum {

	public static void main(String[] args){
		int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + sumArray(array, 0));
	}
	
	 public static int sumArray(int[] arr, int index){
	        if (index == arr.length - 1){
	 // Base case: return the last element when the index reaches the end of the array
	            return arr[index]; 
	        } else{
	 // Add current element to sum of rest of the array
	            return arr[index] + sumArray(arr, index + 1); 
	        }
	  }
}
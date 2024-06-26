package Assignments;

public class LinearSearch{

	public static void main(String[] args){
		 int[] array = {2, 5, 8, 10, 13, 17, 21};
	        int target = 13;
	        int result = PerformLinearSearch(array, target);
	        
	        if (result != -1){
	            System.out.println("Element " + target + " found at index " + result);
	        } else{
	            System.out.println("Element " + target + " not found in the array.");
	        }
	 }
	
	public static int PerformLinearSearch(int[] array, int target){
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }
}

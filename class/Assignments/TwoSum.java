package Assignments;

//Optimized.
//Binary search
import java.util.Arrays;

public class TwoSum{
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        
        if (result != null){
            System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
        } else{
            System.out.println("No solution found.");
        }
    }

    public static int[] twoSum(int[] nums, int target){
        // Sort the array
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int sum = nums[left] + nums[right];
            if (sum == target){
                return new int[]{left, right};
            } else if (sum < target){
                left++;
            } else{
                right--;
            }
        }
        return null; // No solution found
    }
}


//BruteForce. 

//public class TwoSum {
//	
//	public static void main(String[] args) {
//		 	int[] nums = {2, 7, 11, 15};
//	        int target = 9;
//	        
//	        int[] result = twoSum(nums, target);
//	        
//	        if (result != null) {
//	            System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
//	        } else {
//	            System.out.println("No solution found.");
//	        }
//	 }
//
//	    public static int[] twoSum(int[] nums, int target) {
//	        
//	    	for (int i = 0; i < nums.length; i++) {
//	            for (int j = i + 1; j < nums.length; j++) {
//	                
//	            	if (nums[i] + nums[j] == target) {
//	                    return new int[]{i, j};
//	                }
//	            }
//	        }
//	    	
//	        return null; // No solution found
//	    }
//}







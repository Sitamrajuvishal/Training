package Assignments;
import java.util.Scanner;

public class ReverseArray{

		 public static void main(String[] args){
		        
				Scanner scanner = new Scanner(System.in);

			// Reading the Size of the Array.
			        System.out.print("Enter size of the array: ");
			        int size = scanner.nextInt();

			//Initializing the array      
			        int[] numbers = new int[size];

			        System.out.println("Enter " + size + " consecutive numbers:");
			        for (int i = 0; i < size; i++){
			            numbers[i] = scanner.nextInt();         
			        }

			// Print the array in reverse order
			        System.out.print("Array in reverse order: ");
			        for (int i = numbers.length - 1; i >= 0; i--){
			            System.out.print(numbers[i] + " ");
			        } 
			        
			    scanner.close();
		 }
	}

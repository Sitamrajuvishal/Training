package Assignments;
import java.util.Scanner;

public class IsPrime{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		 	Scanner scanner = new Scanner(System.in);
		 	
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        if (check(number)){
	            System.out.println(number + " is a prime number.");
	        } else{
	            System.out.println(number + " is not a prime number.");
	        }
	        
	        scanner.close();
	 }

	public static boolean check(int number){

	// Check for edge cases
	// 0 and 1 are not prime numbers
	        if (number <= 1){
	            return false; 
	        }

	// Check from 2 to n-1
	        for (int i = 2; i < number; i++) {
	            if (number % i == 0){
	                return false; 
	            }
	        }
	        return true; 
	}
}


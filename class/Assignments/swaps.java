package Assignments;
import java.util.Scanner;

public class swaps {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		System.out.print("Enter the value of a: ");
	        int a = scanner.nextInt();
	        
	        System.out.print("Enter the value of b: ");
	        int b = scanner.nextInt();
	        
	        System.out.println("\nBefore swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        
	        a = a + b;
	        b = a - b;
	        a = a - b;
	        
	        System.out.println("\nAfter swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        
	        scanner.close();
	    }
	}

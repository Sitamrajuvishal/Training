package Assignments;

import java.util.Arrays;

public class Fibonacci{

// Function to find the nth Fibonacci number
    public static int nthElement(int n){
        if (n <= 0){
            return -1; 
        } 
        else if (n == 1 || n == 2){
            return n - 1; 
        } 
        else{
            return nthElement(n - 1) + nthElement(n - 2); 
        }
    }
// Function to store the first n Fibonacci numbers in an array
    public static int[] fibonacciArray(int n){
        if (n <= 0){
// Empty array for invalid input
            return new int[0]; 
        } 
        else{
            int[] fibArray = new int[n]; 
            for (int i = 0; i < n; i++){
                fibArray[i] = nthElement(i + 1); 
            }
            return fibArray;
        }
    }

    public static void main(String[] args){
        
    	int n = 10; 
        int[] fibArray = fibonacciArray(n);
        
        System.out.println("Fibonacci Sequence: " + Arrays.toString(fibArray));
        System.out.println("The " + n + "th Fibonacci number is: " + nthElement(n));
    }
}

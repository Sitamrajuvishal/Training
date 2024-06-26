package Assignments;
import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
        // Creating an array using InitializeArray
        int[] array = InitializeArray(10, 1, 100);
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        // Sorting the array using BruteForceSort
        BruteForceSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    // Function to initialize an array with random integers within a given range
    public static int[] InitializeArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return array;
    }

    // Function to sort an array using brute force approach
    public static void BruteForceSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

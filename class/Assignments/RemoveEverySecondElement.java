package Assignments;
import java.util.List;
import java.util.ArrayList;

public class RemoveEverySecondElement {
    public static void removeEverySecond(List<Integer> list) {
        // Create a new list to store elements after removing every second element
        List<Integer> result = new ArrayList<>();

        // Iterate over the original list and add every second element to the result list
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                result.add(list.get(i));
            }
        }

        // Print the resulting list
        System.out.println("Resulting list after removing every second element:");
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        // Print the original list
        System.out.println("Original list:");
        System.out.println(myList);

        // Remove every second element and print the resulting list
        removeEverySecond(myList);
    }
}

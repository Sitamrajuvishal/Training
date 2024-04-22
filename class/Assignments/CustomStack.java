package Assignments;

import java.util.ArrayList;
import java.util.EmptyStackException;

	public class CustomStack {
	    private ArrayList<Integer> stack;

	    public CustomStack() {
	        this.stack = new ArrayList<>();
	    }

	    public void push(int item) {
	        stack.add(item);
	    }

	    public int pop() {
	        if (isEmpty()) {
	            throw new EmptyStackException();
	        }
	        return stack.remove(stack.size() - 1);
	    }

	    public int peek() {
	        if (isEmpty()) {
	            throw new EmptyStackException();
	        }
	        return stack.get(stack.size() - 1);
	    }

	    public boolean isEmpty() {
	        return stack.isEmpty();
	    }
	    
	    public void display() {
	        System.out.println("Insertion order (from bottom to top): " + stack);
	    }
	   
	public static void main(String[] args) {
		
        CustomStack stack = new CustomStack();

        // Push integers onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        stack.display();

        // Pop and display integers until the stack is empty
        System.out.println("Popping elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }


}

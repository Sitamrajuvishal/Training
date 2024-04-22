package Assignments;

import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

	public class CustomQueue<T> {
	    private Queue<T> queue;

	    public CustomQueue() {
	        this.queue = new LinkedList<>();
	    }

	    public void enqueue(T item) {
	        queue.add(item);
	    }

	    public T dequeue() {
	        if (isEmpty()) {
	            throw new NoSuchElementException("Queue is empty");
	        }
	        return queue.poll();
	    }

	    public T peek() {
	        if (isEmpty()) {
	            throw new NoSuchElementException("Queue is empty");
	        }
	        return queue.peek();
	    }

	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }

	    public void display() {
	        System.out.println("Queue contents (from front to back): " + queue);
	    }

	    public static void main(String[] args) {
	        CustomQueue<Object> queue = new CustomQueue<>();

	        // Enqueue strings and integers
	        queue.enqueue("First");
	        queue.enqueue(2);
	        queue.enqueue("Third");
	        queue.enqueue(4);

	        // Display queue contents
	        queue.display();

	        // Dequeue and display elements until the queue is empty
	        System.out.println("\nDequeueing elements from the queue:");
	        while (!queue.isEmpty()) {
	            System.out.println("Dequeued: " + queue.dequeue());
	        }
	    }
	}


package com.stackqueueandhash.stack;

import java.util.Stack;

public class QueueUsingStacks {

	private Stack<Integer> stackEnq; 
	private Stack<Integer> stackDeq;


	public QueueUsingStacks() {
		stackEnq = new Stack<>();
		stackDeq = new Stack<>();
	}

	public void enqueue(int data) {
		stackEnq.push(data);
		System.out.println(data + " enqueued");
	}

	public int dequeue() {
		// If both stacks are empty, queue is empty
		if (stackEnq.isEmpty() && stackDeq.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		// Transfer elements if dequeue stack is empty
		if (stackDeq.isEmpty()) {
			while (!stackEnq.isEmpty()) {
				stackDeq.push(stackEnq.pop());
			}
		}

		return stackDeq.pop();
	}

	// Peek front element
	public int peek() {
		if (stackEnq.isEmpty() && stackDeq.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		if (stackDeq.isEmpty()) {
			while (!stackEnq.isEmpty()) {
				stackDeq.push(stackEnq.pop());
			}
		}

		return stackDeq.peek();
	}

	// Check if queue is empty
	public boolean isEmpty() {
		return stackEnq.isEmpty() && stackDeq.isEmpty();
	}

	// Main method for testing
	public static void main(String[] args) {

		QueueUsingStacks queue = new QueueUsingStacks();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Front element: " + queue.peek());

		queue.enqueue(40);

		while (!queue.isEmpty()) {
			System.out.println("Dequeued: " + queue.dequeue());
		}
	}
}

package com.Stacks;

import java.util.EmptyStackException;

public class ArrayStack {

	private Employee[] stack;
	private int top;
	
	public ArrayStack(int capacity) { // in the constructor we will ask for the capacity of the array 
		stack = new Employee[capacity]; // array
		
	}
	
	public void push(Employee employee) {  // worst case for push O(n)
		if(top == stack.length) {
			// we know the array is full
			// we need to resize the array 
			
			Employee[] newArray = new Employee[2*stack.length];  // we create the new array to be twice the size fo the previous one
			System.arraycopy(stack, 0, newArray, 0, stack.length); // copy all the elements from the stack to the newArray stack
			stack = newArray;
		}
		stack[top++] = employee;
	}
	
	public Employee pop() {  // 0(1) const time as we only pop the top element 
		if(isEmpty()) { // we check if the stack is empty
			throw new EmptyStackException();
		}
		
		Employee employee = stack[--top];
		stack[top] = null;
		return employee;
	}
	
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];  // remember the top element is always at the top-1 position
	}
	
	public int size() {
		return top;
	}
	
	public void printStack() {
		for (int i=top-1; i>=0; i--) { // we print the stack from top to bottom
			System.out.println(stack[i]);
		}
	}
	
	
	
	public boolean isEmpty() {
		return top == 0; // stack is empty when the top is 0
		
	}
	
}

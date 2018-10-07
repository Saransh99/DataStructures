package com.Stacks;

public class Main {

	public static void main(String args[]) {
	
		// stack implementation using array 
		// as the array provides the random access that is why array is not good for stack implementation
		// as we only can work with top item only at a time
		// array is of fixed size
		
		ArrayStack stack = new ArrayStack(10);
		stack.push(new Employee("Saransh", "Pal", 23));
		stack.push(new Employee("Emma", "Watson", 28));
		stack.push(new Employee("Rick", "Mercz", 11));
		
		//stack.printStack();
		
		System.out.println("poped" + stack.pop());
		System.out.println("Poped" + stack.pop());
		System.out.println("Peeked " + stack.peek());
		stack.printStack();
	}
	
	
}

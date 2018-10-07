package com.StackImplementLinkedList;

// time complextity for
// push, pop, peek = O(1) as we are only dealing with the top element only
public class Main {

	public static void main (String args[]) {
		
		Employee em1 = new Employee("Saransh", "Pal", 22);
		Employee em2 = new Employee("Emma", "Stone", 22);
		Employee em3 = new Employee("Rick", "Mercz", 22);
		Employee em4 = new Employee("Donald", "Dick", 22);
		Employee em5 = new Employee("Bill", "Gates", 22);
		Employee em6 = new Employee("Morty", "Fin", 22);
		
		LinkedStack stack = new LinkedStack();
		stack.push(em1);
		stack.push(em2);
		stack.push(em3);
		stack.push(em4);
		stack.push(em5);
		stack.push(em6);
		stack.printStack();
	}
}

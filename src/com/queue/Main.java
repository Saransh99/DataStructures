package com.queue;

/*
 * Queue is an abstract data type 
 * this implements the fifo
 * Enque:- adding the items to the end of the queue
 * Dequque:- removing the items from the start of the queque
 * Peek:- see the item at the front of the queue but dont remove the item from the queque
   Time complextiy while making the quque with the linked list we get O(1) i.e const time and if we make the quqequ with the array then that will depend on if we need to resize the array or not 
 */
public class Main {

	// ARRAY implementation of the queue
	
	public static void main(String args[]) {
		
		Employee emp1 = new Employee("Saransh", "Pal", 22);
		Employee emp2 = new Employee("Sarah", "Jenner", 12);
		Employee emp3 = new Employee("Dane", "Billford", 24);
		Employee emp4 = new Employee("Emily", "Blunt", 33);
		Employee emp5 = new Employee("Chris", "Rockford", 25);
		Employee emp6 = new Employee("Jane", "Roberts", 30);
		
		ArrayQueue queue = new ArrayQueue(10);
		queue.add(emp1);
		queue.add(emp2);
		queue.add(emp3);
		queue.add(emp4);
		queue.add(emp5);
		queue.add(emp6);
		
		queue.printQueue(); 
	}
}

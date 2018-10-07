package com.circularQueue;
/*
 * we need to implement the circular queue as if we do a lot of insertion and deletion from the queue the size of the queue will increase 
 * as a lot of space of the deleted elemtns is there so we need a way to link the last node to the first one 
 */

public class Main {

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

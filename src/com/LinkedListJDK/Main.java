package com.LinkedListJDK;

import java.util.Iterator;
import java.util.LinkedList;

/* LinkedList class in the jdk is the doubly linked list 
 * this is not synchronized 
 */

public class Main {

	public static void main(String args[]) {
		Employee emp1 = new Employee("Emma","Stone",234);
		Employee emp2 = new Employee("Bob","Dean",11);
		Employee emp3 = new Employee("Sharon","Stone",90);
		Employee emp4 = new Employee("Dean","Jones",45);
		Employee emp5 = new Employee("Rick","Bennet",564);
		
		LinkedList<Employee> employeeList = new LinkedList<>();
		// the addFirst adds the element in the first of the list
		employeeList.addFirst(emp1);
		employeeList.addFirst(emp2);
		employeeList.addFirst(emp3);
		employeeList.addFirst(emp4);
		employeeList.addFirst(emp5);
		
		// the add() method will add the item to the end of the linked list
		// or the addLast() will also do the same thing as the add
		
		Iterator itr = employeeList.iterator();
		System.out.print("Head->");
		while(itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print("<=>");
		}
		System.out.println("null\n");
		
		// to remove the elements from the linked list we use the removeFIrst() and the removeLast() methods
		// remove() will remove the first element of the list 
	}
}

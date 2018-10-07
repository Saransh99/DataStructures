package com.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[]) {
		
//		 this is simple ArrayList
		
//		List<Employee> employeeList = new ArrayList<>();
//		employeeList.add(new Employee("Saransh","Pal",23));
//		employeeList.add(new Employee("Emma","Stone",34));
//		employeeList.add(new Employee("Kate","Winslet",46));
//		employeeList.add(new Employee("Rachel","Beckham",66));
//		
//		employeeList.forEach(employee->System.out.println(employee));
//		System.out.println(employeeList.get(1));
//		System.out.println(employeeList.isEmpty());
//		
//		// if we want to set the new employee in the given position
//		
//		employeeList.set(2, new Employee("Eva","Green",56));
//		employeeList.forEach(employee->System.out.println(employee));
//		System.out.println(employeeList.size());
		
		Employee emp1 = new Employee("Saransh","Pal",23);
		Employee emp2 = new Employee("Gibbs","Hugh",12);
		Employee emp3 = new Employee("katy","Perry",32);
		Employee emp4 = new Employee("Rick","Nicholas",44);
		Employee emp5 = new Employee("Stewart","Grant",1);
		
		EmployeeLinkedList linkedList = new EmployeeLinkedList();
		linkedList.addToFront(emp1);
		linkedList.addToFront(emp2);
		linkedList.addToFront(emp3);
		linkedList.addToFront(emp4);
		linkedList.addToFront(emp5);
		
		linkedList.printList();
		System.out.println(linkedList.getSize());
		
		System.out.println(linkedList.isEmpty());
		
		linkedList.removeFromFront();
		System.out.println(linkedList.getSize());
		linkedList.printList();
		
	}
}

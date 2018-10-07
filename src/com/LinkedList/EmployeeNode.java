package com.LinkedList;

public class EmployeeNode {

	private Employee employee;
	private EmployeeNode next;
	
	// we dont need the next node in the constructor as we dont know the next node yet
	
	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	
	// we call the toString method from the Employee class
	public String toString() {
		return employee.toString();
	}
	
	
}

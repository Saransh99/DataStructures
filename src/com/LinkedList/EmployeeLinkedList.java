package com.LinkedList;

public class EmployeeLinkedList {

	private EmployeeNode head;
	private int size;
	
	public void addToFront(Employee employee) {
		// we want to create a new node every time we call thid method
		EmployeeNode newNode = new EmployeeNode(employee);
		// we set the newNode to the head
		newNode.setNext(head);
		head = newNode;
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("Head->");
		// we want to traverse the list till the list hits the end node
		while(current!=null) {
			System.out.print(current);
			System.out.print("->");
			
			// here we change the current to the next node
			current = current.getNext();
		}
		System.out.print("Null\n");
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removeNode = head;
		head = head.getNext();
		size--;
		return removeNode;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
}

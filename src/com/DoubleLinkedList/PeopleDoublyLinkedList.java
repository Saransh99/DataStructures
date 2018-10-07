package com.DoubleLinkedList;

public class PeopleDoublyLinkedList {

	private PeopleNode head;
	private PeopleNode tail;
	private int size;
	
	public void addNodeToFront(People people) {
		PeopleNode newNode = new PeopleNode(people);
		newNode.setNext(head);
		if(head==null) {
			tail = newNode;
		}else {
			head.setPrevious(newNode);
		}
		head = newNode;
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public void printList() {
		// first we set the current node to the head
		PeopleNode current = head;
		
		System.out.print("Head->");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" <-> ");
			current = current.getNext();
		}
		System.out.print("null\n");
	}
	
	public PeopleNode removeNodeFromFirst() {
		
		if(isEmpty()) {
			return null;
		}
		// first we set the node to be deleted to head
		PeopleNode deleteNode = head;
		
		// if we only got one element in the list then we set the tail to the null
		if(head.getNext()==null) {
			tail = null;
		}else {
			head.getNext().setPrevious(null);
		}
		
		// the deleted head is then replaced with the next head
		head = head.getNext();
		size--;
		return deleteNode;
		
	}
	
	public void addToEnd(People people) {
		PeopleNode newNode = new PeopleNode(people);
		// first we check if the list is empty, if it is empty then we point the head to the newNode 
		if(tail==null) {
			head = newNode;
		}else {
			// if the list is not empty then we set the tail to the newnNode we are inserting
			// we also set the previous of the newNode to the tail
			tail.setNext(newNode);
			newNode.setPrevious(tail);
		}
		// then the tail will be the newNode
		tail=newNode;
		size++;
	}
	
	public PeopleNode removeFromEnd() {
		if(isEmpty()) {
			return null;
		}
		PeopleNode removeNode = tail;
		// if we have one node in the list
		if(tail.getPrevious()==null) {
			head = null;
		}else {
			// if we have more than one node in the list
			// so when we remove the last element then we set the next of the previous node to be null
			tail.getPrevious().setNext(null);
		}
		// the new tail will be the previous node that is the second last node in the list
		tail = tail.getPrevious();
		size--;
		removeNode.setPrevious(null);
		return removeNode;
	}
	
	public boolean addBefore(People newPeople,People existingPeople) {
		PeopleNode newNode = new PeopleNode(newPeople);
		
		PeopleNode current = head;
		// here we are traverse the list to find the existing People in the list 
		
		while(current!=null && !current.getPeople().equals(existingPeople))
		 {
			current = current.getNext();
		 }
		// the below if statement is if the existingPeople is null then we return false
		if(current ==null) {
			return false;
		}
		
		// if we found the existing People in the list 
		
		newNode.setPrevious(current.getPrevious());
		newNode.setNext(current);
		current.setPrevious(newNode);
		
		if(head==current) {
			// we set the newNode to be the head of the list 
			head = newNode;
		}else {
			// if the node is not the head node then
			// we set the next node of the previous node to be the newNode 
			newNode.getPrevious().setNext(newNode);
		}
		
		return false;
	}
	
	public boolean isEmpty() {
		// when the head is null then the list is empty
		return head ==null;
	}
	
	
}

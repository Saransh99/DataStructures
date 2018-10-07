package com.DoubleLinkedList;

public class PeopleNode {

	private People people;
	private PeopleNode next;
	private PeopleNode previous;
	
	public PeopleNode(People people) {
		this.people = people;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public PeopleNode getNext() {
		return next;
	}

	public void setNext(PeopleNode next) {
		this.next = next;
	}

	public PeopleNode getPrevious() {
		return previous;
	}

	public void setPrevious(PeopleNode previous) {
		this.previous = previous;
	}
	
	public String toString() {
		return people.toString();
	}
	
}

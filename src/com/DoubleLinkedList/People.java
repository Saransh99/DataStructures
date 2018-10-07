package com.DoubleLinkedList;

public class People {

	private String firstName;
	private String lastName;
	private int id;
	
	public People(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "id: "+id+" FirstName: "+firstName + " LastName: "+lastName;
	}
	
	
	
}

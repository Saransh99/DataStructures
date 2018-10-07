package com.LinkedList;

public class Employee {

	private String firstName;
	private String lastName;
	private int id;

	public Employee(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString () {
		return "id: "+id+" FirtstName: "+ firstName + " LastName: "+lastName;
	}

	@Override
	public boolean equals(Object obj) {
		// check if both the object refrences are for the same object
		if(this==obj) {
			return true;
		}
		
		if(obj==null||this.getClass()!=obj.getClass()) {
			return false;
		}
		Employee employee = (Employee)obj;
		
		return (this.firstName==firstName)&&(this.lastName==lastName)&&(this.id==id);
	}
	
	@Override
	
	public int hashCode() {
		return this.id;
	}
}

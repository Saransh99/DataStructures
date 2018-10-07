package com.LinkedListJDK;

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
	public String toString() {
		return "id: "+id+" FirstName: "+firstName+" LastName: "+lastName;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		
		if(obj==null||this.getClass()!=obj.getClass()) {
			return false;
		}
		Employee employee = (Employee)obj;
		return (this.firstName==employee.firstName)&&(this.lastName==employee.lastName)&&(this.id==employee.id);
	}
}

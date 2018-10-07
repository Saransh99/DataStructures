package com.DoubleLinkedList;

public class Main {

	public static void main(String args[]) {
		People p1 = new People("Saransh","Pal",1424);
		People p2 = new People("Emma","Watson",45);
		People p3 = new People("Rita","Ora",56);
		
		
		PeopleDoublyLinkedList list = new PeopleDoublyLinkedList();
		list.addNodeToFront(p1);
		list.addNodeToFront(p2);
		list.addNodeToFront(p3);
		
		list.printList();
		System.out.println(list.getSize());
		
		People p4 = new People("endOne","yep",323);
		list.addToEnd(p4);
		list.printList();
		System.out.println(list.getSize());
		
//		list.removeNodeFromFirst();
//		list.printList();
//		System.out.println(list.getSize());
//		
//		list.removeFromEnd();
//		list.printList();
//		System.out.println(list.getSize());
//		
		People p5 = new People("Tim","Duncan",41);
		list.addBefore(p5, p3);
		list.printList();
		
		
	}
}

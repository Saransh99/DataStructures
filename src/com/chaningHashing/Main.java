package com.chaningHashing;

/*COLLISION REMOVAL BY CHAINiNIG
 * 
 * in the chaining we attach a linked list in every element of the array so if the hashkey of two values are same we can send them to the linked list
 * in fact linear probing does better than chaining on avg but the implementation of chaining is simpler than it 
 	now we can store the elements with the same key value on the linked list together 
 	worst Case:- O(n) when all the keys get hashed to the same index in the aray 
 	hashing function is the main part to achieve a const time 
 */

public class Main {

	public static void main(String args[]) {
		Employee e1 = new Employee("Saransh", "Pal",22);
		Employee e2 = new Employee("Rebbeca", "Black",34);
		Employee e3 = new Employee("Joe", "Tribbiani",11);
		Employee e4 = new Employee("Chandler", "Bing",29);
		Employee e5 = new Employee("Rick", "Jeferson",30);
		Employee e6 = new Employee("Morty", "DanDanie",12);
	
		ChainedHashTable ht = new ChainedHashTable();
		
		ht.put("Pal", e1);
		ht.put("Black", e2);
		ht.put("Tribbiani", e3);
		ht.put("Bing", e4);
		ht.put("Jeferson", e5);
		ht.put("DanDanie", e6);
		
		ht.printHashTable();
		System.out.println("Retrieved Key DanDanie" + ht.get("DanDanie"));
	
		ht.remove("DanDanie");
		ht.printHashTable();
	}
}

package com.hashTable;

/*
 * ABT 
 * provide access to data using keys
 * keys don't have to be int 
 * quick retrieval when we know the key
 * consist of key value pair and the data types dont have to match 
 * Associative array is one type of hash table
 * hashing maps the keys to an int 
 * Collision occurs when more than one value has the same hashed value
 * Load factor tells us how full our hash table is 
 * don't want our load factor too low as there will be lots of empty space
 * if the load factor is too high there is a high chance for collision
 * we write a hash function to hash the key to an int value 
 * 
 */

public class Main {

	public static void main(String args[]) {
		
		Employee emp1 = new Employee("Saransh", "Pal",22);
		Employee emp2 = new Employee("Sarah", "SilverMan",12);
		Employee emp3 = new Employee("Gal", "Gadot",43);
		Employee emp4 = new Employee("Bill", "Burr",45);
		Employee emp5 = new Employee("Seth", "Rogen",11);
		
		SimpleHashTable ht = new SimpleHashTable();
		
		ht.put("Pal", emp1);
		ht.put("SilverMan", emp2);
		ht.put("Gadot", emp3);
		ht.put("Burr", emp4);
		ht.put("Rogen", emp5);
		
		ht.printHashTable();
		
		// to retrive the key again we hash the key again 
		System.out.println("retrive key Pal: " + ht.get("Pal"));
		
	}
}


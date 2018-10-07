package com.hashTable;

// time of the retrieval depends on the hashing function 

// SIMPLE HASH TABLE : -    here we divide the String key length with the hashTable length and the remainder is the key 
// this simple hash table doesnot account for the collision of the hashKey as the Key length can be same and as a result the hashKey value are same too this lead to collision

public class SimpleHashTable {

	private Employee[] hashTable;
	
	public SimpleHashTable() {
		hashTable = new Employee[10];
	}
	
	// this doesnot accomodate collision 
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		// if the hashKey is already taken then we say its full 
		if(hashTable[hashedKey] != null) {
			System.out.println("there is already an employee at postition" + hashedKey);
			
		}else {
			hashTable[hashedKey] = employee; // else we set the employee to its hashKey
		}
	}
	
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		return hashTable[hashedKey]; // const time retreival
	}
	
	// hashing function 
	private int hashKey(String key) {
		// here we are hahsing the String value to the int 
		// we take the last name as the string key and take its length and then divide the string length by the hashtable length and the reaminder we get is the hashKey
		return key.length() % hashTable.length;
	}
	
	public void printHashTable() {
		for(int i=0; i<hashTable.length; i++) {
			System.out.println(hashTable[i]);
		}
	}
}

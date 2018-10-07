package com.hashTableLinearProbing;

public class HashingTableWithProbing {

	private StoredEmployee[] hashTable;
	
	public HashingTableWithProbing() {
		hashTable = new StoredEmployee[20];
	}
	
	public void put (String key, Employee employee) {
		int hashedKey = hashKey(key);
		if(occupied(hashedKey)) {
			int stopIndex = hashedKey;
			
			if(hashedKey== hashTable.length-1) {
				hashedKey = 0;
			}else {
				hashedKey++;
			}
			
			while(occupied(hashedKey) && hashedKey != stopIndex) {
				hashedKey = (hashedKey+1) % hashTable.length;
			}
		}
		
		if(occupied(hashedKey)) {
			System.out.println("the entered key is taken " + hashedKey);
		}else {
			hashTable[hashedKey] = new StoredEmployee(key, employee);
		}
	}
	
	public Employee get (String key) {
		int hashedKey = findKey(key);
		
		if(hashedKey == -1) {
			return null;
		}
		return hashTable[hashedKey].employee;
	}
	
	public Employee remove(String key) {
		int hashedKey = findKey(key);
		if(hashedKey == -1) {
			return null;
		}
		
		Employee employee = hashTable[hashedKey].employee;
		hashTable[hashedKey] = null;
		
		// rehashing 
		StoredEmployee[] oldHashTable = hashTable;
		hashTable = new StoredEmployee[oldHashTable.length];
		
		for( int i=0; i<oldHashTable.length; i++) {
			if(oldHashTable[i]!=null) {
				put(oldHashTable[i].key, oldHashTable[i].employee);
			}
		}
		return employee;
	}
	
	private int hashKey(String key) {
		return key.length() % hashTable.length;
	}
	
	private int findKey (String key) {
		int hashedKey = hashKey(key);
		if(hashTable[hashedKey]!=null && hashTable[hashedKey].key.equals(key)) {
			return hashedKey;	
		}
		
		int stopIndex = hashedKey;
		if(hashedKey == hashTable.length-1) {
			hashedKey = 0;
		}else {
			hashedKey++;
		}
		
		while(hashedKey != stopIndex && hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(key)) {
			hashedKey = (hashedKey +1) % hashTable.length;
		}
		
		if(hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
			return hashedKey;
		}
		else {
			return -1;
		}
		
	}
	
	private boolean occupied(int index) {
		return hashTable[index] != null; // if there is space then we return true if it is occupied then we return false
	}
	
	public void printHashTable() {
		for(int i=0; i<hashTable.length; i++) {
			if(hashTable[i] == null) {
				System.out.println("empty");
			}else {
			System.out.println("Position "+ i + ":" + hashTable[i].employee);
		
			}
		}
	}
}

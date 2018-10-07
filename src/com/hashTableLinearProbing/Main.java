package com.hashTableLinearProbing;

/*Linear Probing:- if a position is already taken we increment the value of the hashKey by 1 until we find the empty slot or hashTable is full
 * every increment of the index is called a probe 
 * the lower the no. of probe the better
 * it effects the performance 
 * its no longer const time as we may have to search the whole array so it becomes O(n)
 * 
 */

public class Main {

	public static void main(String args[]) {
		
		Employee e1 = new Employee("Saransh", "Pal", 22);
		Employee e2 = new Employee("Emma", "Rogers", 30);
		Employee e3 = new Employee("Rachel", "Green", 40);
		Employee e4 = new Employee("Rebecca", "Black", 28);
		Employee e5 = new Employee("Rick", "MartinJunior", 50);
		Employee e6 = new Employee("Ross", "GellarSenior", 34);
		
		HashingTableWithProbing ht = new HashingTableWithProbing();
		
		ht.put("Pal", e1);
		ht.put("Rogers", e2);
		ht.put("Green", e3);
		ht.put("Black", e4);
		ht.put("MartinJunior", e5);
		ht.put("GellarSenior", e6);
		
		ht.printHashTable();
		
		System.out.println(ht.get("Pal"));
		System.out.println(ht.get("Black"));
		ht.remove("Pal");
		ht.remove("Black");
		ht.printHashTable();
		
	}
}

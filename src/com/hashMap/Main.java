package com.hashMap;
import java.util.*;

public class Main {

	public static void main(String args[]) {
		Employee e1 = new Employee("Saransh", "Pal",22);
		Employee e2 = new Employee("Emma", "Watson",22);
		Employee e3 = new Employee("Katherine", "Stone",22);
		Employee e4 = new Employee("Julia", "Roberts",22);
		
		
		Map<String, Employee> hashMap = new HashMap<String, Employee>();
		
		hashMap.put("Pal", e1);
		hashMap.put("Watson", e2);
		hashMap.put("Stone", e3);
		hashMap.put("Roberts", e4);
	
		// using iterator to print the hash map 
		
//		Iterator<Employee> iterator = hashMap.values().iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		// another method for the printing of the hash map
		hashMap.forEach((k,v)->System.out.println("key="+ k + " , Employee="+ v));
		
		System.out.println(hashMap.containsKey("Pal"));
		System.out.println(hashMap.containsValue(e1));
		
		
		
		
		
		
	
	}
	
}

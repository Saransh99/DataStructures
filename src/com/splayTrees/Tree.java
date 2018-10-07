package com.splayTrees;

// we want to make the algorithm as generic as possible 
// so we extend the comparable to the T which is the generics in the java
// making a class, method, interface generic helps us to use the same method, class, interface for diff types of data types 

/*	GENERICS in java 

the java generics programming is introduced in the J2SE 5 to deal with the type safe objects 
before the generics we can store any type of objects in collection i.e non-generic, now the generic forcest the java programmer to store the specific type of objects 
it provides type safety:- we can hold only a single type of objects in generics, it does not allow us to store other objects 

Example of using the generics in java:-

class Main{
	public static void main(String args[]){
		MyGen<String> m = new MyGen<String>();
		m.add("this is the string in the generic class");
		System.out.println(m.get());
	}
}

// here the T is the generic, we can define the generic type in the place of T 
// T can be String, Integer, an Object or anything in the java data type 
class MyGen <T> {
	T obj;
	public void add(T obj){this.obj = obj;}
	public T get(){return obj;}
}

// diff type parameters:- 
1. T- type
2. E- Element 
3. K- Key
4. N- Number
5. V- Value

 */

public interface Tree<T extends Comparable<T>>{
	
	public void insert(T data);
	public Node<T> find(T data);
	public T getMin();
	public T getMax();
	public void inOrderTraversal();
}

package com.avlTrees;

// the tree is going to be the interface as it will decide the avlTree structure 
public interface Tree {
	
	public void insert(int data);
	public void traverse();
	public void delete(int data);
}

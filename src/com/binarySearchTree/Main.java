package com.binarySearchTree;

/*
 * Time for the BST insertion, deletion, retrieval is O(logn)
 * 
 * left child of the root are smaller and the right nodes of the root is larger than the root
 * better version of the bst are the AVL trees 
 * the java jdk treeMap uses the avl trees and it gurantees logn time for all the operations 
 * 4 methods to traverse the trees: - level order, preorder, postorder, inorder
 * level order is not used much as it is not efficient 
 * Inorder:- this traversal sorts the tree, as the left most node in the tree is the smallest one and the right most node is the largest one 
 * height of the bst is from the root of the tree 
 * depth for the nodes at the same level is the same 
 * 
 */
public class Main {
	
	public static void main(String args[]) {
		
		Tree intTree = new Tree();
		intTree.insert(23);
		intTree.insert(20);
		intTree.insert(10);
		intTree.insert(44);
		intTree.insert(55);
		intTree.insert(12);
		intTree.insert(88);
		intTree.insert(1);
		intTree.insert(5);
		intTree.insert(9);
		
		
		intTree.traverseInorder();
		
		System.out.println("\nMax value: " + intTree.max());
		System.out.println("Min value: " + intTree.min());
		System.out.println(intTree.get(23));
		System.out.println(intTree.get(10));
		System.out.println(intTree.get(99));
		intTree.delete(12);
		intTree.traverseInorder();
	}
}

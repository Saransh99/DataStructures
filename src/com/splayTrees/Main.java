package com.splayTrees;

/*	-----------SPLAY tree:- 

1. type of bst 
2. Not strictly balanced as avl 
3. faster than avl 
4. most popular ds in the industry
5. fast access to elemnts accessed recently
6. like a cache (implemented to get the accessed item faster in the const time)
7. splay trees are kept balanced with the help of rotations 

// rotations is same as the bst and the avl 

Search in the splay trees:-
1. the search operation is similar to the bst 
2. but in this we splay the node to be searched 
  // if the search is successful we make the serached node the new root 

// the main idea of the splay trees is to bring the recently accesed item to the root of the tree, this makes the recently searched item to be accessible in O(1) time 
// we don't concerne with the balancing of the trees as we are interested in caching the nodes 
// we make the rotations in this type of tree to make the node to be the root node and not to balance trees 


Cases for the node being accessed:-

1. Node is the root:- then we simply return the root and don't do anything 

// Node is the child of the root with no grandParent
2. Zig (Node is the child of the root):- the node we want to access is either the left or the right child of the root 

// Node has both the parent and the grandParent 
3. Zig-Zig (Node is left child of the parent and the parent is also the left child of the grandParent):- we do a right-right rotations
4. Zag-Zag (Node is the right child of the parent and the parent is the right child of the grandParent): we do  a left-left rotation
// the zig-zig and the zag-zag are the mirror cases

5. Zig-Zag:- node is the right child of the parent and the parent is the left child of the grandParent 
6. Zag-Zig:- node is the left child of the parent and the parent is the right child of the grandParent  
 */
public class Main {

	public static void main(String args[]) {
		
		Tree<Integer> splayTree = new SplayTree<>();
		
		splayTree.insert(10);
		splayTree.insert(0);
		splayTree.insert(234);
		splayTree.insert(-3);
		splayTree.insert(23);
		splayTree.insert(-56);
		splayTree.insert(78);
		
		splayTree.inOrderTraversal();
		System.out.println("\nMax node: " + splayTree.getMax());
		System.out.println("Min Node: " + splayTree.getMin());
	}
}

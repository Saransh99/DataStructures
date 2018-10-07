package com.RedBlackTree;

/*// RED BLACK Trees 

Properties:-

1. each node is either red or black 
2. root node is always black 
3. all leaves are black
4. every node must have 2 black child nodes and no other children, it also must have a  black parent 
5. every path from a given node to any of it's descendent Nil/Null nodes contains the same no. of black nodes 
6. we assign the black to the null pointers 
7. every new node is red by default 
8. on every insertion we check whether we have violated the red black properties or not 
9. we have to make less rotations in the red black tree than the avl tree
10. the shortest path from the root to any leaf has m black nodes 
11. the longest path consist of 2*m nodes 
12. every maximal path have the same no. of black nodes 
12. red-red node is not allowed, but we can have black-black nodes 

// we need to check the color of the nodes recursively 

Uses of the red black tree:-
1. linux kernels relies heavily on the red black tree 
2. insertion is fast in the red black tree as it is not rigidly balanced we don't need to make the balancing and the rotations as soon 
3. for an insert intensive task use the red black tree 

 * 
 */
public class Main {

	public static void main(String args[]) {

		Tree rbt = new RedBlackTree();

		rbt.insert(10);
		rbt.insert(15);
		rbt.insert(13);
	}
}

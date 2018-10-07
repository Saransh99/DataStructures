package com.avlTrees;

/*	AVL trees 

//the balanced bst are the avl trees:- 
//O(logn) time is guranteed

// while we make the bst out of the sorted array we tend to get the time complexity of O(n) which is linear time this is not good as we need to balance the trees 

why avl trees is imp:-

// if we construct a bst from a sorted array this will result in O(n) time this will behave same as the linked list to overcome this condition we use the avl trees which will balance this unbalalnced bst 

where to use the avl trees:-

1. let's say we have a lot of items in the ds the bst will become slower and slower but the avl trees guranteed O(logn) time 

the running time of the bst operation depends on the height of the bst 
// in the avl trees the heights of the 2 child subtrees of any node differ by at most one 
// avl trees are faster than red black trees but the construction time of the avl trees is larger than the red black trees 
// the os in this century uses the red black tree because it is faster to create a balanced bst with the red black tree 

// the insertion operations in the avl tree is same as the bst 
// but in every insertion we need to check if the height of the left subtree and the right subtree should not differ by 1 
// if the diff in the right and the left subtree >1 then we need to make the rotations to make it balanced 
// diff types of the rotations are ll ,rr, lr, rl 
// the time complexity for all the rotations will be logn 

// now we can build a balanced bst with the sorted array as we are making the rotations in while inserting the items in the avl tree 
// that is why we preserve the logn time of the bst
// deletion operation in the avl is also same as the bst 
// max and the min finding is also the same as the bst 

DLEtion in the avl trees:- 
1. when the node is the leaf node
2. when the node has one child 
3. when the node has 2 children(complex)

case3:- is same as the bst where we select the largest node in the left subtree or the min node in the right subtree 
there may be a case after the removala of the node the tree becomes unbalanced 
so we need to check the tree for the avl properties 
 */

public class Main {

	public static void main(String args[]) {
		Tree avl = new AvlTree();
		
		avl.insert(10);
		avl.insert(15);
		avl.insert(5);
		avl.insert(20);
//		avl.insert(50);
//		avl.insert(60);
		
		avl.delete(5);
		avl.traverse();
		
	}
}

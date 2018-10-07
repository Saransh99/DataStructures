package com.binarySearchTree;

public class Tree {

	private TreeNode root;
	
	public void insert(int value) {
		// if we have an empty tree then the value will become the new root 
		if(root==null) {
			root = new TreeNode(value);
		}else {
			root.insert(value);
		}
	}
	
	public TreeNode get(int value) {
		if(root != null) {
			return root.get(value);
		}
		return null;
	}
	
	public void traverseInorder() {
		if(root!= null) {
			root.traverseInorder();
		}
	}
	
	public int min() {
		if(root == null) {
			return Integer.MIN_VALUE;
		}else {
			return root.min();
		}
	}
	
	public int max() {
		if(root ==null) {
			return Integer.MAX_VALUE;
		}else {
			return root.max();
		}
	}
	
	public void delete(int value) {
		root = delete(root, value);// we pass the root of the subTree and the value we want to delete 
	}
	
	// this return the replacement node 
	private TreeNode delete(TreeNode subTreeRoot, int value) {
		// if the tree is empty
		if(subTreeRoot == null) {
			return subTreeRoot;
		}
		// if the value is lesser than the root then we move to the left child of the subtree
		if(value < subTreeRoot.getData()) {
			// then we need to replace the subtree leftchild   with the value we want to delete 	
			subTreeRoot.setLeftchild(delete(subTreeRoot.getLeftchild(), value));
		}
		
		else if(value > subTreeRoot.getData()) {
			subTreeRoot.setRightchild(delete(subTreeRoot.getRightchild(), value));
		}
		// if we have found the node we want to delete 
		else {
			
			// case 1 and 2 node to delet has 0 or 1 children
			if(subTreeRoot.getLeftchild() == null) {
				// if the node has no leftchild and if it has the right child then we replce the nod with the right child  
				return subTreeRoot.getRightchild();
			}
			else {
				if(subTreeRoot.getRightchild() ==null) {
					// if there is no right child and if we have a left child then we replace it with the leftchild 
					return subTreeRoot.getLeftchild();
				}
				// case 3: node to delete has 2 children
				
				subTreeRoot.setData(subTreeRoot.getRightchild().min());
				subTreeRoot.setRightchild(delete(subTreeRoot.getRightchild(), subTreeRoot.getData()));
				
					
			}
		}
		return subTreeRoot;
	}
	
}

package com.binarySearchTree;

public class TreeNode {
	
	private int data;
	private TreeNode leftchild;
	private TreeNode rightchild;
	
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public void insert(int value) {
		if(value==data) {
			return ;  // we don't allow the duplicate value
		}
		
		if(value<data) {
			// if the we don't have a left child then we found our insertion position
			if(leftchild ==null) {
				leftchild = new TreeNode(value);
			}else {
				// if there is a left child then we do the comparison again calling the insertion method recursively
				leftchild.insert(value);
			}
		}// else if the daata is larger than the root then we go to the right of the tree
		else {
			if(rightchild ==null) {
				rightchild = new TreeNode(value);
			}else {
				rightchild.insert(value);
			}
		}
	}
	
	public TreeNode get(int value) {
		if(value == data) {
			return this;
		}
		
		if(value < data) {
			if(leftchild !=null) {
				return leftchild.get(value);
			}
		}else {
			if(rightchild !=null) {
				return rightchild.get(value);
			}
		}
		return null;	
	}
	
	public int min() {
		// if the tree don't have a leftchild then this is the min value
		if(leftchild == null) {
			return data;
		}// if there is leftchild then we traverse the tree recursively
		else {
			return leftchild.min();
		}
	}

	public int max() {
		if(rightchild == null) {
			return data;
		}else {
			return rightchild.max();
		}
	}
	
	
	public void traverseInorder() {
		if(leftchild != null) {
			leftchild.traverseInorder();
		}
		System.out.print(data+ ",");
		if(rightchild != null) {
			rightchild.traverseInorder();
		}
	}
	
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftchild() {
		return leftchild;
	}

	public void setLeftchild(TreeNode leftchild) {
		this.leftchild = leftchild;
	}

	public TreeNode getRightchild() {
		return rightchild;
	}

	public void setRightchild(TreeNode rightchild) {
		this.rightchild = rightchild;
	}
	
	@Override
	public String toString() {
		return "Data: "+ data;
	}
	
}

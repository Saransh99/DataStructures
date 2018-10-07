package com.RedBlackTree;

public class RedBlackTree implements Tree {

	private Node root;

	@Override
	public void traverse() {
		if (root != null) {
			inOrderTraversal(root);
		}
	}

	@Override
	public void insert(int data) {
		Node node =  new Node(data);
		
		root = insertIntoTree(root, node);
		
		fixViolation(node);
	}
	
	private Node insertIntoTree(Node root, Node node) {
		
		if(root == null) return node;
		
		if(node.getData()< root.getData()) {
			root.setLeftChild(insertIntoTree(root.getLeftChild(), node));
			root.getLeftChild().setParent(root);
			
		}else if(node.getData() > root.getData()) {
			root.setRightChild(insertIntoTree(root.getRightChild(), node));
			root.getRightChild().setParent(root);
		}
		
		
		return root;
	}

	private void fixViolation(Node node) {
		
		Node parentNode = null;
		Node grandParentNode = null;
		
		while(node != root && node.getColor() != NodeColor.BLACK && node.getParent().getColor() == NodeColor.RED) {
			
			parentNode = node.getParent();
			grandParentNode = node.getParent().getParent();
			
			if(parentNode == grandParentNode.getLeftChild()) {
				Node uncle = grandParentNode.getRightChild();
				if(uncle != null && uncle.getColor() == NodeColor.RED) {
					grandParentNode.setColor(NodeColor.RED);
					parentNode.setColor(NodeColor.BLACK);
					uncle.setColor(NodeColor.BLACK);
					node = grandParentNode;
					
				}else {
					if(node == parentNode.getRightChild()) {
						leftRotation(parentNode);
						node = parentNode;
						parentNode = node.getParent();
					}
					
					rightRotation(grandParentNode);
					NodeColor tempColor = parentNode.getColor();
					parentNode.setColor(grandParentNode.getColor());
					grandParentNode.setColor(tempColor);
					node = parentNode;
				}
			}else {
				Node uncle = grandParentNode.getLeftChild();
				if(uncle != null && uncle.getColor() == NodeColor.RED) {
					grandParentNode.setColor(NodeColor.RED);
					parentNode.setColor(NodeColor.BLACK);
					uncle.setColor(NodeColor.BLACK);
					node = grandParentNode;
				}else {
					if(node == parentNode.getLeftChild()) {
						rightRotation(parentNode);
						node = parentNode;
						parentNode = node.getParent();
					}
					leftRotation(grandParentNode);
					NodeColor tempColor = parentNode.getColor();
					parentNode.setColor(grandParentNode.getColor());
					grandParentNode.setColor(tempColor);
					node = parentNode;
				}
			}
		}
		// if the root node is red we change it to black
		if(root.getColor() == NodeColor.RED) {
			root.setColor(NodeColor.BLACK);
		}
		
	}
	
	private void rightRotation(Node node) {
		System.out.println("Rotating to the right on node:" + node);
		
		Node tempLeftNode = node.getLeftChild();
		node.setLeftChild(tempLeftNode.getRightChild());
		
		// we have to handle the parent as well 
		if(node.getLeftChild() != null) {
			node.getLeftChild().setParent(node);
		}
		
		tempLeftNode.setParent(node.getParent());
		
		if(tempLeftNode.getParent() == null) {
			root = tempLeftNode;
			
		}else if(node == node.getParent().getLeftChild()) {
			node.getParent().setLeftChild(tempLeftNode);
		}else {
			node.getParent().setRightChild(tempLeftNode);
		}
		
		tempLeftNode.setRightChild(node);
		node.setParent(tempLeftNode);
		
	}
	
	private void leftRotation(Node node) {
		System.out.println("Rotating to the left on node:" + node);
		
		Node tempRightNode = node.getRightChild();
		node.setRightChild(tempRightNode.getLeftChild());
		
		// we have to handle the parent as well 
		if(node.getRightChild() != null) {
			node.getRightChild().setParent(node);
		}
		
		tempRightNode.setParent(node.getParent());
		
		if(tempRightNode.getParent() == null) {
			root = tempRightNode;
			
		}else if(node == node.getParent().getLeftChild()) {
			node.getParent().setLeftChild(tempRightNode);
		}else {
			node.getParent().setRightChild(tempRightNode);
		}
		
		tempRightNode.setLeftChild(node);
		node.setParent(tempRightNode);
		
	}
	
	private void inOrderTraversal(Node node) {
		// inOrder:- left root right
		// so we check for the leftchild
		if (node.getLeftChild() != null) {
			inOrderTraversal(node.getLeftChild());

		}
		
		System.out.println(node+ "=");
		
		if(node.getRightChild() != null) {
			inOrderTraversal(node.getRightChild());
		}
	}
	
	
	
	

}

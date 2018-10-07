package com.splayTrees;

public class SplayTree<T extends Comparable<T>> implements Tree<T> {

	private int size;
	private Node<T> rootNode;

	@Override
	public void insert(T data) {

		Node<T> tempNode = this.rootNode;
		Node<T> parentNode = null;

		while (tempNode != null) {

			parentNode = tempNode;

			if (tempNode.getData().compareTo(data) < 0) {
				tempNode = tempNode.getRightNode();
			} else {
				tempNode = tempNode.getLeftNode();
			}
		}

		tempNode = new Node<T>(data);
		tempNode.setParentNode(parentNode);

		if (parentNode == null) {
			this.rootNode = tempNode;
		} else if (parentNode.getData().compareTo(tempNode.getData()) < 0) {
			parentNode.setRightNode(tempNode);
		} else {
			parentNode.setLeftNode(tempNode);
		}

		splay(tempNode);
		this.size++;
	}

	@Override
	public void inOrderTraversal() {
		if (this.rootNode != null) {
			inOrderTraversal(rootNode);
		}
	}

	private void inOrderTraversal(Node<T> node) {

		if (node.getLeftNode() != null) {
			inOrderTraversal(node.getLeftNode());
		}

		System.out.print(node + " ");

		if (node.getRightNode() != null) {
			inOrderTraversal(node.getRightNode());
		}
	}

	@Override
	public T getMin() {
		if (this.rootNode != null) {
			return getMin(rootNode);
		}

		return null;
	}

	private T getMin(Node<T> node) {

		if (node.getLeftNode() != null) {
			return getMin(node.getLeftNode());
		} else {
			return node.getData();
		}
	}

	@Override
	public T getMax() {
		if (this.rootNode != null) {
			return getMax(rootNode);
		}

		return null;
	}

	private T getMax(Node<T> node) {

		if (node.getRightNode() != null) {
			return getMax(node.getRightNode());
		} else {
			return node.getData();
		}
	}

	public void printRoot() {
		System.out.println(rootNode);
	}

	public boolean isEmpty() {
		return this.rootNode == null;
	}

	public int size() {
		return this.size;
	}

	@Override
	public Node<T> find(T data) {

		Node<T> tempNode = this.rootNode;

		while (tempNode != null) {
			if (tempNode.getData().compareTo(data) < 0) {
				tempNode = tempNode.getRightNode();
			} else if (tempNode.getData().compareTo(data) > 0) {
				tempNode = tempNode.getLeftNode();
			} else {
				splay(tempNode);
				return tempNode;
			}
		}

		splay(tempNode);

		return null;
	}

	private void rotateLeft(Node<T> node) {

		Node<T> tempNode = node.getRightNode();

		if (tempNode != null) {

			node.setRightNode(tempNode.getLeftNode());

			if (tempNode.getLeftNode() != null) {
				tempNode.getLeftNode().setParentNode(node);
			}

			tempNode.setParentNode(node.getParentNode());
		}

		if (node.getParentNode() == null) {
			this.rootNode = tempNode;
		} else if (node == node.getParentNode().getLeftNode()) {
			node.getParentNode().setLeftNode(tempNode);
		} else {
			node.getParentNode().setRightNode(tempNode);
		}

		if (tempNode != null) {
			tempNode.setLeftNode(node);
		}

		node.setParentNode(tempNode);
	}

	private void rotateRight(Node<T> node) {

		Node<T> tempNode = node.getLeftNode();

		if (tempNode != null) {
			node.setLeftNode(tempNode.getRightNode());

			if (tempNode.getRightNode() != null) {
				tempNode.getRightNode().setParentNode(node);
			}

			tempNode.setParentNode(node.getParentNode());
		}

		if (node.getParentNode() == null) {
			this.rootNode = tempNode;
		} else if (node == node.getParentNode().getLeftNode()) {
			node.getParentNode().setLeftNode(tempNode);
		} else {
			node.getParentNode().setRightNode(tempNode);
		}

		if (tempNode != null) {
			tempNode.setRightNode(node);
		}

		node.setParentNode(tempNode);
	}
	
	// aim of the splay is to make the node the root of the tree 
	private void splay(Node<T> node) {
		
		// we have to make some rotations if the node parent is not root 
		while (node.getParentNode() != null) {
			
			// ZIG case :- node is the child of the root 
			if (node.getParentNode().getParentNode() == null) {
				if (node.getParentNode().getLeftNode() == node) {
					rotateRight(node.getParentNode());
				} else { // when the node is the right child of the parent with no grandParent 
					rotateLeft(node.getParentNode());
				}
				// ZIG-ZIG:- Node is the left child of the parent and the parent is also the left child of its parent 
			} else if (node.getParentNode().getLeftNode() == node
					&& node.getParentNode().getParentNode().getLeftNode() == node.getParentNode()) {
				// we make two right rotations
				rotateRight(node.getParentNode().getParentNode());
				rotateRight(node.getParentNode());
				
				// ZAG- ZAG:- node is the right child of the parent and the parent is the right child of its parent  
			} else if (node.getParentNode().getRightNode() == node
					&& node.getParentNode().getParentNode().getRightNode() == node.getParentNode()) {
				// we make 2 left rotations 
				rotateLeft(node.getParentNode().getParentNode());
				rotateLeft(node.getParentNode());
				
				// ZIG-ZAG:- node is the right child of the parent and the parent is the left child of it's parent
			} else if (node.getParentNode().getLeftNode() == node
					&& node.getParentNode().getParentNode().getRightNode() == node.getParentNode()) {
				rotateRight(node.getParentNode());
				rotateLeft(node.getParentNode());
				
				// ZAG-ZIG: node is the left child of its parent and the parent is the right child of its parent 
			} else {
				rotateLeft(node.getParentNode());
				rotateRight(node.getParentNode());
			}
		}
	}
}

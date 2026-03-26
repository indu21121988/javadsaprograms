package com.binary.tree;

public class BSTOperators {
	
	Node root;
	class Node {
		int value;
		Node left;
		Node right;
		Node(int value) {
			this.value = value;
		}
	}
	
	public boolean contains(Node root, int value) {
		while(root != null) {
			if(value == root.value) {
				return true;
			} 
			root = (value < root.value) ? root.left : root.right;	
		}
		return false;
	}

	public Node insert(Node root, int value) {
		Node newNode = new Node(value);
		if(root == null) {
			return newNode;
		}
		if(value < root.value) {
			root = insert(root.left, value);
		} else if(value > root.value) {
			root = insert(root.right, value);
		}
		return root;
	}
	
	public Node delete(Node root, int value) {
		if(root == null) {
			return null;
		}
		
		if(value < root.value) {
			delete(root.left, value);
		} else if(value > root.value) {
			delete(root.right, value);
		} else {
			if(root.left == null) {
				return root.right;
			} 
			if(root.right == null) {
				return root.left;
			} 
		}
		root.value = minValue(root.right);
		root.right = delete(root.right, root.value);
		return root;
	}
	
	private int minValue(Node root) {
		int minValue = root.value;
		while (root.left != null) {
			minValue = root.left.value;
			root = root.left;
		}
		return minValue;
	}
}

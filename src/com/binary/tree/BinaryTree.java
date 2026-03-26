package com.binary.tree;

public class BinaryTree {
	
	Node root;
	class Node {
		int value;
		Node left, right;
		Node(int value) {
			this.value = value;
		}
	}
	
	 public Node sortArrayToBST(int[] array, int start, int end) {
		
		if(start > end) {
			return null;
		}
		
		int mid = (start + end) / 2;
		Node node = new Node(array[mid]);
		
		node.left = sortArrayToBST(array, start, mid-1);
		
		node.right = sortArrayToBST(array, mid+1, end);
		return node;
	}

	 
	void preOrder(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.println(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
		
	}
	
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		int[] array = {1,2,3,4,5,6,7};
		int n = array.length;
		binaryTree.root = binaryTree.sortArrayToBST(array, 0, n-1);
		System.out.println("Preorder traversal of constructed BST:");
		binaryTree.preOrder(binaryTree.root);
		
	}
}

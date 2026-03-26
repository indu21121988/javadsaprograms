package com.binary.tree;

public class ArrayToTree {
	
	Node root;
	class Node {
		int value;
		Node left;
		Node right;
		Node(int value) {
			this.value = value;
		}
	}
	
	public Node sortArraytoTree(int[] array, int left, int right) {
		if(array == null || array.length == 0) {
			return null;
		}
		
		if(left > right) {
			return null;
		}
		
		int mid = (left + right) / 2;
		Node root = new Node(array[mid]);
		
		root.left = sortArraytoTree(array, left, mid-1);
		
		root.right = sortArraytoTree(array, mid+1, right);
		return root;
		
	}
	
	public void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static void main(String[] args) {
		ArrayToTree arrayToTree = new ArrayToTree();
		
		int[] array = {1,3,4,6,7,8};
		arrayToTree.root = arrayToTree.sortArraytoTree(array, 0, array.length -1);
		System.out.println("Preorder traversal of constructed BST:");
		arrayToTree.preOrder(arrayToTree.root);
	}

}

package com.binary.tree;

import java.util.function.Predicate;

public class BalanceCheckTree {

	Node root;
	class Node {
		int value;
		Node left;
		Node right;
		Node(int value) {
			this.value = value;
		}
	}
	
	public Node convertSortArraytoBST(int[] array, int left, int right) {
		if(array == null || array.length == 0) {
			return null;
		}
		
		if(left > right) {
			return null;
		}
		
		int mid = (left + right) / 2;
		Node root = new Node(array[mid]);
		
		root.left = convertSortArraytoBST(array, left, mid-1);
		root.right = convertSortArraytoBST(array, mid+1, right);
		
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
	
	public boolean isBalanced(Node root) {
		return checkHeight(root) != -1;
	}
	
	private int checkHeight(Node node) {
		if(node == null) {
			return 0;
		}
		
		int leftHeight = checkHeight(node.left);
		if(leftHeight == -1) {
			return -1;
		}
		
		int rightHeight = checkHeight(node.right);
		if(rightHeight == -1) {
			return -1;
		}
		
		if(Math.abs(leftHeight - rightHeight) > 1) {
			return -1;
		}
		
		return Math.max(leftHeight, rightHeight) + 1;
		
		
	}
	
	
	public static void main(String[] args) {
		BalanceCheckTree balanceCheckTree = new BalanceCheckTree();
		int[] array = {1,3,5,6,7};
		balanceCheckTree.root = balanceCheckTree.convertSortArraytoBST(array, 0, array.length -1);
		balanceCheckTree.preOrder(balanceCheckTree.root);
		
		boolean balanced = balanceCheckTree.isBalanced(balanceCheckTree.root);
		System.out.println("balanced : " + balanced);
		
	}
}

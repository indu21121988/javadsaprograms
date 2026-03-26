package com.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {
	
	static class Node {
		int value;
		Node left;
		Node right;
		Node(int value) {
			this.value = value;
		}
		
	}
	
	public Node invertNodes(Node root) {
		if(root == null) {
			return null;
		}
		
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		invertNodes(root.left);
		invertNodes(root.right);
		
		return root;
	}
	
	public void printLevelOrder(Node root) {
		if(root == null) {
			return;
		}
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.println(node.value + " ");
			if(node.left != null) {
				queue.add(node.left);
			}
			if(node.right != null) {
				queue.add(node.right);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		InvertTree invertTree = new InvertTree();
		Node root = new Node(4);
		root.left = new Node(5);
		root.right = new Node(6);
		root.left.left = new Node(7);
		root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);
        System.out.println("original tree : ");
        invertTree.printLevelOrder(root);
        invertTree.invertNodes(root);
        System.out.println("invert tree : ");
        invertTree.printLevelOrder(root);
        
        
	}

}

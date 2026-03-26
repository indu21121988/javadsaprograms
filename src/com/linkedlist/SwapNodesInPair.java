package com.linkedlist;

import com.linkedlist.ReverseBetween.Node;

public class SwapNodesInPair {
	
	Node head;
	static class Node {
		int value;
		Node next;
		Node(int value) {
			this.value = value;
			next = null;
		}
	}
	
	public Node swapNodes() {
		Node dummy = new Node(0);
		dummy.next = head;
		Node point = dummy;
		
		while(point.next != null && point.next.next != null) {
			Node first = point.next;
			Node second = point.next.next;
			
			first.next = second.next;
			second.next = first;
			point.next = second;
			
			point = first;
		}
		return dummy.next;
	}
	
	public void printAll(Node finalNode) {
		Node temp = finalNode;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		SwapNodesInPair nodesInPair = new SwapNodesInPair();
		nodesInPair.head = new Node(1);
		nodesInPair.head.next = new Node(3);
		nodesInPair.head.next.next = new Node(2);
		nodesInPair.head.next.next.next = new Node(5);
		
		Node result = nodesInPair.swapNodes();
		nodesInPair.printAll(result);
	}

}

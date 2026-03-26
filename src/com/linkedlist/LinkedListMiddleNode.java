package com.linkedlist;

public class LinkedListMiddleNode {
	
    Node head;
	
	static class Node {
		int value;
		Node next;
		Node(int value) {
			this.value = value;
			next = null;
		}
	}
	
	public Node findMiddleNode() {
		if(head == null) {
			return null;
		}
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static void main(String[] args) {
		
		LinkedListMiddleNode linkedListMiddleNode = new LinkedListMiddleNode();
		linkedListMiddleNode.head = new Node(1);
		linkedListMiddleNode.head.next = new Node(2);
		linkedListMiddleNode.head.next.next = new Node(3);
		linkedListMiddleNode.head.next.next.next = new Node(4);
		linkedListMiddleNode.head.next.next.next.next = new Node(5);
		linkedListMiddleNode.head.next.next.next.next.next = new Node(6);
		
		Node middleNode = linkedListMiddleNode.findMiddleNode();
		System.out.println("middle node : " + middleNode.value);

	}
	

}

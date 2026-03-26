package com.linkedlist;


public class LinkedListHasLoop {
	
	Node head;
	
	static class Node {
		int value;
		Node next;
		Node(int value) {
			this.value = value;
			next = null;
		}	
	}
	
	public boolean hasLoop() {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		
		
		
		return false;
	}
	
	public static void main(String[] args) {
		LinkedListHasLoop linkedListHasLoop = new LinkedListHasLoop();
		linkedListHasLoop.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		linkedListHasLoop.head.next = second;
		second.next = third;
		third.next = second;
		
		System.out.println("has loop" + linkedListHasLoop.hasLoop());
	}

}

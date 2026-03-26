package com.linkedlist;

public class ReverseBetween {

	Node head;
	static class Node {
		int value;
		Node next;
		Node(int value) {
			this.value = value;
			next = null;
		}
	}
	
	public Node reverseBetweenNode(int startIndex, int endIndex) {
		if(head == null || startIndex == endIndex) {
			return head;
		}
		
		Node dummy = new Node(0);
		dummy.next = head;
		Node previous = dummy;
		
		for(int i=0;i<startIndex-1;i++) {
			previous = previous.next;
		}
		
		Node current = previous.next;
		
		for(int i=0;i<endIndex - startIndex; i++) {
			Node nextNode = current.next;
			current.next = nextNode.next;
			nextNode.next = previous.next;
			previous.next = nextNode;
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
		ReverseBetween betweenList = new ReverseBetween();
		betweenList.head = new Node(1);
		betweenList.head.next = new Node(3);
		betweenList.head.next.next = new Node(2);
		betweenList.head.next.next.next = new Node(5);
		
		Node result = betweenList.reverseBetweenNode(1, 4);
		betweenList.printAll(result);
	}
}


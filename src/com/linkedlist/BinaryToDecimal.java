package com.linkedlist;

public class BinaryToDecimal {
	
	Node head;
	static class Node {
		int value;
		Node next;
		Node(int value) {
			this.value = value;
		}
	}
	
	public int binaryToDecimal() {
		Node current = head;
		int decimalvalue = 0;
		while(current != null) {
			decimalvalue = (decimalvalue * 2) + current.value;
			current = current.next;
		}
		return decimalvalue;
	}
	
	public static void main(String[] args) {
		BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
		binaryToDecimal.head = new Node(1);
		binaryToDecimal.head.next = new Node(0);
		binaryToDecimal.head.next.next = new Node(1);
		binaryToDecimal.head.next.next.next = new Node(1);
		
		int val = binaryToDecimal.binaryToDecimal();
		System.out.println(val);
				
	}

}

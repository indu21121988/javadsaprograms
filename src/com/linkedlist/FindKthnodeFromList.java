package com.linkedlist;

public class FindKthnodeFromList {
	
	Node head;
	
	static class Node {
		int value;
		Node next;
		Node(int value) {
			this.value = value;
			next = null;
		}
	}
	
	public Node findKthNode(int k) {
		int count =0;
		Node temp = head;
		if(head == null) {
			return null;
		}
		
		while (temp != null) {
			if(count == k) {
				return temp;
			}
			temp = temp.next;
			count ++;
		}
		return null;
	}
	
	public static void main(String[] args) {
		FindKthnodeFromList findKthnodeFromList = new FindKthnodeFromList();
		findKthnodeFromList.head = new Node(1);
		findKthnodeFromList.head.next = new Node(2);
		findKthnodeFromList.head.next = new Node(3);
		findKthnodeFromList.head.next = new Node(4);
		Node kthnode = findKthnodeFromList.findKthNode(1);
		System.out.println(kthnode.value);
	}

}

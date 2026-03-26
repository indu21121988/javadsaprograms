package com.linkedlist;

public class PartitionLinkedList {
	
	static Node head;
	static class Node {
		int value;
		Node next;
		Node(int value) {
			this.value = value;
			next = null;
		}
	}
	
	public Node partitionList(Node head, int x) {
		Node lessHead = new Node(0);
		Node greadeqHead = new Node(0);
		
		Node less = lessHead;
		Node greateeq = greadeqHead;
		
		//Node temp = head;
		while(head != null) {
			if(head.value < x) {
				less.next = head;
				less = less.next;
			} else {
				greateeq.next = head;
				greateeq = greateeq.next;
			}
			head = head.next;
		}
		greateeq.next = null;
		less.next = greadeqHead.next;
		System.out.println("start node : " + lessHead.next.value);
		return lessHead.next;
	}
	
	public void printAll(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		PartitionLinkedList partitionLinkedList = new PartitionLinkedList();
		partitionLinkedList.head = new Node(5);
		partitionLinkedList.head.next = new Node(3);
		partitionLinkedList.head.next.next = new Node(8);
		partitionLinkedList.head.next.next.next = new Node(1);
		partitionLinkedList.head.next.next.next.next = new Node(10);
		partitionLinkedList.head.next.next.next.next.next = new Node(2);
		
		Node result = partitionLinkedList.partitionList(head, 3);
		partitionLinkedList.printAll(result);
		
	}

}

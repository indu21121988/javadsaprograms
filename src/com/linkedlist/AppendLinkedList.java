package com.linkedlist;

public class AppendLinkedList {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.printLinkedList();
		myLinkedList.removeLast();
		myLinkedList.printLinkedList();
		myLinkedList.prepend(12);
		myLinkedList.printLinkedList();
		myLinkedList.removeFirst();
		myLinkedList.printLinkedList();
		
		myLinkedList.set(2, 10);
		myLinkedList.printLinkedList();
		
		myLinkedList.insert(2, 30);
		myLinkedList.printLinkedList();
		
		myLinkedList.remove(1);
		myLinkedList.printLinkedList();
		
		myLinkedList.reverse();
		myLinkedList.printLinkedList();
		
	}

	
	
	
}



package com.linkedlist;

import java.util.HashSet;

public class RemoveDuplicatesNumbers {
	
	
	Node head;
	Node tail;
	int length;
	
	public RemoveDuplicatesNumbers(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	static class Node {
		int value;
		Node next;
		Node(int value) {
			this.value = value;
			next = null;
		}
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public void printAll() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void removeDuplicatesUsingHashset() {
		HashSet<Integer> numberSet = new HashSet<Integer>();
		Node current = head;
		Node previous = null;
		
		while(current != null) {
			if(numberSet.contains(current.value)) {
				previous.next = current.next;
			} else {
				numberSet.add(current.value);
				previous = current;
			}
			current = current.next;
		}
		
	}
	
	public void removeDuplicatesSortedList() {
		Node current = head;
		while(current != null && current.next !=null) {
			if(current.value == current.next.value) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}

	public void removeDuplicatesUnsortedList() {
		Node ptr1 = head;
		Node ptr2 = null;
		
		while(ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;
			while(ptr2.next != null) {
				if(ptr1.value == ptr2.next.value) {
					ptr2.next = ptr2.next.next;
				} else {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		RemoveDuplicatesNumbers listHashset = new RemoveDuplicatesNumbers(1);
		listHashset.append(2);
		listHashset.append(4);
		listHashset.append(3);
		listHashset.append(2);
		listHashset.removeDuplicatesUsingHashset();
		listHashset.printAll();
		
		System.out.println("---------sorted list-----------");
		RemoveDuplicatesNumbers listSortedList = new RemoveDuplicatesNumbers(5);
		listSortedList.append(6);
		listSortedList.append(6);
		listSortedList.append(7);
		listSortedList.append(8);
		listSortedList.append(8);
		listSortedList.removeDuplicatesSortedList();
		listSortedList.printAll();
		
		System.out.println("---------unsorted list-----------");
		RemoveDuplicatesNumbers listunSortedList = new RemoveDuplicatesNumbers(1);
		listunSortedList.append(2);
		listunSortedList.append(5);
		listunSortedList.append(3);
		listunSortedList.append(4);
		listunSortedList.append(2);
		listunSortedList.removeDuplicatesUnsortedList();
		listunSortedList.printAll();
	}
}

package com.linkedlist;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */
class Node {
    int val;
    Node next;
    Node(int value) {
        this.val = value;
    }


}

public class AddTwoNumbers {

    public static Node addNumbers(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while(list1 != null || list2 != null || carry != 0) {
            int sum = carry;
            if(list1 != null) {
                sum = sum + list1.val;
                list1 = list1.next;
            }

            if(list2 != null) {
                sum = sum + list2.val;
                list2 = list2.next;
            }

            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printNode(Node head) {
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node list1 = new Node(2);
        list1.next = new Node(4);
        list1.next.next = new Node(3);

        Node list2 = new Node(5);
        list2.next = new Node(6);
        list2.next.next = new Node(4);

        Node sumNode = addNumbers(list1, list2);
        printNode(sumNode);
    }


}

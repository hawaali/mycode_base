package com.pratcie.akshay.leetcode;

public class AddTwoNumbersInLL {

	public static void main(String[] args) {

		LLNode head = new LLNode(11);
		head.next = new LLNode(2);
		head.next.next = new LLNode(3);
		head.next.next.next = new LLNode(4);

		int data = 1;             

		head = inseration(head, data);

		printAll(head);
		int afterNode = 3;
		
		head = inseration(head, 10, afterNode);
		
		printAll(head);
	}

	private static LLNode inseration(LLNode head, int data, int afterNode) {
		
		LLNode curr = head;
		//LLNode temp = head;
		
		while(curr != null && curr.data != afterNode) {
			curr = curr.next;
		}
		
		LLNode newNode  = new LLNode(data); // assigned new node 
		newNode.next = curr.next;  //  newNode to the next node attaching saving current.next 
		curr.next = newNode;
		
		
		
		return head;
	}

	private static void printAll(LLNode head) {

		LLNode curr = head;

		while (curr != null) {
			//System.out.println(curr.data);
			curr = curr.next;  //  save next node in curr node 
		}

	}

	private static LLNode inseration(LLNode head, int data) {
		LLNode new_node = new LLNode(data);

		new_node.next = head;  // connect new node next to head

		return new_node;

	}

}

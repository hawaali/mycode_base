package com.pratcie.akshay.leetcode;

public class AddTwoNumWithLL {

	public static void main(String[] args) {

		LLNode first = new LLNode(2);
		first.next = new LLNode(2);
		first.next.next = new LLNode(3);
		// first.next.next.next = new LLNode(4);

		LLNode second = new LLNode(1);
		second.next = new LLNode(2);
		second.next.next = new LLNode(9);
		// second.next.next.next = new LLNode(4);

		LLNode node = addTwoNumbers(first, second);
		
		while(node!= null) {
			System.out.println(node.data);
			node=node.next;
		}

	}
	private static LLNode addTwoNumbers(LLNode first, LLNode second) {
		LLNode node  = new LLNode(0);
		int carry = 0;
		LLNode  head = node;
		while (first != null && second != null) {

			int val = first.data + second.data + carry;
			carry = val / 10;
			node.next = new LLNode(val % 10);
			node = node.next;
			first = first.next;
			second = second.next;

		}		
		while (first!= null) {
			int val = first.data + carry;
			carry = val / 10;
			node.next = new LLNode(val % 10);
			node = node.next;
			first = first.next;
			
		}
		while (second!= null) {
			int val = second.data + carry;
			carry = val / 10;
			node.next = new LLNode(val % 10);
			node = node.next;
			second = second.next;
			
		}
		if(carry!=0) {
			node.next = new LLNode(carry);
			
		}
		return head.next;
	}
}

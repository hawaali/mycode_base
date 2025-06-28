package com.pratcie.akshay.leetcode;

public class DetectCycleInLL {
	
	public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 3 -> 4
        LLNode head = new LLNode(1);
        head.next = new LLNode(3);
        head.next.next = new LLNode(4);
  
        // Create a loop
        head.next.next.next = head.next;

        if (detectLoop(head))
            System.out.println("true");
        else
            System.out.println("false");
    }

	private static boolean detectLoop(LLNode head) {
		
		LLNode slow = head;
		LLNode fast = head;
		while(slow.next!= null && fast.next.next!=null) {
			slow= slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}

}

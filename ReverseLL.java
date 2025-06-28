package com.pratcie.akshay.leetcode;

//Iterative Java program to reverse a linked list


//Given the head of a list, reverse the list and return the
//head of reversed list
class ReverseLL {
  static LLNode reverseList(LLNode head) {
     
  
     LLNode curr = head, prev = null, next;
     // Initialize three pointers: curr, prev and next
     // Traverse all the nodes of Linked List
     while (curr != null) {
         
         // Store next as this node will get slip if we node include this in first step - in advance the node is taking into consideration.
         next = curr.next;
         
         // Reverse current node's next pointer
         curr.next = prev;
         
         //Move pointers one position ahead
         prev = curr;
         
         
         
         curr = next;
         
     }
     
     // Return the head of reversed linked list
     return prev;
 }

 // This function prints the contents
 // of the linked list starting from the head
 static void printList(LLNode node) {
     while (node != null) {
         System.out.print(" " + node.data);
         node = node.next;
     }
 }

 public static void main(String[] args) {

     // Create a hard-coded linked list:
     // 1 -> 2 -> 3 -> 4 -> 5
     LLNode head = new LLNode(1);
     head.next = new LLNode(2);
     head.next.next = new LLNode(3);
     head.next.next.next = new LLNode(4);
     head.next.next.next.next = new LLNode(5);

     System.out.print("Given Linked list:");
     printList(head);
     
     head = reverseList(head);

     System.out.print("\nReversed Linked List:");
     printList(head);
 }
}
package com.pratcie.akshay.leetcode;

public class IdenticalTree {
	
	public static void main(String[] args) {
		
		Node root1 = new Node(2);
		root1.left = new Node(1);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		
		Node root2 = new Node(2);
		root2.left = new Node(1);
		root2.right = new Node(3);
		root2.left.left = new Node(4);
		
		System.out.println(isIdentical(root1, root2));
		
	}

	private static boolean isIdentical(Node root1, Node root2) {
		 if (root1 == null && root2 == null)
	            return true;

	        // If only one tree is empty, they are not identical
	        if (root1 == null || root2 == null)
	            return false;
	        
	        
		return (root1.data == root2.data 
				&& isIdentical(root1.left, root2.left) 
				&& isIdentical(root1.right, root2.right));	
		
	}

}

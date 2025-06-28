package com.pratcie.akshay.leetcode;

public class HightOfTree {
	
	public static void main(String[] args) {
		
		
		Node root = new Node(3);
		root.left = new Node(4);
		root.right = new Node(5);
		root.left.left = new Node(2);
		System.out.println(treeDepth(root));
		
	}
	
	public static int treeDepth(Node root) {
		
		if(root == null) {
			return 0;
		}
		
		int left =  treeDepth(root.left);
		int right = treeDepth(root.right);
		
		int max = Math.max(left, right)+1;
		
		
		
		return max ;
		
		
	}

}

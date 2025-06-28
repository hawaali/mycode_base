package com.pratcie.akshay.leetcode;

import java.util.Stack;

public class SmallestElementFromTheString {
	
	public static void main(String[] args)
    {
        String s = "765028321";// 7 6 5 0 2 8 3 2 1
        //int k = 5;
        System.out.println(removeKdigits(s, 5));
}

	private static char[] removeKdigits(String s, int k) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			char val =  s.charAt(i);
			
			
			while (!stack.isEmpty() &&  k >  0 && val < stack.peek()) {
				
				stack.pop();
				k--;
			}
			
			
			if(val != 0 || !stack.isEmpty() ) {
				
				stack.push(val);
			}
		}
		
		System.out.println(stack);
		
		return null;
	}
}

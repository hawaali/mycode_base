package com.pratcie.akshay.leetcode;

public class MaximumProductSubArray {
	
	public static void main(String[] args) {
		int arr [] = {-2,3,-4};
		int min = arr[0];
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			
			
			
			
			min = Math.max(min*arr[i], arr[i]);
			
			max = Math.max(max, min);
			
			
		}
		
		System.out.println(max);
	}

}

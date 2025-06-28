package com.pratcie.akshay.leetcode;

public class SubarrayWithMaximumProduct {
	
	public static void main(String[] args) {
		int arr [] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			min = Math.max(min + arr[i], arr[i]);
			System.out.println("min-:"+min);
			max = Math.max(max, min);
			System.out.println("max:"+max);
		}
		
		System.out.println(max);
		
	}

}

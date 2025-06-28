package com.pratcie.akshay.leetcode;

import java.util.Arrays;

public class FindKthLargest {
	public static void main(String[] args) {
		int target = 5;
		int[] nums = { 3, 2, 1, 5, 6, 4 };

		Arrays.sort(nums);
		System.out.println();
		//sort and find element the way 
		for(int i=0;i<nums.length;i++) {
			
			System.out.println(nums[i]);
		}
		
	}
}

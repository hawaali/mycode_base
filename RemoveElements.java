package com.pratcie.akshay.leetcode;

public class RemoveElements {
	
	public static void main(String[] args) {
		int arr1 [] = {3,2,2,3};
		int val = 3;
		int count = 0;
		for(int i = 0;i<arr1.length;i++) {
			if(val == arr1[i]) {
				count++;
			}else {
				
			}
		}
		System.out.println(arr1.length-count);
	}
	
	

}

package com.pratcie.akshay.leetcode;

public class ProductExceptSelf {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 3, 5, 6, 2};
		int res = 1;
		for(int val : arr) {
			res= val*res;
		}
		int result [] = new int [30];
		for(int i =0;i<arr.length;i++) {
			result[i]= res/arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(result[i]);
		}
	}

}

package com.pratcie.akshay.leetcode;

public class SecondSmallestElem {
	
	public static void main(String[] args) {
		
		int arr []  = {12, 35, 1, 10, 34, 1};
		
		int max = -1;
		int min = -1;
		for(int i = 0; i<arr.length;i++) {
			
			if(max < arr[i]) {
				max = min;
				min = arr[i];
				
			} else if(arr[i] < max && arr[i] > min) {
				min = arr[i];
			}
			
		}
		System.out.println(max +" "+min);
		
	}

}

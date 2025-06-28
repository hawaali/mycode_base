package com.pratcie.akshay.leetcode;

public class TwoSumII {
	
	public static void main(String[] args) {
		int [] arr =  {-1, 0};
		int target = -1;
		//int [] result;
		int i = 0;
		int j = 1;
		
		for(int k=0;k<arr.length-1;k++) {
			
			for(int m=1;m<arr.length;m++) {
				
				int val = arr[k]+arr[m];
				if(val == target) {
					System.out.println(i+1);
					System.out.println(j+1);
				}
			}
		}
	}

}

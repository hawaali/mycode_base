package com.pratcie.akshay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIndexRet {

	public static void main(String[] args) {

		int arr[] = { 2, 7, 11, 6, 0, 7 };

		int target =9;

		int left = arr.length-1;
		
		int right = 0;
		
		while(left< right ) {
			int val = arr[left]+arr[right];
			if(val == target) {
				System.out.println(left +" "+right);
			}else if(val< target) {
				right--;
				
			}else {
				left++;
			}
		}
	}
}

//this solution did not follow duplicate strategy 

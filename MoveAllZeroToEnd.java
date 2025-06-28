package com.pratcie.akshay.leetcode;

public class MoveAllZeroToEnd {

	
	//great quetions 
	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0};// 12340050
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i ] = arr[count];
				arr[count] = temp;
				count++;
			} 
			
			
			
		}
		for (int val : arr) {
			System.out.println(val);
		}

	}

}

// 

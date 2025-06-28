package com.pratcie.akshay.leetcode;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 2, 4, 5, 3 };
		int result []  ;
		
		for (int i = 0; i < arr.length-1; i++) {

			for (int j = 1; j < arr.length-1; j++) {
				if (arr[j-1] >= arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		for (int val : arr) {
			System.out.println(val);
		}
		System.out.println();

	}

}

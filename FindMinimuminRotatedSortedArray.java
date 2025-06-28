package com.pratcie.akshay.leetcode;

public class FindMinimuminRotatedSortedArray {
	
	
	public static void main(String[] args) {
		int arr [] = {0,1,2,4,5,6,7};
		
		
		int target = 7;
		
		int left = 0;
		int right = arr.length;
		int mid = 0;
		int index =binarySearch(arr, target,  left,right);
		
		
		System.out.println(index);
		
		
	}

	private static int binarySearch(int[] arr, int target, int left, int right) {

		int sum = left + right;
		int mid1 = sum / 2;// 1

		if (arr[mid1] == target) {
			return mid1;

		} else if (arr[mid1] > target) {
			binarySearch(arr, target, left, mid1);
		} else {
			binarySearch(arr, target, mid1, right);
		}

		return mid1;

	}

}

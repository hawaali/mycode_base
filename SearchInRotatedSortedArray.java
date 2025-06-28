package com.pratcie.akshay.leetcode;

public class SearchInRotatedSortedArray {
	
	public static void main(String[] args) {
		int arr [] = {4,5,6,7,0,1,2};
		
		int right = arr.length-1;
		int target = 4;
		int left =0; 
		int index = searchBinaryTree(arr, right, left, target);
		
		System.out.println(index);
		
	}

	private static int searchBinaryTree(int[] arr, int right, int left, int target) {
		
		int mid = right + left;
		mid = mid/2;
		
		if(arr[right] < arr[mid]  && arr[mid] != target) {
			
			searchBinaryTree(arr, mid, left, target);
			
		}else if(arr[right]> arr[mid] && arr[mid] != target) {
			
			searchBinaryTree(arr, right, mid, target);
		}
		
		
		
		return mid;
	}

}

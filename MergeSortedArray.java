package com.pratcie.akshay.leetcode;

public class MergeSortedArray {
	
	public static void main(String[] args) {
		
		int arr1[] = {};
		//int i=0, j=0;
		int arr2[] = {2};
		int arr3 [] = new int[arr1.length];
		int k =0 ;
		int i=0, j=0;
		
		if(arr2.length == 0) {
			arr3 = arr1;
			
			
		} else if (arr1.length == 0) {
			arr3 = arr2;
			
		}
		while(arr1.length > i && k < arr1.length) {
			
			if(arr1[i]<=arr2[j] && arr1[i] != 0) {
				int val = arr1[i];
				arr3[k] = val;
				i++; k++;
			}else {
				int val = arr2[j];
				arr3[k] =  val;
				j++;
				k++;
			}
		
	}
		
		for(int k1 =0;k1<arr3.length;k1++) {
			System.out.println(arr3[k1]);
		}
	}
}

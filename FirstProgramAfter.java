package com.pratcie.akshay.leetcode;

public class FirstProgramAfter {

	public static void main(String[] args) {
		System.out.println("Durga Rajendra Shahu");
		
		int[] nums = {1,1,1,2,2,3};
		int i =0 ;
		for(int e : nums) {
			if(i==0|| i==1 || nums[i-2]!=e ){
				nums[i] = e;
				i=i+1;
			}
			
			
		}
		System.out.println(i);
		for(int e :nums) {
			System.out.println(e);
		}
	}
}

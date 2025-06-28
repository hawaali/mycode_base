package com.pratcie.akshay.leetcode;

public class MajorityElements {
	
	public static void main(String[] args) {
		int [] nums = {1,1,1,2,1,2,1};
	
		int count = 0;
		
		int majority = nums[0];
		for(int i=0; i<nums.length ;i++) {
			
			
			if(nums[i] == majority) {
				count= count+1;
				
			}else {
				count= count-1;
				if(count == 0) {
					majority =  nums[i];
					count=0;
				}
			}
		}
		
		System.out.println(count);
		System.out.println(majority);
	}

}

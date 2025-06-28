package com.pratcie.akshay.leetcode;

public class ValidPalindrome {
	
	public static void main(String[] args) {
		
		String str = "0P";
		if(str.isBlank() || str.isEmpty()) {
			//return 0;
		}
		char[] list =  str.toCharArray();
		String finalStr = "";
		String reversFinalStr = "";
		for(int i=0;i<list.length;i++) {
			char val ;
			//System.out.println(list[i]);
			
			val = list[i];
			if(Character.isAlphabetic(val) || Character.isDigit(val)){
				finalStr =  finalStr+ val;
				System.out.println("--"+finalStr);
				reversFinalStr = val + reversFinalStr;
				System.out.println(reversFinalStr);
			}
			
		}
		
		System.out.println(finalStr.toLowerCase());
		System.out.println(reversFinalStr.toLowerCase());
		
		if(finalStr.toLowerCase().equals(reversFinalStr.toLowerCase()))
		{
			//return true;
		}else {
			//return false;
			System.out.println();
		}
	}

}

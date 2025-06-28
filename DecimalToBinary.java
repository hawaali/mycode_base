package com.pratcie.akshay.leetcode;

public class DecimalToBinary {

	
	public static void main(String[] args) {
		int num = 45;
		
		String val = toBinary(num);
		
		System.out.println(val);
		
		int decimal = toDecimal(val);
		
		System.out.println(decimal);
	}

	private static int toDecimal(String val) {

		char [] arr = val.toCharArray();
		int dec_value = 0;
		int base = 1;
		int v = arr.length - 1;
		for (int i = v; i >= 0; i--) {

			if (arr[i]=='1')
	            dec_value = dec_value+base;
	        base = base * 2;
		}
		return dec_value;
	}

	private static String toBinary(int num) {
		int bin [] = new int[35];
		
		int index = 0 ;
		
		while(num> 0) {
			
			bin[index++] = num % 2;
			num = num/2;
		}
		StringBuilder var = new StringBuilder();
		for(int i = index-1; i >=0;i--) {
			
			var = var.append(String.valueOf(bin[i]));
		}
		return var.toString();
		
	}
}

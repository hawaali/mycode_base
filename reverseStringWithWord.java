package com.pratcie.akshay.leetcode;

public class reverseStringWithWord {

	public static void main(String[] args) {

		String name = " Akshay    Mehetre Arti!" ;
		
		String [] str = name.split("");
		
		for(int i = 0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		String result = "";
		
		int i = 0, j = 0;
		int n = str.length;
		while (i < n && str[i] == " ") {
			
			
			
			i++;
			
		}
		
		j=i+1;
		
		while(j<n && str[j]!= " ") {
			j++;
		}
		
		String w = name.substring(i, j-1);
		
		result = w+ " "+result;
		
		System.out.println(i +"-"+ j);
		
	}
}

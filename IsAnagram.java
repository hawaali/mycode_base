package com.pratcie.akshay.leetcode;

public class IsAnagram {
	
	public static void main(String[] args) {
		
		String s = "ac";
		String t = "bb";
		
		
		//secondAnagram(s, t);	
		
		isAnagram(s, t); 
	}

	private static void secondAnagram(String s, String t) {
		boolean isEqual = true;
		
		char [] s1 = s.toCharArray();
		char [] t1 = t.toCharArray();
		
		if(s.length() != t.length()) {
			isEqual = false ;
		}
		int sum = 0;
		int tum = 0;
		for(int i =0 ;i<s.length();i++) {
			
			sum = sum + s1[i];
			
			System.out.println((int)s1[i]);
			tum = tum + t1[i];
			
			System.out.println((int)t1[i]);
			
		}
		
		if(sum==tum) {
			isEqual =  true;
		}
		
		System.out.println(isEqual);
	}

	private static void isAnagram(String s, String t) {
		boolean isEqual = true;
		 if (s.length() != t.length()) {
			 isEqual = false;
	        }
	        
	        int[] freq = new int[26];
	        for (int i = 0; i < s.length(); i++) {
	            freq[s.charAt(i) - 'a']++;
	            System.out.println(freq[s.charAt(i) - 'a']++); 
	            freq[t.charAt(i) - 'a']--;
	            System.out.println(freq[t.charAt(i) - 'a']--);
	        }
	        
	        for (int i = 0; i < freq.length; i++) {
	            if (freq[i] != 0) {
	             isEqual = false;
	            }
	        }
	        
	      System.out.println(isEqual);
	}

}

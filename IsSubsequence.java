package com.pratcie.akshay.leetcode;

public class IsSubsequence {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		var str = "axc";
		String str1 = "ahbgdc";
		int track = 0;
		char[] a = str.toCharArray();
		char[] b = str1.toCharArray();
		boolean finalVerdict = false;
		StringBuffer  append = new StringBuffer();
		for (int j = 0; j < b.length; j++) {
			if (a[track] == b[j]) {
				append.append(String.valueOf(a[track]));
				track++;
				
			}
		}
		System.out.println(append);
		if(str.equals(append)) {
			finalVerdict = true;
			
		}else {
			finalVerdict = false;
		}
		
		System.out.println(finalVerdict);
	}

}

package com.pratcie.akshay.leetcode;

public class ReverseInt {

	public static void main(String[] args) {

		int num = -123;

		int val = 0;
		while (num != 0) {
			val = num % 10 + val * 10;
			num = num / 10;
		}
		System.out.println(val);

	}
}

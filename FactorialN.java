package com.pratcie.akshay.leetcode;

public class FactorialN {

	public static void main(String[] args) {

		int fact = 3;
		int result = 0;
		result = fact(fact);
		System.out.println(result);
	}

	private static int fact(int fact) {

		if (fact != 1) {
			return fact * fact(fact - 1);
		}
		return fact;
	}
}

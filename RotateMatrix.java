package com.pratcie.akshay.leetcode;

public class RotateMatrix {
	
	public static void main(String[] args) {
		
		
		
		int n = 3;
		int m = 3;
		int it = 1;
		int [] [] arr= new int [m][n];
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = it;
                it++;
            }
        }
		
		print(n, m, arr);
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < m; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		
		System.out.println("----------");
		print(n, m, arr);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length/2;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][n-1-j];
				arr[i][n-1-j] = temp;
			}
		}
		System.out.println("----------");
		print(n, m, arr);

	}

	private static void print(int n, int m, int[][] arr) {
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ("+i+"*"+j+") ");
            System.out.println();
        }
	}

}

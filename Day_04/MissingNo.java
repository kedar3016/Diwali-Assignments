package com.demo;

import java.util.Scanner;

public class MissingNo {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        
	        System.out.println("Enter the Element :");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int sum = n * (n + 1) / 2;
	        int sum1 = 0;

	        for (int num : arr)
	            sum1 += num;

	        int missing = sum - sum1;
	        System.out.println("The missing number is: " + missing);
	}

}

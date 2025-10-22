package com.demo;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		while(n!=0) {
			int temp = n%10;
			sum += temp;
			n = n/10;
		}
		System.out.println("Sum of Digits is : "+sum);

	}

}

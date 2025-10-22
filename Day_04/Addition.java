package com.demo;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Secound Number : ");
		int b = sc.nextInt();
		int sum = a+b;
		
		System.out.println("Addition of "+a+" and "+b+" is : "+sum);

	}

}

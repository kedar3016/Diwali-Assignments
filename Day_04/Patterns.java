package com.demo;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no of row : ");
		int n = sc.nextInt();
		
		for(int  i=0;i<n;i++) {
			for(int j =0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++) {
				System.out.print("*");
			}
			for(int k =0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

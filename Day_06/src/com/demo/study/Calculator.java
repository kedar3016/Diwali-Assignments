package com.demo.study;

import java.util.Scanner;

import com.demo.exceptions.WrongOperatorException;

public class Calculator {
	public static int calculate(int num1, int num2, String op) throws WrongOperatorException  {
		switch(op) {
			case "+" ->{
				return num1 +num2;
			}
			case "-" ->{
				return num1 - num2;
			}
			case "*" ->{
				return num1 * num2;
			}
			case "/" ->{
				return num1 / num2;
			}
			case "%" ->{
				return num1 % num2;
			}
			default ->{
				throw new WrongOperatorException("Invalid Oprerator"+ op);
			}
		}
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.print("Enter first number: ");
		
		int num1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		System.out.print("Enter operator (+, -, *, /, %): ");
		String op = sc.next();

		int result = Calculator.calculate(num1, num2, op);
		System.out.println("Result: " + result);

		}catch (WrongOperatorException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }

	
	}
}

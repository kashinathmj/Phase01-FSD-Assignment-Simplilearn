package com.simplilearn.ArithmeticCalc;

import java.util.Scanner;

public class ArithmeticCalc {

	public static void main(String args[]) {
		int first,second,opt;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Arithmetic Calculator");
		System.out.println("Developed By Kashinath M J");
		
		System.out.println("Enter First Number: ");
		first = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		second = sc.nextInt();
		
		System.out.println("Enter the option to perform:");
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");
		opt = sc.nextInt();
		
		switch(opt) {
			case 1: System.out.println(first + " + " + second + " = " + (first + second));
				break;
			case 2: System.out.println(first + " - " + second + " = " + (first - second));
				break;
			case 3: System.out.println(first + " * " + second + " = " + (first * second));
				break;
			case 4: if(second == 0) {
						System.out.println("Division By zero is Invalid");
					}else {
						System.out.println(first + " / " + second + " = " + (first / second));
					}
					break;
			default: System.out.println("Invalid Option !!");
		}
		
	}
}
package com.JavaProgram;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the dividend :: ");
		int dividend = sc.nextInt();
		System.out.print("Enter the diviser :: ");
		int diviser = sc.nextInt();

		// Computation
		int Quotient = dividend / diviser;
		int Remainder = dividend % diviser;
		
		System.out.println("The Quotient is = " + Quotient);
        System.out.println("The Remainder is = " + Remainder);

	}
}

package com.JavaProgram;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {

		// Get a number through user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number :: ");
		int NUM = sc.nextInt();

		for (int i = 2; i <= NUM; i++) {

			while (NUM % i == 0) {

				System.out.println("Prime Factor :: " + i);
				NUM = NUM / i;
			}
		}

	}
}

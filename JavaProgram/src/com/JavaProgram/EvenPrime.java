package com.JavaProgram;

import java.util.Scanner;

public class EvenPrime {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the NUMBER :: ");
		int NUMBER = sc.nextInt();

		if (NUMBER % 2 == 0) {
			System.out.print("Enter the number is even");
		} else {
			System.out.print("Enter the number is odd");
		}

	}
}

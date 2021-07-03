package com.JavaProgram;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the X :: ");
		int X = sc.nextInt();
		System.out.print("Enter the Y :: ");
		int Y = sc.nextInt();

		// Swap logic
		int Z = X;
		X = Y;
		Y = Z;

		System.out.println("Enter the X :: " + X);
		System.out.println("Enter the Y :: " + Y);

	}

}

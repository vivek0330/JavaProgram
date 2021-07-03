package com.JavaProgram;

import java.util.Scanner;

public class Nth_Harmonic {

	public static void main(String[] args) {
		// variable initialized
		double UPPER_VALUE = 1;
		double ADDITION = 0;

		// Take user input
		int NUM;
		System.out.print("Enter the value :: ");
		Scanner sc = new Scanner(System.in);
		NUM = sc.nextInt();

		// Display the result
		for (int index = 1; index <= NUM; index++) {
			double Divition = UPPER_VALUE / index;
			System.out.println("Division :: " + Divition);
			ADDITION = ADDITION + Divition;
			System.out.println("ADD :: " + ADDITION);
		}
	}

}

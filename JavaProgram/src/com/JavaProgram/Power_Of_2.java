package com.JavaProgram;

import java.util.*;

public class Power_Of_2 {

	static int value = 1;

	public static void main(String[] args) {

		// get a limit from user
		int limit;
		System.out.print("Enter the value :: ");
		Scanner sc = new Scanner(System.in);
		limit = sc.nextInt();

		// Get limit between 0 to less then 31 from user
		if (limit >= 31) {
			System.out.println("Something went wrong !! overflow an int ");
		} else {
			for (int index = 1; index <= limit; index++) {
				value = 2 * value;
				System.out.println("value :: " + value);

			}

		}

	}
}

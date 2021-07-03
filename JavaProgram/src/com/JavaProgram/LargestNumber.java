package com.JavaProgram;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int NUM_1, NUM_2, NUM_3, largest, temp;  
		
		//object of the Scanner class  
		Scanner sc = new Scanner(System.in);
		
		//reading input from the user  
		System.out.print("Enter the first number: ");  
		NUM_1 = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		NUM_2 = sc.nextInt();  
		System.out.print("Enter the third number: ");  
		NUM_3 = sc.nextInt();  
		
		//comparing a and b and storing the largest number in a tempt variable  
		temp=NUM_1>NUM_2?NUM_1:NUM_2;  
		//comparing the tempt variable with c and storing the result in the variable  
		largest=NUM_3>temp?NUM_3:temp;  
		
		//prints the largest number  
		System.out.println("The largest number is: "+largest);  
	}
}

package com.test.oddnumber;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int number = 0;
		boolean result = false;
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter number:: ");
		number = scan.nextInt();
		result = OddNumber.isOdd(number);
		if (result)
			System.out.println(number + " is an odd number");
		else
			System.out.println(number + " is not an odd number");

	}
}

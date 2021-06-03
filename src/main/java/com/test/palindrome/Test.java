package com.test.palindrome;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter a number : ");
		int palindrome = s.nextInt();
		System.out.println("Please Enter a String : ");
		String string = s.next();

		/// checking the Integer numbers to polidrome or not
		PalindromeCheck.isPalindromeNum(palindrome);

		// checking the string is polidrome are not
		PalindromeCheck.isPalindromeString(string);
	}
}

package com.test.palindrome;

import java.util.Scanner;

public class PalindromeCheck {
	public static void isPalindromeNum(int palindrome) {
		int number = palindrome;
		int reverse = 0;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

		if (palindrome == reverse) {
			System.out.println("Number : " + palindrome + " is a palindrome");
		} else {
			System.out.println("Number : " + palindrome + " is not a palindrome");

		}

	}

	// to checking String
	public static void isPalindromeString(String string) {
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		if (string.equalsIgnoreCase(reverse)) {
			System.out.println(string + " geven string is a palindrome");
		} else {
			System.out.println(string + "  geven string is NOT a palindrome");
		}
	}
}

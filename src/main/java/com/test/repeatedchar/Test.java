package com.test.repeatedchar;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = s.next();
		char[] arr = new char[str.length()];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = str.charAt(j);
		}
		char found = NonRepeatedChar.searchchar(str, arr);
		System.out.println("The first non repeated char is " + found);
	}
}

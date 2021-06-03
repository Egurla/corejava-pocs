package com.test.vowel;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {

		System.out.println("Enter :");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		VowelIsPresent.isPresent(str);

	}
}

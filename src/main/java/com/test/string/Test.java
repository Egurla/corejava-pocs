package com.test.string;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String value: ");
		String str = sc.next();
		ReverseString.reverseString(str);
}
}

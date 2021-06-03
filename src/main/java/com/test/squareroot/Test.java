package com.test.squareroot;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.print("Enter any number:");
		Scanner scanner = new Scanner(System.in);
		double num = scanner.nextDouble();
		if (SquareRoot.checkPerfectSquare(num))
			System.out.print(num + " perfect square ");
		else
			System.out.print(num + " not a perfect square ");

	}
}

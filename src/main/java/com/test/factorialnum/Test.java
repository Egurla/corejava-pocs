package com.test.factorialnum;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		System.out.println("Enter number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(FactorialNum.factorialNum(n));
	}

}

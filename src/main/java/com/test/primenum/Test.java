package com.test.primenum;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if (PrimeNumberCheck.isPrimeNumber(num)) {
			System.out.println("prime number is: "+num);
		} else {
			System.out.println(num+" not prime numbers");
		}
	}
}

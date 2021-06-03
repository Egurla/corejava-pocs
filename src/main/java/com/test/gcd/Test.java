package com.test.gcd;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int n1,n2,GCD = 0;
	Scanner	s = new Scanner(System.in);
	System.out.print(" First Value : ");
	n1 = s.nextInt();

	System.out.print(" Second Integer : ");
	n2 = s.nextInt();
		System.out.println(GCDTest.gcdTest(n1,n2,GCD));
		
}
}

package com.test.amstrng;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number=s.nextInt();
		System.out.println("Armstrong number " + Amstrng.is_Amstrong(number));
	
	}

	
}
